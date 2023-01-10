package com.example.springboot.springboot.bean;

import com.example.springboot.springboot.business.dto.ProductDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataBean {
    @Bean
    public ProductDto refObj_productDto(){
        return ProductDto
                .builder()
                .id(1L)
                .name("Computer")
                .price("32.000")
                .build();
    }

    public static void main(String[] args) {
        DataBean refdatabean = new DataBean();
        System.out.println(refdatabean.refObj_productDto());
    }
}
