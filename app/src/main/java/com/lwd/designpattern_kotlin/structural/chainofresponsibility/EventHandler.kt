package com.lwd.designpattern_kotlin.structural.chainofresponsibility

import android.view.MotionEvent

interface EventHandler {
    val next : EventHandler?
    fun handle(event : MotionEvent) : Boolean
}