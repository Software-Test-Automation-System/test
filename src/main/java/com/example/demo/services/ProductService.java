package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    // Method 1: Add a new product
    public String addProduct(String productName) {
        // Logic to add a product
        return "Product " + productName + " added successfully.";
    }

    // Method 2: Calculate discount price for a product
    public double calculateDiscountPrice(double originalPrice, double discountPercentage) {
        return originalPrice - (originalPrice * discountPercentage / 100);
    }
}

