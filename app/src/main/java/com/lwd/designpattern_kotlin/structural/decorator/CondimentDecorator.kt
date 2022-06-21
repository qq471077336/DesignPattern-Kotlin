package com.lwd.designpattern_kotlin.structural.decorator

abstract class CondimentDecorator(
    val beverage: Beverage
) : Beverage() {

    abstract override fun getDescription() : String
}