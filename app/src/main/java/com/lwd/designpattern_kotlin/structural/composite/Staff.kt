package com.lwd.designpattern_kotlin.structural.composite

abstract class Staff(
    val name: String,
    val position: String
) {
    abstract fun getInfo()
    abstract fun doSomething(notice: String)
    open fun addSubordinate(staff: Staff) {
        throw UnsupportedOperationException("Unsupported Operation")
    }

    open fun removeSubordinate(staff: Staff) {
        throw UnsupportedOperationException("Unsupported Operation")
    }

    fun getSubordinate(): MutableList<Staff>? {
        return null
    }

    open fun notifyStaff(notice1: String, notice2: String) {

    }
}