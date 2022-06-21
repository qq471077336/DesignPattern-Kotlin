package com.lwd.designpattern_kotlin.structural.decorator

class StarbucksCafe {

}

fun main() {
    var beverage : Beverage = DarkRoast()
    beverage = MoCha(beverage)
    beverage = Milk(beverage)
    beverage.run {
        println("${getDescription()} ${cost()}")
    }
}

class Coffee() {
    var description = "Coffee"
    var cost : Double = 0.0
}

fun Coffee.milk(decorated : Coffee.() -> Unit) {
    description += ", Milk"
    cost += .1
}

fun Coffee.Mocha(decorated : Coffee.() -> Unit) {
    description += ", Mocha"
    cost += .2
}