package com.banking.dashboard.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI bankingDashboardOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Banking Dashboard API")
                        .description("REST API for banking analytics dashboard, exposing data from materialized views")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Banking Dashboard Team")));
    }
}
