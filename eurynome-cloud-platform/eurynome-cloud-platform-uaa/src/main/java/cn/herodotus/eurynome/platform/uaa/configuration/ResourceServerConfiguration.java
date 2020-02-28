package cn.herodotus.eurynome.platform.uaa.configuration;

import cn.herodotus.eurynome.component.security.web.access.ArtisanAccessDeniedHandler;
import cn.herodotus.eurynome.component.security.web.authentication.ArtisanAuthenticationEntryPoint;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.authentication.BearerTokenExtractor;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.web.authentication.logout.CookieClearingLogoutHandler;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ResourceServerConfigurerAdapter 用于保护 OAuth2 要开放的资源，同时主要作用于client端以及token的认证(Bearer Auth)，
 * 由于后面 OAuth2 服务端后续还需要提供用户信息，所以也是一个 Resource Server，
 * 默认拦截了所有的请求，也可以通过重新方法方式自定义自己想要拦截的资源 URL 地址
 *
 * @author gengwei.zheng
 */
@Order(6)
@Slf4j
@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

    @Autowired
    private TokenStore tokenStore;

    private BearerTokenExtractor tokenExtractor = new BearerTokenExtractor();

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
                .and()
                .authorizeRequests()
                .antMatchers("/login/**", "/oauth/**", "/hello/**").permitAll()
                .requestMatchers(EndpointRequest.toAnyEndpoint()).permitAll()
                .anyRequest().authenticated()
                .and().formLogin().loginPage("/login").permitAll()
                .and().logout().permitAll()
                .addLogoutHandler(new CookieClearingLogoutHandler("token", "remember-me"))
                .logoutSuccessHandler(new LogoutSuccessHandler())
                .and() // 认证鉴权错误处理,为了统一异常处理。每个资源服务器都应该加上。
                .exceptionHandling()
                .accessDeniedHandler(new ArtisanAccessDeniedHandler())
                .authenticationEntryPoint(new ArtisanAuthenticationEntryPoint())
                .and().csrf().disable()
                .httpBasic().disable(); // 禁用httpBasic
    }


    public class LogoutSuccessHandler extends SimpleUrlLogoutSuccessHandler {
        public LogoutSuccessHandler() {
            // 重定向到原地址
            this.setUseReferer(true);
        }

        @Override
        public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
            try {
                // 解密请求头
                authentication = tokenExtractor.extract(request);
                if (authentication != null && authentication.getPrincipal() != null) {
                    String tokenValue = authentication.getPrincipal().toString();
                    log.debug("[Luban] |- RevokeToken tokenValue:{}", tokenValue);
                    // 移除token
                    tokenStore.removeAccessToken(tokenStore.readAccessToken(tokenValue));
                }
            } catch (Exception e) {
                log.error("[Luban] |- RevokeToken error:{}", e);
            }
            super.onLogoutSuccess(request, response, authentication);
        }
    }
}
