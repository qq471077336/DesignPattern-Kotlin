package com.lwd.designpattern_kotlin.creational.factorymethod

class BenZFactory : IFactory {
    override fun produceCar(): ICar = BenZ()
}