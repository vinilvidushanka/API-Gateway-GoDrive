package com.example.gateway_server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class WebConfig {

    @Bean
    public CorsWebFilter corsWebFilter() {
        CorsConfiguration corsConfig = new CorsConfiguration();
        
        corsConfig.addAllowedOrigin("https://godrive-frontend-git-main-vinilvidushankas-projects.vercel.app");
        corsConfig.addAllowedOrigin("http://localhost:5173"); 
        corsConfig.setMaxAge(3600L);
        
        corsConfig.addAllowedMethod("*"); 
        
        corsConfig.addAllowedHeader("*");
        
        corsConfig.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfig);

        return new CorsWebFilter(source);
    }
}