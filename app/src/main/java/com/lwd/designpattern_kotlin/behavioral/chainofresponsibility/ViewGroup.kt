package com.lwd.designpattern_kotlin.behavioral.chainofresponsibility

import android.view.MotionEvent

class ViewGroup : View() {
    override fun handle(event: MotionEvent): Boolean {
        return if(onInterceptTouchEvent(event)) onTouchEvent()
        else next?.handle(event)!!
    }

    private fun onInterceptTouchEvent(event: MotionEvent): Boolean {
        return false
    }
}