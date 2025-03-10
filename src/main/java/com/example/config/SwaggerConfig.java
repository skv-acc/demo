package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("test").apiInfo(apiInfo()).select().
				paths(regex("/emp.*")).build();
	}
	
	public ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Employee Service")
				.description("sample employee service")
				.termsOfServiceUrl(null)
				.license("Employee License")
				.licenseUrl(null).version("1.0").build();
	}
}
