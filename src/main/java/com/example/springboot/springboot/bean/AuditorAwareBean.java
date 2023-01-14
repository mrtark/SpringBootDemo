package com.example.springboot.springboot.bean;

import com.example.springboot.springboot.audit.AuditorAwareImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

@Configuration
public class AuditorAwareBean {
    @Bean
    public AuditorAware auditorAwareBean(){
        return new AuditorAwareImplement();
    }
}
