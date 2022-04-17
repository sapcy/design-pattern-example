package com.example.designPattern.decorator;

import com.example.designPattern.decorator.base.Beverage;
import com.example.designPattern.decorator.beverage.Espresso;
import com.example.designPattern.decorator.beverage.HouseBlend;
import com.example.designPattern.decorator.condiment.Mocha;
import com.example.designPattern.decorator.condiment.Whip;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.stereotype.Component;

public class Coffee {
    public Coffee() {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + ": $" + espresso.cost());

        Beverage darkRoast = new Whip(new Mocha(new HouseBlend()));
        System.out.println(darkRoast.getDescription() + ": $" + darkRoast.cost());
    }

    public void print() {
        System.out.println("Coffee print!!");
    }
}
