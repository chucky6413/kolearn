package com.study.basic

import org.junit.jupiter.api.Test

class ControlFunction2 {

    @Test
    fun whileStatement() {
        var x = 10
        while (x > 0) print("${x--} ")

        println()

        do {
            print("${x++} ")
        } while (x < 10)
    }

    @Test
    fun inStatement() {
        val oneToTen = 1..10
        println(oneToTen)
        for (i in oneToTen) {
            print("$i ")
        }
    }

    @Test
    fun forLoop() {
        for (i in 10 downTo 1) {
            print("$i ")
        }

        println()
        for (i in 10 downTo 1 step 2) {
            print("$i ")
        }

        println()
        val array: Array<Int> = arrayOf(1, 2, 3)
        for (element in array) println(element)

        println()
        val strList = arrayListOf("Hello", "Monguse", "welcome!")
        for ((index, value) in strList.withIndex()) println("$index: $value")
    }
}