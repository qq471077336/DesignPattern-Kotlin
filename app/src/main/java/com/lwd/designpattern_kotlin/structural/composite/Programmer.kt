package com.lwd.designpattern_kotlin.structural.composite

class Programmer(
    name: String,
    position: String
) : Staff(name, position) {
    override fun getInfo() {
        println("name:$name,position:$position")
    }

    override fun doSomething(notice: String) {
        println("$name-$position,$notice")
    }
}