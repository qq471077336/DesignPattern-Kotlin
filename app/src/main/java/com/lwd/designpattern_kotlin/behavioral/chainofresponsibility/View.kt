package com.lwd.designpattern_kotlin.behavioral.chainofresponsibility

import android.view.MotionEvent

open class View : EventHandler {
    override val next: EventHandler? = null

    override fun handle(event: MotionEvent): Boolean {
        return onTouchEvent()
    }

    open fun onTouchEvent(): Boolean {
        return false
    }
}