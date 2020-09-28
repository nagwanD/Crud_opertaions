package com.Spring_boot.CRUD_Operation.CRUDOperation;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configurable
public class SwaggerConfig {

	
	@Bean
	public Docket api()
	{
		return new Docket(DocumentationType.SWAGGER_2);
	}
}
