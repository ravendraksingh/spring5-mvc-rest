package com.rks.spring5mvcrest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/")
                ;
    }

    private ApiInfo metaData() {
        Contact contact =new Contact("Ravendra Singh", "http://ravendraksingh.com",
                "ravendraksingh@gmail.com");

        return new ApiInfo(
                "Spring Framework Guru",
                "Spring Framework 5: Beginner to Guru: ",
                "1.0",
                "Terms of Serice: yoyo",
                contact,
                "Apache Lincense Version 2.0",
                "https://wwww.apache.org/licenses/LICENSE-2.0",
                new ArrayList<>()
        );

    }
}
