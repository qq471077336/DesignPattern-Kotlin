package com.lwd.designpattern_kotlin.structural.bridge

class Parker : Pen() {
    override fun write() {
        println("parker write use${ink.coloring()}")
    }

}