/**
 * 
 */
package com.hds.springboot2jparest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Sathiyan
 *
 */
//@Configuration
public class AppConf implements WebMvcConfigurer {

   /* @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200","http://localhost:8080")
                .allowedMethods("GET","POST","PUT","PATCH","OPTIONS");
    }*/
}