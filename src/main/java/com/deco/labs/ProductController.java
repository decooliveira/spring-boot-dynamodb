package com.deco.labs;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductInfoRepository repo;

    @GetMapping(path = "/products")
    public String create(){
        ProductInfo p = new ProductInfo("100", "were", "0.0");
        repo.save(p);
        return "It worked!";
    }
}
