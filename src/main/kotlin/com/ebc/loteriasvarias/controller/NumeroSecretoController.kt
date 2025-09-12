package com.ebc.loteriasvarias.controller

import com.ebc.loteriasvarias.service.NumeroSecretoService
import org.springframework.web.bind.annotation.*

@CrossOrigin(origins = ["*"])
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