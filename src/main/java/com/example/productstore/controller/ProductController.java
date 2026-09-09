package com.example.productstore.controller;

import com.example.productstore.model.Product;
import com.example.productstore.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("products", productService.findAll());
        model.addAttribute("product", new Product());
        return "index";
    }

    @PostMapping("/products")
    public String addProduct(@ModelAttribute Product product) {
        productService.add(product);
        return "redirect:/";
    }

    @PostMapping("/products/{id}/delete")
    public String deleteProduct(@PathVariable Long id) {
        productService.delete(id);
        return "redirect:/";
    }
}
