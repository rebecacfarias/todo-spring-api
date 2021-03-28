package io.github.cursospring.todo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
    	registry.addMapping("/**")
        .allowedOrigins("https://rebecacfarias.github.io")
        .allowedMethods("GET", "POST", "PUT","PATCH", "DELETE", "OPTIONS",  "HEAD", "TRACE", "CONNECT");
    }
}