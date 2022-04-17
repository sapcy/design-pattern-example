package com.example.designPattern.decorator.beverage;

import com.example.designPattern.decorator.base.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "하우스 블렌드 커피";
    }

    public double cost() {
        return 0.89;
    }
}
