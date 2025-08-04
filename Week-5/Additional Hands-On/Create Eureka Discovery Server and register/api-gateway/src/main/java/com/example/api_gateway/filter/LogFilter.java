package com.example.api_gateway.filter;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;


@Component
public class LogFilter implements GlobalFilter{

    Logger LOGGER = LoggerFactory.getLogger(LogFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain){
        LOGGER.info("====>Request URL {}", exchange.getRequest().getURI());
        return chain.filter(exchange);
    }
}