package com.lwd.designpattern_kotlin.behavioral.command

interface Command {
    var param : Int
    var value : Int
    fun execute()
    fun undo()
}