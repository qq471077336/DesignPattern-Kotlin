package com.lwd.designpattern_kotlin.structural.bridge

abstract class Pen {
    lateinit var ink : Ink
    abstract fun write()
}