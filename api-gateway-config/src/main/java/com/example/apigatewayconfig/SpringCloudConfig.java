package com.example.apigatewayconfig;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

//    @Bean
//    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("consumer", r -> r.path("/api/v1/consumer/**")
//                        .and()
//                        .uri("http://localhost:2001/"))
//                .route("employee", r -> r.path("/api/v1/employee/**")
//                        .and()
//                        .uri("http://localhost:2002/"))
//                .build();
//    }

}