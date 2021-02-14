package com.study.basic

import org.junit.jupiter.api.Test

class CountingSet<T>(private val innerSet: MutableCollection<T>) : MutableCollection<T> by innerSet {
    var objectAdded = 0

    override fun add(element: T): Boolean {
        objectAdded++
        return innerSet.add(element)
    }

    override fun addAll(c: Collection<T>): Boolean {
        objectAdded += c.size
        return innerSet.addAll(c)
    }
}

class ClassDelegation {

    @Test
    fun test() {
        val cSet = CountingSet<Int>(mutableListOf())

        cSet.addAll(listOf(1, 2, 3))
        println("List: ${cSet.objectAdded} objects were added, ${cSet.size} remain")
    }
}