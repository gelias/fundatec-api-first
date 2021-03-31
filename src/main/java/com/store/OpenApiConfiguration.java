package com.store;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Fundatec API First Approach Sample")
                        .description("API demo")
                        .version("v0.0.1"))
                .externalDocs(new ExternalDocumentation()
                        .description("Restful API Documentation")
                        .url("https://restfulapi.net/rest-api-design-tutorial-with-example/"));
    }
}
