package com.lwd.designpattern_kotlin.creational.abstractfactory.benz

import com.lwd.designpattern_kotlin.creational.abstractfactory.IFactory
import com.lwd.designpattern_kotlin.creational.abstractfactory.IFastBack
import com.lwd.designpattern_kotlin.creational.abstractfactory.ISedan
import com.lwd.designpattern_kotlin.creational.abstractfactory.ISuv

class BenZFactory : IFactory {
    override fun produceSedan(): ISedan = BenZSedan()

    override fun produceSuv(): ISuv = BenZSuv()

    override fun produceFastBack(): IFastBack = BenZFastBack()
}