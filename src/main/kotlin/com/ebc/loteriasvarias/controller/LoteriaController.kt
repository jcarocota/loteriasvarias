package com.ebc.loteriasvarias.controller

import com.ebc.loteriasvarias.service.LoteriaService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin(origins = ["*"])
@RestController
@RequestMapping("/loteria")
class LoteriaController(
    private val loteriaService: LoteriaService
) {

    @GetMapping
    fun obtenerNumeros(): List<Int> {
        return loteriaService.generarNumeros();
    }
}