package com.lwd.designpattern_kotlin.creational.singleton

class Singleton {
    companion object {
        fun getInstance() : Singleton = Holder.instance
    }

    private object Holder {
        val instance = Singleton()
    }
}