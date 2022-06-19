package com.lwd.designpattern_kotlin.structural.composite

class Manager(name: String, position: String) : Staff(name, position) {

    private val subordinateList = mutableListOf<Staff>()

    override fun getInfo() {
        println("name:$name,position:$position")
        subordinateList.forEach {
            it.getInfo()
        }
    }

    override fun doSomething(notice: String) {
        println("$name-$position,$notice")
        subordinateList.forEach {
            it.doSomething(notice)
        }
    }

    override fun notifyStaff(notice1: String, notice2: String) {
        subordinateList.forEach {
            it.doSomething(notice2)
            it.notifyStaff(notice1, notice2)
        }
    }

    override fun addSubordinate(staff: Staff) {
        subordinateList.add(staff)
    }

    override fun removeSubordinate(staff: Staff) {
        subordinateList.remove(staff)
    }
}