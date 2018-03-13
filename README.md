Eureka 中 包含ribben的包  所以不需要添加依赖
@SpringBootApplication
//配置为一个Client
@EnableEurekaClient
//user 节点指定使用 TestConfig中配置的部载方式
@RibbonClient(name = "USER", configuration = TestConfig.class)
//排除掉添加 @ExcludeFromComponentScan 注解
//如果使用 自定义ribben 必须将TestConfig 排除掉
// 不能被SpringBootApplication 扫描到
@ComponentScan(excludeFilters = { @ComponentScan.Filter(type = FilterType.ANNOTATION, value = ExcludeFromComponentScan.class) })
public class MovieApplication {
    @Bean
    //具有ribben的负载均衡
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(MovieApplication.class, args);
    }
}

//配置策略  不能被@SpringBootApplication 初始化
如果被扫描到 会配置到所有的client
@ExcludeFromComponentScan
@SpringBootConfiguration
public class TestConfig
{
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}

注解
public @interface ExcludeFromComponentScan
{
}


properties方式 最为简单  推荐使用 主需要添加properties即可
IRule是所有负载均衡策略的父类
com.netflix.loadbalancer.WeightedResponseTimeRule 是根据响应时间加权的一种方式
对feign进行整合时 直接在properties中添加即可
#配置为随机的  user是微服务name
user.ribbon.NFLoadBalancerRuleClassName=com.netflix.loadbalancer.RandomRule  随机



脱离Eureka
#取消Ribbon使用Eureka
ribbon.eureka.enabled=false
#配置Ribbon能访问 的微服务节点，多个节点用逗号隔开
USER.ribbon.listOfServers=localhost:9000












