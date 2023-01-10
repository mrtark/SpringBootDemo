package com.example.springboot.springboot.controller.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mvc")
public class ProductControllermvc {
    public String mvc(){
        return "index.html";
    }
}
