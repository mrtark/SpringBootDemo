package com.example.springboot.springboot.controller.mvc;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.TimeZone;

@Controller
@RequestMapping("root")
public class ProductControllermvc {
    //Bean constructer
    @PostConstruct
    public void getMyLocalTimeZone(){
        TimeZone.setDefault(TimeZone.getTimeZone("IST"));
    }
    //normal constructer
    public ProductControllermvc() {

    }

    //http://localhost:8080/root/data
    @GetMapping("data")
    @ResponseBody
    public String mvc(){
        return "Hello World";
    }

    //http://localhost:8080/root/data2
    @GetMapping("data2")
    //@ResponseBody html den veri alacağımız için bu yapıyı kapattık
    public String mvc2(){
        return "data2page";
    }
}
