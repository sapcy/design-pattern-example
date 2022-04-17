package com.example.designPattern.decorator.beverage;

import com.example.designPattern.decorator.base.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        description = "에스프레소 커피";
    }

    public double cost() {
        return 1.99;
    }
}
