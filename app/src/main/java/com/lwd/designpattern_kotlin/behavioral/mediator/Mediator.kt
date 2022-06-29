package com.lwd.designpattern_kotlin.behavioral.mediator

interface Mediator {
    fun contact(msg : String, person : Person)
}