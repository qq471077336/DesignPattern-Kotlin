package com.lwd.designpattern_kotlin.structural.adapter.objectadapter

class Adapter(private val wrapper : Adaptee) : Target {
    override fun request() {
        wrapper.ask()
    }
}