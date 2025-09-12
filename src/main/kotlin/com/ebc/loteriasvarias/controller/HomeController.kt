package com.ebc.loteriasvarias.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@CrossOrigin(origins = ["*"])
@RestController
class HomeController {

    @GetMapping("/")
    fun holaMundo(
        @RequestParam(required = false, defaultValue = "") nombre:String
    ) : String {
        if (nombre.isBlank()) {
            return "Hola mundo!! Desde Kotlin + Maven + Spring";
        } else {
            return "Hola ${nombre}!!! Ya eres un dev kotlin + Maven + Spring... y android";
        }
    }
}