package com.lwd.designpattern_kotlin.structural.decorator

class DarkRoast : Beverage() {

    override fun getDescription(): String {
        return "DarkRoast"
    }

    override fun cost(): Double {
        return .99
    }
}