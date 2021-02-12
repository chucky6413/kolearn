package com.study.basic

import org.junit.jupiter.api.Test

class NullCheck {

    data class Address(val st: String, val zipCode: Int, val city: String)
    class Company(val name: String, val addr: Address?)
    class Person(val name: String, val company: Company?)

    @Test
    fun safeCallsChainsAndElvis() {
        fun Person.cityName() = company?.addr?.city ?: "Unknown"

        val tossCompany = Company("tossbank", null)
        val person = Person("junwoo lee", tossCompany)

        println(person.cityName())
    }

    @Test
    fun letFunction() {
        fun printAddress(addr: Address) {
            println(addr)
        }

        val tossCompany = Company("tossbank", Address("a", 123, "c"))
        val address: Address? = tossCompany.addr

        address?.let {
            printAddress(it)
        }
    }
}