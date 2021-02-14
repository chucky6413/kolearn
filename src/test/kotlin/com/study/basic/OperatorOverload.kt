package com.study.basic

import org.junit.jupiter.api.Test

class OperatorOverload {
    data class Point(var x: Int, var y: Int) {
        operator fun plus(other: Point): Point {
            return Point(x + other.x, y + other.y)
        }

        operator fun unaryMinus(): Point {
            return Point(-x, -y)
        }

        operator fun inc() = Point(x + 1, y + 1)

        operator fun dec() = Point(x - 1, y - 1)

        operator fun plusAssign(other: Point) {
            x += other.y
            y += other.y
        }
    }

    @Test
    fun pointPlus() {
        var p1 = Point(10, 20)
        var p2 = Point(30, 40)

        println(p1 + p2)

        println(-p1)

        println(p1++)
        println(++p1)

        println(p2--)
        println(--p2)

        val p3 = Point(10, 20)
        val p4 = Point(30, 40)

        p3 += p4
        println(p3)
    }

    @Test
    fun rem() {
        val num = 4

        if (num.rem(2) == 0) {
            println("num is even")
        } else {
            println("num is odd")
        }
    }
}