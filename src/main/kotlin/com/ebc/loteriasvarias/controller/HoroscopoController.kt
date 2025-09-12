package com.ebc.loteriasvarias.controller

import com.ebc.loteriasvarias.service.HoroscopoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/horoscopo")
class HoroscopoController (
    private val horoscopoService: HoroscopoService
) {

    @GetMapping
    fun obtenerHoroscopo(@RequestParam signo: Int): String {
        return horoscopoService.obtenerHoroscopo(signo)
    }
}