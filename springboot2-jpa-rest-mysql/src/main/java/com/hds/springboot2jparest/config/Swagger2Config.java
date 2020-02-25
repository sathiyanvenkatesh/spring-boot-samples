/**
 * 
 */
package com.hds.springboot2jparest.config;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.collect.Lists;

import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.service.SecurityScheme;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiKeyVehicle;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Sathiyan
 *
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
	 @Bean
	    public Docket api() { 
		 ParameterBuilder paramBuilder = new ParameterBuilder();
			List<Parameter> params = new ArrayList<>();
			paramBuilder.name("Authorization").modelRef(new ModelRef("string"))
			.parameterType("header")
			.required(false)
			.build();
			params.add(paramBuilder.build());
	        return new Docket(DocumentationType.SWAGGER_2)
	          .globalOperationParameters(params)	
	          .select()                                  
	          .apis(RequestHandlerSelectors.basePackage("com.hds.springboot2jparest"))              
	          .paths(PathSelectors.any())                          
	          .build().apiInfo(apiInfo()).consumes(new HashSet<String>(Arrays.asList("application/json")))
				.produces(new HashSet<String>(Arrays.asList("application/json")));
	          //.securitySchemes(Lists.newArrayList(apiKey()));
	        		  //.useDefaultResponseMessages(false)///
	                  //.globalResponseMessage(RequestMethod.GET, getCustomizedResponseMessages()// this two lines needed to customize error message 
	                         // );
	    }
	 

	 /*@Bean
	    public SecurityConfiguration securityInfo() {
	        return new SecurityConfiguration(null, null, null, null, "", ApiKeyVehicle.HEADER, "Authorization", "");
	    }

	    private ApiKey apiKey() {
	        return new ApiKey("Authorization", "Authorization", "header");
	    }*/
	private ApiInfo apiInfo() {
		    return new ApiInfo(
		      "Employee Service", 
		      "Some custom description of API.", 
		      "API TOS", 
		      "Terms of service", 
		      new Contact("Sathiya Venkatesh", "www.sathiyanvenkatesh.com", "admin@company.com"), 
		      "License of API", "API license URL", Collections.emptyList());
		}

	/*@Bean
	public Docket api()
	{
		ParameterBuilder paramBuilder = new ParameterBuilder();
		List<Parameter> params = new ArrayList<>();
		paramBuilder.name("Authorization").modelRef(new ModelRef("string"))
		.parameterType("header")
		.required(false)
		.build();
		params.add(paramBuilder.build());
		return new Docket(DocumentationType.SWAGGER_2)
				.globalOperationParameters(params)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo())				
				.consumes(new HashSet<String>(Arrays.asList("application/json")))
				.produces(new HashSet<String>(Arrays.asList("application/json")));
	}

	private ApiInfo apiInfo() {
	    return new ApiInfo(
	      "My API", 
	      "My API desc", 
	      "1.0", 
	      "Terms of service", 
	      new Contact("hijazyr", "", ""), 
	      "License of API", "API license URL", Collections.emptyList());
	}*/
}
