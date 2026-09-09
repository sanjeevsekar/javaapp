package com.example.productstore.service;

import com.example.productstore.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductService {
    private final AtomicLong nextId = new AtomicLong(6);

    private final List<Product> products = new ArrayList<>(List.of(
        new Product(1L, "Laptop", 999.00,
            "High performance laptop with 8GB RAM and 512GB SSD.",
            "https://images.unsplash.com/photo-1496181133206-80ce9b88a853?w=800"),
        new Product(2L, "Smartphone", 699.00,
            "Latest smartphone with excellent camera quality.",
            "https://images.unsplash.com/photo-1511707171634-5f897ff02aa9?w=800"),
        new Product(3L, "Headphones", 199.00,
            "Noise cancelling headphones with great sound quality.",
            "https://images.unsplash.com/photo-1505740420928-5e560c06d30e?w=800"),
        new Product(4L, "Smartwatch", 149.00,
            "Track your fitness and health with style.",
            "https://images.unsplash.com/photo-1523275335684-37898b6baf30?w=800"),
        new Product(5L, "Running Shoes", 89.00,
            "Comfortable running shoes for everyday use.",
            "https://images.unsplash.com/photo-1542291026-7eec264c27ff?w=800")
    ));

    public List<Product> findAll() {
        return new ArrayList<>(products);
    }

    public void add(Product product) {
        product.setId(nextId.getAndIncrement());
        products.add(product);
    }

    public void delete(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }
}
