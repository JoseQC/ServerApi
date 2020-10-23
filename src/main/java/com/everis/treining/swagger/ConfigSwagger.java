package com.everis.treining.swagger;

import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class ConfigSwagger {

  
  
  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_12).select()
        .apis(RequestHandlerSelectors.basePackage("ideasdev.com.discovery"))
        .paths(PathSelectors.any()).build();
  }

}
