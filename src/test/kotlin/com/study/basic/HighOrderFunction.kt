package com.study.basic

import org.junit.jupiter.api.Test

class HighOrderFunction {
    @Test
    fun sum() {
        val sum = { x: Int, y: Int -> x + y }
        println(sum(1, 3))

        val sum2: (Int, Int) -> Int = { x, y -> x + y }
        println(sum2(2, 4))
    }

    @Test
    fun anonymousFunc() {
        fun calculator(a: Int, b: Int, p: (Int, Int) -> Int) {
            println("$a, $b -> ${p(a, b)}")
        }
        calculator(2, 1) { x, y -> x + y }


        fun highOrderFuncPrint(a: String, p: (String) -> String) {
            println("${p(a)}")
        }
        highOrderFuncPrint("hello") { it }

        fun highOrderFuncPrint2(p: () -> Unit) {
            p()
        }
        highOrderFuncPrint2 { println("hi~") }

        fun printInfo(p: (() -> Unit)? = null) {
            p?.invoke() ?: println("not exist p()")
        }
        printInfo()
    }
}