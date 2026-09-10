package com.example.kcgspring.dto;

public class ProductResponse {

    private Long id;
    private String name;
    private Double pricePerDay;

    public ProductResponse(
            Long id,
            String name,
            Double pricePerDay
    ) {
        this.id = id;
        this.name = name;
        this.pricePerDay = pricePerDay;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }
}