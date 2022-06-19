package com.lwd.designpattern_kotlin.creational.builder

class Computer private constructor(
    cpu: String,
    motherboard: String,
    ram: String,
    hardDisk: String,
    gpu: String,
    radiator: String,
    power: String,
    case: String,
) {
    private constructor(builder: Builder) : this(
        builder.cpu, builder.motherboard, builder.ram,
        builder.hardDisk, builder.gpu, builder.radiator, builder.power, builder.case
    )

    class Builder {
        var cpu: String = "Intel core i9 12900KS"
        var motherboard: String = "ROG STRIX Z690- A GAMING WiFi显卡 Galaxy RTX 3090Ti星曜OC"
        var ram: String = "HOF 16 GB DDR4 4000MHz"
        var hardDisk: String = "WD_ BLACK SN8502TBM.2"
        var gpu: String = "3090Ti"
        var radiator: String = "DEEPCOOL堡垒360EX幻彩水冷"
        var power: String = "ROG雷鹰1000W金牌模组"
        var case: String = "CEOMETRIC FUTURE牛仔很忙"

        fun build() = Computer(this)
    }

    companion object {
        inline fun build(block : Builder.() -> Unit) = Builder().apply(block).build()
    }
}

val computer : Computer = Computer.build {
    cpu = "Intel core i9 12900KS"
}