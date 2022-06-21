package com.lwd.designpattern_kotlin.structural.decorator

class Milk(beverage: Beverage) : CondimentDecorator(beverage) {
    override fun getDescription(): String {
        return "${beverage.getDescription()}, Milk"
    }

    override fun cost(): Double {
        return beverage.cost() + .10
    }
}