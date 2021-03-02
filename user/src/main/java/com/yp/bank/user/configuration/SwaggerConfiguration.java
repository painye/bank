package com.yp.bank.user.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo("银行排队服务-用户模块",
                        "银行排队服务的用户模块测试",
                        "http://localhost:8080/swagger-ui.html",
                        "v2.0"))
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yp.bank.user.controller"))
                .paths(PathSelectors.any())
                .build();

    }


    protected ApiInfo apiInfo(String title, String desc, String url, String version){
        return new ApiInfoBuilder()
                .title("银行排队服务-用户模块")
                .description("银行排队服务的用户模块测试")
                .termsOfServiceUrl("http://localhost:8080/swagger-ui.html")
                .version("v2.0")
                .build();
    }
}
