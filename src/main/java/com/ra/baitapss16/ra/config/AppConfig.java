package com.ra.baitapss16.ra.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
//biến class nay thanh1 file cấu hình
@EnableWebMvc
// bật chế độ wep mvc
@ComponentScan( basePackages = "com.ra")
// áp dụng cho toàn bộ thành phần trong com.ra
public class AppConfig {
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver rvs = new InternalResourceViewResolver();
        rvs.setPrefix("/views/");
        rvs.setSuffix(".jsp");
        return rvs;
    }
}

