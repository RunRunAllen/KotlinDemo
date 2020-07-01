package com.example.kotlinDemo.Test

class User(var name: String, var age: Int) {


    operator fun component1(): String = name

    operator fun component2(): Int = age
}

//扩展函数

fun User.getName(): String {
    return name
}


fun User.getAge(): Int {
    return age
}