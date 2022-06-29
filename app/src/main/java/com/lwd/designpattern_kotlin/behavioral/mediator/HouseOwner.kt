package com.lwd.designpattern_kotlin.behavioral.mediator

class HouseOwner(name: String, mediator: Mediator) : Person(name, mediator) {

    fun contact(msg : String, mediator: Mediator) {
        mediator.contact(msg, this)
    }

    fun getMsg(msg: String) {
        println("HouseOwner:${name} getMsg:${msg}")
    }
}