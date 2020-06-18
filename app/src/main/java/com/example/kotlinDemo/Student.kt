package com.example.kotlinDemo

class Student(id: Int) : //Person() 次构造
//主构造
    Person(id) {

    //kotlin 变量中都是没有默认值的
    val name: String = ""

    //懒加载  注意： 懒加载中 必须要赋值， 否则就会报错
    lateinit var name1: String

    val userBean = UserBean(1, "aa")

    //单利模式


}

