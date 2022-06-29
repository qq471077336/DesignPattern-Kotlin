package com.lwd.designpattern_kotlin.behavioral.command

class Calculator {
    private val queue = mutableListOf<Command>()
    fun compute(command: Command) {
        command.execute()
        queue.add(command)
    }

    fun undo() {
        queue.lastOrNull()?.undo()
        queue.removeLast()
    }
}