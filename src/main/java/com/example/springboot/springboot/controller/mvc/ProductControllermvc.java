package com.example.springboot.springboot.controller.mvc;

import com.example.springboot.springboot.business.dto.ProductDto;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    //http://localhost:8080/root/data3
    @GetMapping("data3")
    public String mvc3(Model refModel){
        refModel.addAttribute("key_2","Data From Java! :)");
        return "data3page_sendData";
    }

    //http://localhost:8080/root/data4
    @GetMapping("data4")
    public String mvc4(Model refModel){
        ProductDto refproductdto = ProductDto
                .builder()
                .id(14L)
                .name("Graphic card")
                .price("4.000")
                .build();
        refModel.addAttribute("product1",refproductdto);
        return "data4page_sendDataProduct";
    }
}
