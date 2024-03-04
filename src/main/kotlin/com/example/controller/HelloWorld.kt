package com.example.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/hello")
class HelloWorld {
    @Get
    fun helloWorld() = "Hello World"
}