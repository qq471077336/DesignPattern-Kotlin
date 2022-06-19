package com.lwd.designpattern_kotlin.structural.composite

class Client {

}

fun main(args: Array<String>) {
    val boss = Manager("钱大", "老板")
    val rdManager = Manager("张三", "研发部经理")
    val marketingManager = Manager("李四", "市场部经理")
    val group1 = Manager("王五", "研发部一组组长")
    val group2 = Manager("赵六", "研发部二组组长")
    val programmer1 = Programmer("甲", "Android程序员")
    val programmer2 = Programmer("乙", "Android程序员")
    val programmer3 = Programmer("丙", "Java程序员")
    val programmer4 = Programmer("丁", "Java程序员")

    boss.addSubordinate(rdManager)
    boss.addSubordinate(marketingManager)
    rdManager.addSubordinate(group1)
    rdManager.addSubordinate(group2)
    group1.addSubordinate(programmer1)
    group1.addSubordinate(programmer2)
    group2.addSubordinate(programmer3)
    group2.addSubordinate(programmer4)

    boss.notifyStaff("今晚加班", "来开会")
    boss.getInfo()
}