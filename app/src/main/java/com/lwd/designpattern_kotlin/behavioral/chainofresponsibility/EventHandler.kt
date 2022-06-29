package com.lwd.designpattern_kotlin.behavioral.chainofresponsibility

import android.view.MotionEvent

interface EventHandler {
    val next : EventHandler?
    fun handle(event : MotionEvent) : Boolean
}