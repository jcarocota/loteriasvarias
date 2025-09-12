package com.ebc.loteriasvarias.controller

import com.ebc.loteriasvarias.service.HoroscopoService
import org.springframework.web.bind.annotation.*

@CrossOrigin(origins = ["*"])
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