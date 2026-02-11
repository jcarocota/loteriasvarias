package com.ebc.loteriasvarias.controller

import com.ebc.loteriasvarias.service.PropinaService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/propinas")
class PropinaController(
    private val service: PropinaService
) {

    @GetMapping("/random")
    fun propinaRandom(
        @RequestParam cantidad: Double
    ) : Double {
        return service.calcularPropinaRandom(cantidad)
    }
}