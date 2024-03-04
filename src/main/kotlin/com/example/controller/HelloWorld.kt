package com.example.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/hello")
class HelloWorld {
    @Get
    fun helloWorld() = "Hello World"
}

@Controller("/bye")
class ByeWorld{
    @Get
    fun byeWorld() = "Bye World"
}