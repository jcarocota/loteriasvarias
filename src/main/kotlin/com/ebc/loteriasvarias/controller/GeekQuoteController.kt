package com.ebc.loteriasvarias.controller

import com.ebc.loteriasvarias.service.GeekQuoteService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin(origins = ["*"])
@RestController
@RequestMapping("/quotes")
class GeekQuoteController(
    private val geekQuoteService: GeekQuoteService
) {

    @GetMapping
    fun getRandomQuote(): String =
        geekQuoteService.getRandomQuote()
}