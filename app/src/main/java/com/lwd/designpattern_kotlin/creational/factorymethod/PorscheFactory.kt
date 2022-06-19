package com.lwd.designpattern_kotlin.creational.factorymethod

class PorscheFactory : IFactory {
    override fun produceCar(): ICar = Porsche()
}