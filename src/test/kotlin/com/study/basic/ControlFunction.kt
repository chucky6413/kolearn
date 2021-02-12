package com.study.basic

import org.junit.jupiter.api.Test

class ControlFunction {

    @Test
    fun ifStatement() {
        fun getMax(a: Int, b: Int): Int {
            var max = a
            if (a < b) max = b
            return max
        }

        println(getMax(1, 3))


        fun getMax2(a: Int, b: Int) = if (a < b) b else a
        println(getMax2(2, 3))

        fun getMax3(a: Int, b: Int): Int {
            return if (a < b) {
                println("b is bigger than a")
                b
            } else {
                println("a is bigger than b")
                a
            }
        }
        println(getMax3(1, 5))
    }

    @Test
    fun whenStatement() {
        fun printValue(a: Int) {
            when (a) {
                1 -> println("value: 1")
                2 -> println("value: 2")
                else -> println("value is neither 1 nor 2")
            }
        }
        printValue(3)

        fun printValue2(a: Int) {
            when (a) {
                1, 2 -> println("value: 1 or 2")
                else -> println("value is neither 1 nor 2")
            }
        }
        printValue2(5)

        fun printValue3(a: Int, str: String) {
            when (a) {
                str.toInt() -> println("str is a")
                else -> println("str is not a")
            }
        }
        printValue3(1, "1")

        fun printValue4(a: Int) {
            when (a) {
                in 1..10 -> println("a is in the range (1~10)")
                else -> println("none of the above")
            }
        }
        printValue4(1)
        printValue4(3)
        printValue4(5)
        printValue4(12)

        fun Int.isOdd() = this % 2 != 0
        fun Int.isEven() = this % 2 == 0

        fun printValue5(a: Int) {
            when {
                a.isOdd() -> println("$a is odd")
                a.isEven() -> println("$a is even")
                else -> println("he he kotlin is fun ~")
            }
        }
        printValue5(4)
    }

}