package com.example.kotlinDemo

// 主次构造方法

open class Person(id: Int) {

    //次构造
    constructor(id: Int, name: String) : this(id) {

    }

    //无参数次构造
    constructor() : this(123) {

    }

    //次构造
    constructor(name: String) : this(12) {

    }
}