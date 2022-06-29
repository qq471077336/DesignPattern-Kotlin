package com.lwd.designpattern_kotlin.behavioral.mediator

class ConcreteMediator : Mediator {
    lateinit var houseOwner : HouseOwner
    lateinit var tenant: Tenant
    override fun contact(msg: String, person: Person) {
        if (person is HouseOwner) {
            tenant.getMsg(msg)
        } else {
            houseOwner.getMsg(msg)
        }
    }

}