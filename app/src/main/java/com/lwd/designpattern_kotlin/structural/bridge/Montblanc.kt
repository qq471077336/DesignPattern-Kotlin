package com.lwd.designpattern_kotlin.structural.bridge

class Montblanc : Pen() {
    override fun write() {
        println("montblanc write use ${ink.coloring()}")
    }

}