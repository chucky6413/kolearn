package com.study.kolearn

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.PropertySource

@SpringBootApplication
@PropertySource("classpath:application-default.properties")
class KolearnApplication

fun main(args: Array<String>) {
    runApplication<KolearnApplication>(*args)
}
