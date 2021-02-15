package com.study.basic

import org.junit.jupiter.api.Test
import kotlin.reflect.KProperty

class Person(val name: String, private val _age: Int) {
    var age: Int = _age
        get() {
            println("age get! ${field}")
            return field
        }
        set(value) {
            println("age set! $value")
            field = value
        }
}

class Delegator(private var value: Int) {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        println("${property.name} get! $value")
        return value
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, newValue: Int) {
        println("${property.name} set! $newValue")
        value = newValue

    }
}

class Person2(val name: String, age: Int) {
    var age: Int by Delegator(age)
}

class DelegatedProperty {

    @Test
    fun test() {
        val p = Person("Junwoo", 31)
        p.age = 21
        println("${p.name} - age : ${p.age}")

        val p2 = Person2("Junwoo", 31)
        p2.age = 21
        println("${p2.name} - age : ${p2.age}")
    }

}