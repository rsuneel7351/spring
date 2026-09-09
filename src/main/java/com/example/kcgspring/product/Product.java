package com.example.kcgspring.product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double pricePerDay;


    public Product(Long id,String name, Double pricePerDay){
        this.id=id;
        this.name=name;
        this.pricePerDay=pricePerDay;
    }
    public Product (){}
    public Long getId(){
        return id;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}
