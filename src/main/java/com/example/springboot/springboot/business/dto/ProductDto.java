package com.example.springboot.springboot.business.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
public class ProductDto {
    private Long id;
    @NotNull(message = "Product Name Information cannot Be Blank!")
    private String name;
    @NotNull(message = "Product Price Information Cannot Be Blank!")
    private String price;
    @NotEmpty(message = "Product Codes Information Cannot Be Blank!")
    @Size(min = 5,max = 7, message = "The product code, must be between 5 and 7")
    private String codes;
    @Email(message = "The email is not in the proper format!")
    private String emailAddres;

}
