package com.example.springboot.springboot.controller.mvc;

import com.example.springboot.springboot.business.dto.ProductDto;

import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


public interface IProduct {
    //create
    String createGet(Model model);

    String createPost(ProductDto productDto, BindingResult bindingResult, Model model);

    //http:localhost:8080/product/list

    String getAllDataList(Model model);


    /*//crud
    public ProductDto speedCreateProduct();

    public ProductDto createProduct();
    public ProductDto listProduct();
    public ProductDto updateProduct();
    public ProductDto deleteProduct();
     */


}
