package com.example.springboot.springboot.controller.mvc;

import com.example.springboot.springboot.bean.ModelMapperBean;
import com.example.springboot.springboot.business.dto.ProductDto;
import com.example.springboot.springboot.data.entity.ProductEntity;
import com.example.springboot.springboot.data.repository.IProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("product")
public class ProductController implements IProduct{

    private IProductRepository iProductRepository;
    private ModelMapperBean modelMapperBean;
    @Autowired
    public ProductController(IProductRepository iProductRepository) {
        this.iProductRepository = iProductRepository;
    }

    @GetMapping("create")
    @Override
    public String createGet(Model model){
        model.addAttribute("product_create",new ProductDto());
        return "product_list";
    }

    @PostMapping ("create")
    @Override
    public String createPost(@Valid @ModelAttribute("product_create") ProductDto productDto, Model model){
        ProductEntity ref_productEntity = modelMapperBean.modelMapperMethod().map(productDto, ProductEntity.class);
        iProductRepository.save(ref_productEntity);
        return "product_list";
    }
}