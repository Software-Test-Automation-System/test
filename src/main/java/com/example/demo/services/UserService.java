package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    // Method 1: Create a new user
    public String createUser(String username) {
        // Logic to create a user
        return "User " + username + " created successfully.";
    }

    // Method 2: Calculate user age based on birth year
    public int calculateUserAge(int birthYear) {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - birthYear;
    }
}

