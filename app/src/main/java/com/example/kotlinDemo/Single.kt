package com.example.kotlinDemo

//单利模式1
class Single {

    object Holder {
        val instance = Single()
    }

    //相当于静态
    companion object {

        fun getInstance(): Single {
            return Holder.instance
        }
    }

    fun show(name: String) {
        println("show$name")
    }
}

fun main() {
    //调用方式
    val single = Single.getInstance()
    single.show("haha")
}