package com.lwd.designpattern_kotlin.behavioral.mediator

class Tenant(name: String, mediator: Mediator) : Person(name, mediator) {

    fun contact(msg : String, mediator: Mediator) {
        mediator.contact(msg, this)
    }

    fun getMsg(msg: String) {
        println("Tenant:${name} getMsg:${msg}")
    }
}