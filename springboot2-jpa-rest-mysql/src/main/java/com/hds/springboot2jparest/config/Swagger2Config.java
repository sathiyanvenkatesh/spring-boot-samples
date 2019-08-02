/**
 * 
 */
package com.hds.springboot2jparest.config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
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
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .select()                                  
	          .apis(RequestHandlerSelectors.basePackage("com.hds.springboot2jparest.controller"))              
	          .paths(PathSelectors.any())                          
	          .build().apiInfo(apiInfo());
	        		  //.useDefaultResponseMessages(false)///
	                  //.globalResponseMessage(RequestMethod.GET, getCustomizedResponseMessages()// this two lines needed to customize error message 
	                         // );
	    }
	 
	 private ApiInfo apiInfo() {
		    return new ApiInfo(
		      "Employee Service", 
		      "Some custom description of API.", 
		      "API TOS", 
		      "Terms of service", 
		      new Contact("Sathiya Venkatesh", "www.sathiyanvenkatesh.com", "admin@company.com"), 
		      "License of API", "API license URL", Collections.emptyList());
		}
	 /*private List<ResponseMessage> getCustomizedResponseMessages(){
	        List<ResponseMessage> responseMessages = new ArrayList<>();
	        responseMessages.add(new ResponseMessageBuilder().code(500).message("Server has crashed!!").responseModel(new ModelRef("Error")).build());
	        responseMessages.add(new ResponseMessageBuilder().code(403).message("You shall not pass!!").build());
	        return responseMessages;
	    }*/

}
