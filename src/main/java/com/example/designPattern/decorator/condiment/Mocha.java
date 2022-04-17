package com.example.designPattern.decorator.condiment;

import com.example.designPattern.decorator.base.Beverage;
import com.example.designPattern.decorator.base.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    public double cost() {
        return beverage.cost() + 0.20;
    }
}
