package com.example.kotlinDemo

fun main(): Unit {

//    lenMethod(1, 2, 3, 4, 5, 6)

    //lambda 表达
//    val addMethod: (Int, Int) -> Int = { a, b -> a + b }
//    val sum = addMethod(9, 8)
//    print(sum)

//
//    val a: String = """
//        aaaa
//        bbbb
//        cccc
//    """.trimIndent()
//    val b: String = "aaaa   bbbb  ccccc ".trimMargin()

//    println(a)
//    print(b)

    //打印 $
//    val money = "${'$'}9999"
//    print(money)
//    val info: String? = null

    //为null的处理方案
//    print(info?.length)
//    print(info!!.length)  throw Exception

//    getValue()

//    val a: String = "haha"
//    val b: String = "haha"
//    //值比较
//    println(a == b)
//    //地址比较
//    println(a === b)


//    val array = arrayOf(1,2,3,4,5)
//    println(array[0])
//    for (i in array){
//        println(i)
//    }

//    val i = 5
//    when (i) {
//        1 -> println(i)
//        2 -> println(i)
//        in 3..5 -> println(i)
//        else -> println(i)
//    }

//    val allen = Allen()
//    allen.show()

    //次构造
    val person = Person()
    //主构造
    val person1 = Person(223)


//    val  result :()->Int={}
    val result: (Int, Int) -> Int = { n1, n2 ->
        n1 + n2
    }
//    val result2 = {}
    val result2 = { n1: Int, n2: Int ->
        n1 + n2
    }
    //两种不同的写法


    var num1: (String, String) -> String = { n1, n2 ->
        n1 + n2
    }

    var num2 = { n1: Int, n2: Int ->
        n1 + n2
    }

    var num3: (String) -> String = { str -> str }

    var sex = { sex: Char -> if (sex == 'M') "我是女的" else "我的男的" }


}


fun addValue(a: Int, b: Int): Int {
    return a + b
}

//区间
fun getValue() {
//    for (i: Int in  1..9) {
//        println(i)
//    }

//    for (i: Int in 9 downTo  1) {
//        println(i)
//    }

    //步长
//     for (i in 9 downTo  1 step  2){
//         println(i)
//     }

    //排除
    for (i in 1 until 10) {
        println(i)
    }
}


//vararg 可变参数
fun lenMethod(vararg value: Int) {

    for (i: Int in value) {
        println(i)
    }
}


class Allen {

    //标签效果
    val s = "hahaha"
    val item = listOf<String>("aaa", "bbb", "ccc")

    fun show() {
//        println(s)
//        println(this.s)
//        println(this@Allen.s)


        //循环
//        for (i in item){
//            println(i)
//        }


        item.forEach {
            println(it)
        }

        //打印下标
        for (index in item.indices) {
            println("$index : 值 ${item[index]}")
        }

    }


}



