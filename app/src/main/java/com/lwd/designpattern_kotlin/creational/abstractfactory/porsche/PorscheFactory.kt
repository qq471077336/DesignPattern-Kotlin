package com.lwd.designpattern_kotlin.creational.abstractfactory.porsche

import com.lwd.designpattern_kotlin.creational.abstractfactory.IFactory
import com.lwd.designpattern_kotlin.creational.abstractfactory.IFastBack
import com.lwd.designpattern_kotlin.creational.abstractfactory.ISedan
import com.lwd.designpattern_kotlin.creational.abstractfactory.ISuv

class PorscheFactory : IFactory {
    override fun produceSedan(): ISedan = PorscheSedan()

    override fun produceSuv(): ISuv = PorscheSuv()

    override fun produceFastBack(): IFastBack = PorscheFastBack()
}