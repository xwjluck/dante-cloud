package cn.herodotus.eurynome.rest.configuration;

import cn.herodotus.eurynome.rest.properties.SwaggerProperties;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.SecurityScheme;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.PostConstruct;

/**
 * <p> Description : SwaggerConfiguration </p>
 * <p>
 * 原来的@EnableSwagger2去掉
 *
 * @author : gengwei.zheng
 * @date : 2020/3/31 11:54
 */
@Slf4j
@Configuration
@EnableConfigurationProperties(SwaggerProperties.class)
@EnableOpenApi
public class SwaggerConfiguration {

    @Autowired
    private SwaggerProperties swaggerProperties;

    @PostConstruct
    public void postConstruct() {
        log.debug("[Eurynome] |- Bean [Swagger] Auto Configure.");
    }

    @Bean
    public Docket createRestApi() {
        // 注意此处改动，需要将SWAGGER_2改成OAS_30
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                // 扫描所有有注解的api，用这种方式更灵活
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(swaggerProperties.getTitle())
                .description(swaggerProperties.getDescription())
                .version("1.0")
                .build();
    }

    /***
     * oauth2配置
     * 需要增加swagger授权回调地址
     * http://localhost:8888/webjars/springfox-swagger-ui/o2c.html
     * @return
     */
    @Bean
    SecurityScheme securityScheme() {
        return new ApiKey("BearerToken", "Authorization", "header");
    }
}