package com.study.convention

import org.junit.jupiter.api.Test

class Immutability {

    @Test
    fun `가능하면 var 대신 val 을 사용하라`() {
        val a = "수정 하면 안돼."
        println("a: $a")

        var b = "수정 가능."
        println("b: $b")

        b = "수정"
        println("b: $b")
    }

    @Test
    fun `가능하면 immutable collection 을 사용하라`() {
        // Bad: use of mutable collection type for value which will not be mutated
        fun validateValue(actualValue: String, allowedValues: HashSet<String>) {
            println(actualValue)

            allowedValues.add("element 추가 가능.")
            println(allowedValues)
        }
        validateValue("test1", HashSet())

        // Good: immutable collection type used instead
        fun validateValue2(actualValue: String, allowedValues: Set<String>) {
            println(actualValue)

//            allowedValues.add("element 추가 불가능.")
            println(allowedValues)
        }
        validateValue2("test2", HashSet())


        // Bad: arrayListOf() returns ArrayList<T>, which is a mutable collection type
        val allowedValues = arrayListOf("a", "b", "c")
        allowedValues.add("d")
        println(allowedValues)

        // Good: listOf() returns List<T>
        val allowedValues2 = listOf("a", "b", "c")
//        allowedValues2.add("d 추가 불가능")
        println(allowedValues2)
    }

    @Test
    fun `가능하면 immutable list 반환`() {
        val preparedItems = listOf("a", "b", "c")

        // bad. 지양
        val items = arrayListOf<String>()
        for (pItem in preparedItems) {
            items.add(pItem)
        }
        println(items)

        // good. immutable list 반환
        val items2 = preparedItems.map { it }
        println(items2)
    }

}