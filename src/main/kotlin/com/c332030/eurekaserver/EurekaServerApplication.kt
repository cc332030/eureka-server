package com.c332030.eurekaserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EurekaServerApplication

fun main(args: Array<String>) {
    runApplication<EurekaServerApplication>(*args)
}