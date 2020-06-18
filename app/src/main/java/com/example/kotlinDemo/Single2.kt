package com.example.kotlinDemo

//单利模式2
class Single2 {

    //相当于静态
    companion object {
        private var instance: Single2? = null
        fun getInstance(): Single2 {
            if (instance == null) {
                instance = Single2()
            }
            return instance!!
        }
    }

    fun show(name: String) {
        println("show:$name")
    }
}

fun main() {
    //调用方式
    val single2 = Single2.getInstance()
    single2.show("hehe")
}