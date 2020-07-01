package com.example.kotlinDemo.Test

class TestOne {


}

fun main() {

    val user = User("haha", 1)

    var age = user.getAge()
    var name = user.getName()

    getUser("haha"){
        println("====="+it)
    }

}


fun getUser(name: String, method: (Boolean) -> Unit) {

    if (name == null) {
        println("====null")
        method(true)
    } else {
        method(false)
        println("= else=====")
    }

}