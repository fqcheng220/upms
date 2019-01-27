package com.fqcheng220.common;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Title SwaggerConfig
 * @Description TODO
 * @Author fqcheng220
 * @Date 2019/1/26 0026 19:59
 * @Version 1.0
 */
public class SwaggerConfig {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.f*.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("接口列表v1.0")
                .description("接口测试")
                .termsOfServiceUrl("http://localhost:8080/swagger-ui.html")
                .contact("fqcheng220")
                .version("v1.0")
                .build();
    }

}
