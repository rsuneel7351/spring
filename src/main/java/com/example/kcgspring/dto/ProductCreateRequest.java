package com.example.kcgspring.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class ProductCreateRequest {
    @NotBlank(message = "Product name is required.")
    private String name;
    @NotNull(message = "Price per day is required.")
    @Positive(message = "Price per day must be greater than 0")
    private Double pricePerDay;

    public ProductCreateRequest() {
    }

    public ProductCreateRequest(String name, Double pricePerDay) {
        this.name = name;
        this.pricePerDay = pricePerDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { // Fixed method name (lowercase 's')
        this.name = name;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) { // Fixed setter name
        this.pricePerDay = pricePerDay;
    }
}