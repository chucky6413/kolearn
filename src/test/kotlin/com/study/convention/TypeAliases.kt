package com.study.convention

import org.junit.jupiter.api.Test

typealias Predicate<T> = (T) -> Boolean

typealias Maps = List<Map<String, String>>

class TypeAliases {

    @Test
    fun `자주 사용하는 functional type or type을 alias로 지정하여 사용`() {
        val p: Predicate<Int> = { it > 0 }
        println(listOf(1, -2).filter(p))

        val maps: Maps
    }
}

class A {
    inner class Inner
}

class B {
    inner class Inner
}

typealias AInner = A.Inner
typealias BInner = B.Inner