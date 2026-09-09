package com.example.kcgspring.dto;

public class ProductPatchRequest {

    private String name;
    private Double pricePerDay;

    public ProductPatchRequest() {
    }

    public String getName() {
        return name;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}