package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloWorldController {

    @GetMapping("/hello")
    fun getHello(): String {
        return "Hello World, this is SpringBoot Application."
    }

    @GetMapping("addtwo/{num}")
    fun addTwo(@PathVariable("num") num: Int): String {
        return (num+2).toString()
    }
}