package com.github.mxab.demowebapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoWebappApplication

fun main(args: Array<String>) {
	runApplication<DemoWebappApplication>(*args)
}
