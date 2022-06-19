package com.lwd.designpattern_kotlin.creational.abstractfactory

interface IFactory {
    fun produceSedan() : ISedan
    fun produceSuv() : ISuv
    fun produceFastBack() : IFastBack
}