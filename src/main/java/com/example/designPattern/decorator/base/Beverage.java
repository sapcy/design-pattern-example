package com.example.designPattern.decorator.base;

public abstract class Beverage {
    protected String description = "음료입니다.";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
