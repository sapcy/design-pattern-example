package com.example.designPattern.decorator.condiment;

import com.example.designPattern.decorator.base.Beverage;
import com.example.designPattern.decorator.base.CondimentDecorator;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }

    public double cost() {
        return beverage.cost() + 0.15;
    }
}
