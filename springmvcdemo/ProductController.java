package com.example.springmvcdemo;

import com.example.springmvcdemo.model.Product;
import com.example.springmvcdemo.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping(value = "/products" )
    public  String viewProduct(Model model){
        var products=productService.FindAll();

        model.addAttribute("products", products);
        return  "products.html";

    }

    @PostMapping(value = "/products" )
    public  String addProduct(@RequestParam String name, @RequestParam int price, Model model){
        Product product=new Product();
        product.setName(name);
        product.setPrice(price);
        productService.addProduct(product);

        var products=productService.FindAll();
        model.addAttribute("products", products);
        return  "products.html";

    }
}
