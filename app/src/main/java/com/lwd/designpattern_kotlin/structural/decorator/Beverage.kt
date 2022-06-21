package com.lwd.designpattern_kotlin.structural.decorator

abstract class Beverage {
    open fun getDescription() : String {
        return "Unknown Beverage"
    }

    abstract fun cost() : Double
}