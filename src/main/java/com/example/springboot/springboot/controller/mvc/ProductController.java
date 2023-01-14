package com.example.springboot.springboot.controller.mvc;

import com.example.springboot.springboot.bean.ModelMapperBean;
import com.example.springboot.springboot.business.dto.ProductDto;
import com.example.springboot.springboot.data.entity.ProductEntity;
import com.example.springboot.springboot.data.repository.IProductRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2

@Controller
@RequestMapping("product")
public class ProductController implements IProduct{

    private IProductRepository iProductRepository;
    private ModelMapperBean modelMapperBean;
    @Autowired
    public ProductController(IProductRepository iProductRepository) {
        this.iProductRepository = iProductRepository;
    }
    //http:localhost:8080/product/create
    @GetMapping("create")
    @Override
    public String createGet(Model model){
        model.addAttribute("product_create",new ProductDto());
        return "product_list";
    }

    @PostMapping ("create")
    @Override
    @Transactional //data security
    public String createPost(@Valid @ModelAttribute("product_create") ProductDto productDto, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            log.error(bindingResult.hasErrors());
            return "product_create";
        }
        ProductEntity ref_productEntity = modelMapperBean.modelMapperMethod().map(productDto, ProductEntity.class);
        iProductRepository.save(ref_productEntity);
        return "redirect:/product_list";
    }
}