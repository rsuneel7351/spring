package com.example.kcgspring.dto;

public class ProductCreateRequest {
    public String name;
    public Double pricePerDay;

    public String getName() {
        return name;
    }
    public ProductCreateRequest() {
    }
    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void SetName(String name){
        this.name=name;
    }
    public void getPricePerDay(Double pricePerDay){
        this.pricePerDay=pricePerDay;
    }
}
