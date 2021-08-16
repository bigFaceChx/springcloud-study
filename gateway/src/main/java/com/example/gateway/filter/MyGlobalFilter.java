package com.example.gateway.filter;

import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Description: TODO
 * @Author LH
 * @Date 2021/8/16 9:43
 **/
@Component
public class MyGlobalFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain){
        //写拦截业务逻辑
        ServerHttpRequest request=exchange.getRequest();
        ServerHttpResponse response=exchange.getResponse();
        //业务逻辑,有token放行
        MultiValueMap<String,String> queryParams=request.getQueryParams();
        String token=queryParams.getFirst("token");

        if (StringUtils.isEmpty(token)){
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            return response.setComplete();//请求拦截
        }
        //请求放行
        return chain.filter(exchange);
    }
    public int getOrder(){
        return  0;
    }
}
