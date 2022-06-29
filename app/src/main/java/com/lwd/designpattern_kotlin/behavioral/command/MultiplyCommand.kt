package com.lwd.designpattern_kotlin.behavioral.command

class MultiplyCommand(override var param: Int, override var value: Int) : Command {
    override fun execute() {
        value *= param
    }

    override fun undo() {
        value /= param
    }
}