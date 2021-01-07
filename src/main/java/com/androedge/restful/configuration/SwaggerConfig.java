package com.androedge.restful.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

import java.util.*;

@Configuration
@EnableSwagger2
//@EnableSwagger2WebMvc
public class SwaggerConfig {

    private static final Contact DEFAULT_CONTACT
            = new Contact(
            "Edge",
            "Androedge",
            "Androedge@gmail.com");

    private static final ApiInfo DEFAULT_API_INFO
            = new ApiInfo(
            "Awesome Api Title",
            "Awesome Api Documentation",
            "1.0",
            "urn:tos",
            DEFAULT_CONTACT,
            "Apache 2.0",
            "http://www.apache.org/licenses/LICENSE-2.0",
            new ArrayList<>());

    private static final Set<String> DEFAULT_PRODUCES_AND_CONSUME = new HashSet<>(Collections.singletonList("application/json"));
    @Bean
    public Docket api () {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(DEFAULT_API_INFO)
                .produces(DEFAULT_PRODUCES_AND_CONSUME)
                .consumes(DEFAULT_PRODUCES_AND_CONSUME);
    }
}
