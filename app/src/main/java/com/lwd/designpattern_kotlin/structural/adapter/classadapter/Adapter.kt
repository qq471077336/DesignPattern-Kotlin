package com.lwd.designpattern_kotlin.structural.adapter.classadapter

class Adapter : Adaptee(), Target {
    override fun request() {
        adapterRequest()
    }
}