package com.lwd.designpattern_kotlin.creational.prototype

data class EMail(
    var recipient : String,
    var subject: String?,
    var message : String?,
)

val mail = EMail("lianwd@qq.com", "nobody@qq.com", "Hello World")
val copy = mail.copy(recipient = "somebody@qq.com")
