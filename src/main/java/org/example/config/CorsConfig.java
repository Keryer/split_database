package org.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 允许跨域请求的路径
        registry.addMapping("/**")
                // 允许跨域请求的域名
                .allowedOriginPatterns("*")
                // 允许跨域请求的请求方法
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                // 允许跨域请求的请求头
                .allowedHeaders("*")
                // 是否允许跨域请求发送 cookie
                .allowCredentials(true)
                // 跨域请求的有效期，单位为秒
                .maxAge(3600);
    }
}