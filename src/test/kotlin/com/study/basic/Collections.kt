package com.study.basic

import org.junit.jupiter.api.Test

class Collections {
    @Test
    fun list() {
        val list: List<Int> = List(5) { it }
        println(list)

        val list2: List<Int> = listOf(1, 2, 3, 4, 5)
        println(list2)
        for (i in list2.indices) {
            print("${list2[i]} ")
        }

        println()

        /** mutable list */
        val mutableList = MutableList(5) { it }
        mutableList.add(5)
        println(mutableList)
    }

    @Test
    fun set() {
        val set1: Set<Int> = setOf(3, 3, 1, 2)
        println(set1)

        val mutableSet: MutableSet<Int> = mutableSetOf(3, 3, 1, 2)
        mutableSet.remove(1)
        println(mutableSet)
    }

    @Test
    fun map() {
        val map1: Map<String, Int> = mapOf("One" to 1, "Two" to 2)
        val map2: Map<String, Int> = mapOf(Pair("Four", 4), Pair("Five", 5))

        val mutableMap: MutableMap<String, Int> = mutableMapOf("One" to 1)
        mutableMap["Two"] = 2
    }
}