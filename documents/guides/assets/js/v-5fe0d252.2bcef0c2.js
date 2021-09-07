"use strict";(self.webpackChunkeurynome_cloud_document=self.webpackChunkeurynome_cloud_document||[]).push([[188],{3133:(e,d,t)=>{t.r(d),t.d(d,{data:()=>l});const l={key:"v-5fe0d252",path:"/documents/%E9%A1%B9%E7%9B%AE%E4%BB%8B%E7%BB%8D.html",title:"项目介绍",lang:"zh-CN",frontmatter:{},excerpt:"",headers:[{level:2,title:"工程结构",slug:"工程结构",children:[{level:3,title:"后端工程结构",slug:"后端工程结构",children:[]}]},{level:2,title:"核心技术",slug:"核心技术",children:[{level:3,title:"后端核心技术",slug:"后端核心技术",children:[]},{level:3,title:"前端核心技术",slug:"前端核心技术",children:[]}]},{level:2,title:"版本关系",slug:"版本关系",children:[{level:3,title:"组件版本关系",slug:"组件版本关系",children:[]},{level:3,title:"毕业版本关系(推荐使用)",slug:"毕业版本关系-推荐使用",children:[]}]},{level:2,title:"功能介绍",slug:"功能介绍",children:[{level:3,title:"[1]、统一安全认证中心",slug:"_1-、统一安全认证中心",children:[]},{level:3,title:"[2]、统一服务访问网关",slug:"_2-、统一服务访问网关",children:[]},{level:3,title:"[3]、微服务架构支撑",slug:"_3-、微服务架构支撑",children:[]},{level:3,title:"[4]、微服务运行监控",slug:"_4-、微服务运行监控",children:[]},{level:3,title:"[5]、数据自动化处理",slug:"_5-、数据自动化处理",children:[]},{level:3,title:"[6]、服务开发支撑",slug:"_6-、服务开发支撑",children:[]},{level:3,title:"[7]、信息发送集成",slug:"_7-、信息发送集成",children:[]},{level:3,title:"[8]、内容审核集成",slug:"_8-、内容审核集成",children:[]}]}],filePathRelative:"documents/项目介绍.md",git:{updatedTime:1631030613e3,contributors:[{name:"herodotus",email:"pointer_v@qq.com",commits:2}]}}},9735:(e,d,t)=>{t.r(d),t.d(d,{default:()=>o});const l=(0,t(6252).uE)('<h1 id="项目介绍" tabindex="-1"><a class="header-anchor" href="#项目介绍" aria-hidden="true">#</a> 项目介绍</h1><h2 id="工程结构" tabindex="-1"><a class="header-anchor" href="#工程结构" aria-hidden="true">#</a> 工程结构</h2><h3 id="后端工程结构" tabindex="-1"><a class="header-anchor" href="#后端工程结构" aria-hidden="true">#</a> 后端工程结构</h3><div class="language-text ext-text line-numbers-mode"><pre class="language-text"><code>eurynome-cloud\n├── configurations -- 配置文件脚本和统一Docker build上下文目录\n├── dependencies -- 工程Maven顶级依赖，统一控制版本和依赖\n├── documents -- 工程相关文档（会逐步清理，统一采用Gitee Wiki）\n├── packages -- 基础通用依赖包\n├    ├── eurynome-cloud-assistant -- Spring相关公共辅助工具、注解相关工具代码组件\n├    ├── eurynome-cloud-common -- 公共工具类\n├    ├── eurynome-cloud-data -- 数据持久化、数据缓存以及Redis等数据处理相关代码组件\n├    ├── eurynome-cloud-kernel -- 微服务接入平台必备组件\n├    ├── eurynome-cloud-oauth -- OAuth2通用代码\n├    ├── eurynome-cloud-oauth-starter -- 自定义OAuth2 Starter，Athena单体版核心Starter\n├    ├── eurynome-cloud-rest -- Rest相关代码组件\n├    ├── eurynome-cloud-sercurity -- Security通用代码\n├    └── eurynome-cloud-starter -- 微服务核心Starter\n├── platform -- 平台核心服务\n├    ├── eurynome-cloud-gateway -- 服务网关\n├    ├── eurynome-cloud-management -- Spring Boot Admin 监控服务\n├    └── eurynome-cloud-uaa -- 统一认证模块\n├── services -- 平台业务服务\n├    ├── eurynome-cloud-upms-api -- 通用用户权限api \n├    ├── eurynome-cloud-upms-logic -- 通用用户权限service\n├    ├── eurynome-cloud-upms-rest -- 通用用户权限rest 接口\n├    ├── eurynome-cloud-upms-ability -- 通用用户权限服务\n└──  └── eurynome-cloud-bpmn-ability -- 工作流服务 \n</code></pre><div class="line-numbers"><span class="line-number">1</span><br><span class="line-number">2</span><br><span class="line-number">3</span><br><span class="line-number">4</span><br><span class="line-number">5</span><br><span class="line-number">6</span><br><span class="line-number">7</span><br><span class="line-number">8</span><br><span class="line-number">9</span><br><span class="line-number">10</span><br><span class="line-number">11</span><br><span class="line-number">12</span><br><span class="line-number">13</span><br><span class="line-number">14</span><br><span class="line-number">15</span><br><span class="line-number">16</span><br><span class="line-number">17</span><br><span class="line-number">18</span><br><span class="line-number">19</span><br><span class="line-number">20</span><br><span class="line-number">21</span><br><span class="line-number">22</span><br><span class="line-number">23</span><br><span class="line-number">24</span><br></div></div><h2 id="核心技术" tabindex="-1"><a class="header-anchor" href="#核心技术" aria-hidden="true">#</a> 核心技术</h2><h3 id="后端核心技术" tabindex="-1"><a class="header-anchor" href="#后端核心技术" aria-hidden="true">#</a> 后端核心技术</h3><h4 id="_1-spring相关核心技术及版本" tabindex="-1"><a class="header-anchor" href="#_1-spring相关核心技术及版本" aria-hidden="true">#</a> （1）Spring相关核心技术及版本</h4><table><thead><tr><th>组件</th><th>版本</th></tr></thead><tbody><tr><td><code>Spring Boot</code></td><td>2.5.4</td></tr><tr><td><code>Spring Cloud</code></td><td>2020.0.3</td></tr><tr><td><code>Spring Cloud Alibaba</code></td><td>2021.1</td></tr><tr><td><code>Spring Boot Admin</code></td><td>2.5.1</td></tr><tr><td><code>Nacos</code></td><td>2.0.3</td></tr><tr><td><code>Sentinel</code></td><td>1.8.0</td></tr><tr><td><code>Seata</code></td><td>1.3.0</td></tr></tbody></table><h4 id="_2-涉及的相关的技术" tabindex="-1"><a class="header-anchor" href="#_2-涉及的相关的技术" aria-hidden="true">#</a> （2）涉及的相关的技术</h4><ul><li>持久层框架： <code>Spring Data Jpa</code> &amp; <code>Mybatis Plus</code></li><li>API网关：<code>Spring Cloud Gateway</code></li><li>服务注册&amp;发现和配置中心: <code>Alibaba Nacos</code></li><li>服务消费：<code>Spring Cloud OpenFeign</code> &amp; <code>RestTemplate</code> &amp; <code>OkHttps</code></li><li>负载均衡：<code>Spring Cloud Loadbalancer</code></li><li>服务熔断&amp;降级&amp;限流：<code>Alibaba Sentinel</code></li><li>服务监控：<code>Spring Boot Admin</code></li><li>消息队列：使用 <code>Spring Cloud</code> 消息总线 <code>Spring Cloud Bus</code> 默认 <code>Kafka</code> 适配<code>RabbitMQ</code></li><li>链路跟踪：<code>Skywalking</code></li><li>分布式事务：<code>Seata</code></li><li>数据缓存：<code>JetCache</code> + <code>Redis</code> + <code>Caffeine</code></li><li>数据库： <code>Postgresql</code>，<code>MySQL</code>，<code>Oracle</code> ...</li><li>JSON序列化：<code>Jackson</code> &amp; <code>FastJson</code></li><li>文件服务：阿里云OSS/<code>Minio</code></li><li>数据调试：<code>p6spy</code></li><li>日志中心：<code>ELK</code></li><li>日志收集：<code>Logstash Logback Encoder</code></li></ul><h3 id="前端核心技术" tabindex="-1"><a class="header-anchor" href="#前端核心技术" aria-hidden="true">#</a> 前端核心技术</h3><ul><li>Vue2</li><li>Vuex</li><li>Vue-router</li><li>Vue-cli</li><li>Axios</li><li>Vuetify</li><li>Bpmn.js</li><li>Localforage</li></ul><h2 id="版本关系" tabindex="-1"><a class="header-anchor" href="#版本关系" aria-hidden="true">#</a> 版本关系</h2><h3 id="组件版本关系" tabindex="-1"><a class="header-anchor" href="#组件版本关系" aria-hidden="true">#</a> 组件版本关系</h3><table><thead><tr><th>Spring Cloud Alibaba Version</th><th>Sentinel Version</th><th>Nacos Version</th><th>RocketMQ Version</th><th>Dubbo Version</th><th>Seata Version</th></tr></thead><tbody><tr><td>2.2.6.RELEASE</td><td>1.8.1</td><td>1.4.2</td><td>4.4.0</td><td>2.7.8</td><td>1.3.0</td></tr><tr><td>2021.1 or 2.2.5.RELEASE or 2.1.4.RELEASE or 2.0.4.RELEASE</td><td>1.8.0</td><td>1.4.1</td><td>4.4.0</td><td>2.7.8</td><td>1.3.0</td></tr><tr><td>2.2.3.RELEASE or 2.1.3.RELEASE or 2.0.3.RELEASE</td><td>1.8.0</td><td>1.3.3</td><td>4.4.0</td><td>2.7.8</td><td>1.3.0</td></tr><tr><td>2.2.1.RELEASE or 2.1.2.RELEASE or 2.0.2.RELEASE</td><td>1.7.1</td><td>1.2.1</td><td>4.4.0</td><td>2.7.6</td><td>1.2.0</td></tr><tr><td>2.2.0.RELEASE</td><td>1.7.1</td><td>1.1.4</td><td>4.4.0</td><td>2.7.4.1</td><td>1.0.0</td></tr><tr><td>2.1.1.RELEASE or 2.0.1.RELEASE or 1.5.1.RELEASE</td><td>1.7.0</td><td>1.1.4</td><td>4.4.0</td><td>2.7.3</td><td>0.9.0</td></tr><tr><td>2.1.0.RELEASE or 2.0.0.RELEASE or 1.5.0.RELEASE</td><td>1.6.3</td><td>1.1.1</td><td>4.4.0</td><td>2.7.3</td><td>0.7.1</td></tr></tbody></table><h3 id="毕业版本关系-推荐使用" tabindex="-1"><a class="header-anchor" href="#毕业版本关系-推荐使用" aria-hidden="true">#</a> 毕业版本关系(推荐使用)</h3><table><thead><tr><th>Spring Cloud Version</th><th>Spring Cloud Alibaba Version</th><th>Spring Boot Version</th></tr></thead><tbody><tr><td>Spring Cloud 2020.0.1</td><td>2021.1</td><td>2.4.2</td></tr><tr><td>Spring Cloud Hoxton.SR9</td><td>2.2.6.RELEASE</td><td>2.3.2.RELEASE</td></tr><tr><td>Spring Cloud Greenwich.SR6</td><td>2.1.4.RELEASE</td><td>2.1.13.RELEASE</td></tr><tr><td>Spring Cloud Hoxton.SR3</td><td>2.2.1.RELEASE</td><td>2.2.5.RELEASE</td></tr><tr><td>Spring Cloud Hoxton.RELEASE</td><td>2.2.0.RELEASE</td><td>2.2.X.RELEASE</td></tr><tr><td>Spring Cloud Greenwich</td><td>2.1.2.RELEASE</td><td>2.1.X.RELEASE</td></tr><tr><td>Spring Cloud Finchley</td><td>2.0.4.RELEASE(停止维护，建议升级)</td><td>2.0.X.RELEASE</td></tr><tr><td>Spring Cloud Edgware</td><td>1.5.1.RELEASE(停止维护，建议升级)</td><td>1.5.X.RELEASE</td></tr></tbody></table><h2 id="功能介绍" tabindex="-1"><a class="header-anchor" href="#功能介绍" aria-hidden="true">#</a> 功能介绍</h2><h3 id="_1-、统一安全认证中心" tabindex="-1"><a class="header-anchor" href="#_1-、统一安全认证中心" aria-hidden="true">#</a> [1]、统一安全认证中心</h3><ul><li><strong>OAuth2 安全认证</strong>：</li></ul><p>支持 <code>OAuth2</code> 授权码模式、隐式授权码模式（简单模式）、密码模式和客户端模式四种登录模式</p><ul><li><strong>JWT Token令牌</strong>：</li></ul><p>采用JWT对OAuth2 Token进行加密</p><ul><li><strong>自定义OAuth2页面</strong>：</li></ul><p>自定义<code>OAuth2</code> login、confirm、error页面，提升系统使用用户体验。可结合自身需求进行修改。</p><ul><li><strong>OAuth2 登录验证码</strong>：</li></ul><p><code>OAuth2</code>登录增加验证码保护，支持gif、中文、算数等类型，可通过配置进行修改以及是否显示验证码控制</p><ul><li><strong>OAuth2登录数据加密传输</strong>：</li></ul><p>基于AES对 <code>OAuth2</code> 登录数据进行动态加密传输，可通过配置对表单参数名进行动态配置，提升系统安全性</p><ul><li><strong>平台权限管理</strong>：</li></ul><p>基于RBAC模型，以角色和接口为核心，使用统一逻辑实现<code>@PreAuthorize</code>注解权限与<code>URL</code>权限的全面整合及动态可配置化。统一平台接口白名单，IP地址白名单，以及Scope绑定URL的管理。无须配置Security权限注解，支持URL粒度的鉴权和用户权限的动态配置。 完美支持单体式架构、UPMS自身应用需求、分布式架构以及分布式各服务多实例等各种应用场景。</p><ul><li><strong>User、Client数据策略访问</strong>：</li></ul><p>支持<code>OAuth2</code> <code>UserDetails</code>、<code>ClientDetails</code>数据直连数据库和<code>Feign</code>两种数据获取策略模式，<code>OAuth2</code>直连数据库性能更优，<code>Feign</code>访问数据服务独立可动态扩展。可通过配置动态修改具体采用哪种策略。</p><ul><li><strong>手机短信验证码注册和登录</strong>：</li></ul><p>支持通过手机验证码登录认证，与平台为统一体系，统一返回<code>OAuth2</code> Token，支持服务接口鉴权</p><ul><li><strong>第三方系统社交注册和登录</strong>：</li></ul><p>基于 <code>JustAuth</code> 实现第三方系统社交登录认证，，与平台为统一体系，统一返回 <code>OAuth2</code> Token，支持服务接口鉴权，。所有 <code>JustAuth</code> 支持的第三方系统均支持。</p><ul><li><strong>微信小程序注册和登录</strong>：</li></ul><p>支持微信小程序登录认证，与平台为统一体系，统一返回 <code>OAuth2</code> Token，支持服务接口鉴权。</p><ul><li><strong>其它注册和登录</strong>：</li></ul><p>采用策略模式对外部登录和注册进行支持，目前未支持的登录，可参考标准，动态扩展，即可支持。</p><h3 id="_2-、统一服务访问网关" tabindex="-1"><a class="header-anchor" href="#_2-、统一服务访问网关" aria-hidden="true">#</a> [2]、统一服务访问网关</h3><ul><li><strong>网关动态路由</strong>：</li></ul><p>基于<code>Gateway</code>和<code>Nacos</code>实现服务网关动态路由，无须增加任何配置，即可支持服务的发现与路由</p><ul><li><p><strong>网关服务鉴权</strong>： 服务网关集成部分权限认证功能，提升系统安全性，降低平台压力</p></li><li><p><strong>网关服务限流</strong>：</p></li></ul><p>基于Sentinel实现服务的限流，支持基于Gateway Filter的自定义限流</p><ul><li><p><strong>动态文档聚合</strong>： 网关动态<code>Swagger</code>文档聚合，使用<code>Swagger 3.0</code>，支持<code>Knife4j</code>增强。不同环境访问控制</p></li><li><p><strong>统一跨域处理</strong>：</p></li></ul><p>基于<code>Gateway</code>实现统一跨域处理</p><ul><li><strong>统一错误处理</strong>：</li></ul><p>平台统一错误处理，支持自定义错误码体系</p><ul><li><strong>自定义动态路由</strong>：</li></ul><p>支持基于DB的动态路由管理与路由规则配置</p><h3 id="_3-、微服务架构支撑" tabindex="-1"><a class="header-anchor" href="#_3-、微服务架构支撑" aria-hidden="true">#</a> [3]、微服务架构支撑</h3><ul><li><strong>服务注册发现</strong>：</li></ul><p>基于<code>Nacos</code>实现服务的注册与发现。</p><ul><li><strong>服务负载均衡</strong>：</li></ul><p><code>Spring Cloud Netflix</code> 停止维护，使用 <code>Spring Cloud Loadbalancer</code> 全面替换<code>Ribbon</code>。</p><ul><li><strong>服务熔断降级</strong>：</li></ul><p>整合<code>OpenFeign</code>和<code>Sentinel</code>，从熔断降级、系统负载保护、热点防护等多个维度来保障微服务的稳定性</p><ul><li><strong>统一配置中心</strong>：</li></ul><p>基于 <code>Nacos</code> 搭建的统一配置中心，支持配置文件自动导入和关键信息加密，可根据文件夹名称自动分组配置。</p><ul><li><strong>统一日志中心</strong>：</li></ul><p>采用TCP直连的方式采集和发送日志，集成 <code>Skywalking</code> <code>TraceID</code> 实现日志聚合及ELK日志分析。通过 <code>@EnableXXX</code> 注解开启或关闭日志采集功能。</p><ul><li><strong>分布任务调度</strong>：</li></ul><p>极简集成 <code>xxl-job</code>，支持分布式任务调度功能</p><ul><li><strong>分布事务处理</strong>：</li></ul><p>集成 <code>Seata</code>，支持分布式事务，无代码侵入，灵活便捷</p><ul><li><strong>分布对象存储</strong>：</li></ul><p>支持 <code>Minio</code> 分布式对象存储。同时，集成阿里云OSS，可通过 <code>@EnableXXX</code> 注解开启或关闭功能。</p><ul><li><strong>分布式工作流</strong>：</li></ul><p>以 <code>Camunda</code> 引擎为基础定义分布式工作流引擎，提供自研人事信息管理以及人事管理体系与工作流用户体系的实时集成</p><h3 id="_4-、微服务运行监控" tabindex="-1"><a class="header-anchor" href="#_4-、微服务运行监控" aria-hidden="true">#</a> [4]、微服务运行监控</h3><ul><li><strong>服务调用链监控</strong>：</li></ul><p>集成 <code>Skywalking</code> 进行服务调用链的监控，调用链监控深度可延伸至<code>Undertow</code>、数据库、<code>Redis</code></p><ul><li><strong>应用吞吐量监控</strong>：</li></ul><p>集成 <code>Skywalking</code> 进行应用吞吐量监控</p><ul><li><strong>熔断、降级监控</strong>：</li></ul><p>集成 <code>Sentinel</code> 进行服务的熔断、降级监控</p><ul><li><strong>微服务状态监控</strong>：</li></ul><p>集成 <code>Spring Boot Admin</code> 进行服务运行状态的监控</p><h3 id="_5-、数据自动化处理" tabindex="-1"><a class="header-anchor" href="#_5-、数据自动化处理" aria-hidden="true">#</a> [5]、数据自动化处理</h3><ul><li><strong>数据模型初始化</strong>：</li></ul><p><code>RBAC</code>、<code>OAuth2</code> 部分核心表、<code>Camunda</code> 数据表，在初始部署过程中为自动化创建</p><ul><li><strong>核心应用数据初始化</strong>：</li></ul><p><code>RBAC</code>、<code>OAuth2</code> 等核心数据，在初始部署过程中为自动化导入</p><ul><li><strong>URL权限数据动态汇总</strong>：</li></ul><p>自动扫描URL接口作为权限汇总存入系统，根据URL相关信息生成唯一ID，多次导入数据不会重复。可通过配置动态开启或修改扫描内容</p><ul><li><strong>Yml配置自动导入</strong>：</li></ul><p>服务所需使用的配置文件，可自动根据文件夹进行分组并导入到 <code>Nacos</code> 中。</p><h3 id="_6-、服务开发支撑" tabindex="-1"><a class="header-anchor" href="#_6-、服务开发支撑" aria-hidden="true">#</a> [6]、服务开发支撑</h3><ul><li><strong>通用CRUD封装</strong>：</li></ul><p>各种类型的代码生成器较多，结合实际应用使用效果来看，代码生成器在实际开发中使用频率低于理想预期。因此，没有考虑提供代码生成器，而是对常规的CRUD进行了多层次的封装，使定制化服务的开发更加便捷。</p><ul><li><strong>自研两级缓存封装</strong>：</li></ul><p>自研基于 <code>Caffeine</code> 和 <code>Redis</code> 分布式两级缓存,完美支持JPA Hibernate二级缓存,完美支持各类查询数据缓存以及JPA <code>@ManyToMany</code>, <code>@ManyToOne</code>等关联查询。实现基于<code>Caffeine</code> 的 <code>Hibernate</code> 二级缓存，可与自研两级缓存快速切换，仅使用本地缓存创建Key繁琐和分页数据无法更新的问题</p><ul><li><strong>多类型数据库支持</strong>：</li></ul><p>默认采用 <code>PostgreSQL</code> 数据库，支持 <code>MySQL</code>、<code>Oracle</code>、<code>H2</code>等多种关系型数据库，无须修改代码可动态切换。数据层同时支持 <code>Spring Data Jpa</code> 和 <code>Mybatis Plus</code></p><ul><li><strong>多消息队列支持</strong>：</li></ul><p>适配 <code>RabbitMQ</code> 和 <code>Kafka</code>，默认使用 <code>Kafka</code>，支持消息总线(<code>Spring Cloud Bus</code>)</p><ul><li><strong>多种服务调用方式</strong>：</li></ul><p>默认采用 <code>OpenFeign</code> 进行服务间调用，支持 <code>RestTemplate</code> 和 <code>OkHttps</code></p><ul><li><strong>共享式多环境切换</strong>：</li></ul><p>共享式、统一化多环境配置模式，Yml、Docker均采用此方式配置，避免类似的服务配置、Dockerfile配置导出复制和修改的问题</p><ul><li><strong>多团队开发管理</strong>：</li></ul><p>支持多团队开发，可针对各个团队开发服务，进行单独的授权配置。</p><ul><li><strong>注解模型模块模式</strong>：</li></ul><p>除必要依赖逻辑以及强注入顺序要求的模块采用 <code>Spring SPI</code>（spring.factories）机制外，其它功能模块均采用 <code>@EnableXXX</code> 注解编程模型，可选择性进行控制是否开启对应模块，减少不必要的依赖注入和启动。</p><ul><li><strong>代码打包记录查询</strong>：</li></ul><p>对代码编译信息进行记录，可查询代码版本以及编译时间等相关信息，方便运维人员更好的掌握代码信息。</p><ul><li><strong>人事信息管理</strong>：</li></ul><p>除已有的用户体系外，集成单位、部门、人员等人事管理功能，满足大多数人事管理场景，并与 <code>Camunda</code> 工作流用户体系无缝整合，实现数据实时同步。</p><h3 id="_7-、信息发送集成" tabindex="-1"><a class="header-anchor" href="#_7-、信息发送集成" aria-hidden="true">#</a> [7]、信息发送集成</h3><ul><li><strong>微信小程序订阅消息</strong>：</li></ul><p>支持微信小程序订阅消息发送。提供订阅消息模版工厂，可根据自身业务需求，编写少量代码既可以拓展支持新订阅消息模版。</p><ul><li><strong>极光消息推送集成</strong>：</li></ul><p>集成极光消息推送，对极光后台API进行封装，封装度高、调用方便，可快速与自定义业务需求整合，通过 <code>@EnableXXX</code> 注解开启或关闭。</p><ul><li><strong>环信消息集成</strong>：</li></ul><p>集成环信IM和消息推送，使用更加便捷，可在应用中根据自定义需求快速整合和拓展IM，发送手机推送消息。通过 <code>@EnableXXX</code> 注解开启或关闭。</p><ul><li><strong>多通道SMS集成</strong>：</li></ul><p>集成阿里、百度、中国移动、华为、京东、极光、网易、七牛、腾讯、又拍、云片等平台短信发送通道。可通过配置动态选择具体使用通道。支持多模版定义以及模版参数顺序控制</p><h3 id="_8-、内容审核集成" tabindex="-1"><a class="header-anchor" href="#_8-、内容审核集成" aria-hidden="true">#</a> [8]、内容审核集成</h3><ul><li><strong>阿里云内容审核</strong>：</li></ul><p>集成阿里云内容审核，支持文本、图片、音频、视频、网页内容审核，支持同步审核、异步审核、异步 <code>Callback</code> 方式审核通过 <code>@EnableXXX</code> 注解开启或关闭。</p><ul><li><strong>微信小程序内容审核</strong>：</li></ul><p>集成微信小程序内容审核，支持文本、图片、音频内容审核，支持同步、异步审核。通过 <code>@EnableXXX</code> 注解开启或关闭。</p><ul><li><strong>百度证照识别</strong>：</li></ul><p>集成百度证照审核，支持营业执照、身份证 <code>OCR</code> 识别。通过 <code>@EnableXXX</code> 注解开启或关闭。</p><ul><li><strong>天眼查企业信息查询</strong>：</li></ul><p>集成天眼查企业信息查询。通过 <code>@EnableXXX</code> 注解开启或关闭。</p>',128),o={render:function(e,d){return l}}}}]);