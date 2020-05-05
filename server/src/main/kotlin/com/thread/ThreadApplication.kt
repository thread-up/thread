package com.thread

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class ThreadApplication

fun main(args: Array<String>) {
    runApplication<ThreadApplication>(*args)
}