package com.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
    info = @Info(
        title = "API de Gestão de Usuários",
        description = "API REST desenvolvida em Java com Spring Boot para gerenciamento de usuários.",
        version = "1.0",
        contact = @Contact(
            name = "Seu Nome",
            email = "seuemail@email.com"
        )
    )
)

@Configuration
public class OpenApiConfiguration {

    
}
