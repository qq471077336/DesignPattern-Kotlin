package com.lwd.designpattern_kotlin.structural.decorator

class MoCha(beverage: Beverage) : CondimentDecorator(beverage) {
    override fun getDescription(): String {
        return "${beverage.getDescription()}, Mocha"
    }

    override fun cost(): Double {
        return .20 + beverage.cost();
    }
}