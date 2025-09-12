package com.ebc.loteriasvarias.controller

import com.ebc.loteriasvarias.service.NumeroSecretoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/adivina")
class NumeroSecretoController(
    private val numeroSecretoService: NumeroSecretoService
) {

    @GetMapping
    fun adivinarNumero(@RequestParam intento: Int) : String {
        return numeroSecretoService.adivinar(intento);
    }
}