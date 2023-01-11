package com.example.springboot.springboot.controller.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("root")
public class ProductControllermvc {
    //http://localhost:8080/mvc/veri1
    @GetMapping("data")
    @ResponseBody
    public String mvc(){
        return "Hello World";
    }
}
