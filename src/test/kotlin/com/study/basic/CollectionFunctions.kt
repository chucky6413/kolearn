package com.study.basic

import org.junit.jupiter.api.Test

class CollectionFunctions {
    @Test
    fun functions() {
        val list = arrayListOf("One", "Two", "Three")
        println(list.size)

        println(list.contains("One"))

        println(list[0])

        println(list.indexOf("Two"))

        println(list.isEmpty())

        println(list.subList(1, 3))

        println(list.all { it.startsWith("O") })

        println(list.any { it.startsWith("O") })

        println(list.asReversed())

        println(list.containsAll(listOf("One", "Three")))

        println(list.count { it.startsWith("T") })

        println(list.drop(1))

        println(list.dropLast(1))

        println(list.filter { it.startsWith("T") })

        println(list.filterNot { it.startsWith("O") })

        println(list.find { it.startsWith("T") })

        println(list.findLast { it.startsWith("T") })

        println(list.first())

        println(list.forEach { print("$it ") })

        println(list.forEachIndexed { i, e -> print("$e(${i + 1}) ") })

        println(list.last())

        println(list.map { "$it!" })

        println(list.mapIndexed { i, e -> e + "(${i + 1})" })

        println(list.max())

        println(list.min())

        println(list.minus("Three"))

        println(list.plus("Four"))

        println(list.shuffled())

        println(list.sorted())

        println(list.sortedBy { it })

        println(list.take(2))

        list.add("Four")
        println(list)

        list.remove("Four")
        println(list)

        list.retainAll(listOf("One", "Two"))
        println(list)

        list.clear()
        println(list)


    }
}