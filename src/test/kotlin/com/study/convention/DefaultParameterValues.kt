package com.study.convention

import org.junit.jupiter.api.Test

class DefaultParameterValues {

    @Test
    fun `function overloading 보다 default parameter value 지정을 권장`() {
        // Bad
        fun foo(a: String) {
            println(a)
        }

        fun foo() {
            foo("default value")
        }
        foo()

        // Good
        fun foo2(a: String = "default value") {
            println(a)
        }
        foo2()
    }

}