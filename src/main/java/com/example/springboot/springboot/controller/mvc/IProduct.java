package com.example.springboot.springboot.controller.mvc;

import com.example.springboot.springboot.business.dto.ProductDto;

import org.springframework.ui.Model;


public interface IProduct {
    //create
    String createGet(Model model);
    String createPost(ProductDto productDto, Model model);

    /*//crud
    public ProductDto speedCreateProduct();

    public ProductDto createProduct();
    public ProductDto listProduct();
    public ProductDto updateProduct();
    public ProductDto deleteProduct();
     */


}
