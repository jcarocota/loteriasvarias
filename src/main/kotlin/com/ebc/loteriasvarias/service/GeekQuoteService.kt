package com.ebc.loteriasvarias.service

import org.springframework.stereotype.Service

@Service
class GeekQuoteService {
    private val quotes = listOf(
        "Nunca subestimes un commit bien descrito.",
        "Mientras haya un bug, hay trabajo.",
        "Tu código compila: ya vas de gane.",
        "Un paso a la vez... como un for bien hecho.",
        "Refactoriza hoy, agradece mañana.",
        "Los tests son tus aliados, no tus enemigos.",
        "Menos miedo, más logs.",
        "Si compila a la primera, desconfía y prueba.",
        "Todo gran sistema empezó con un \"Hola Mundo\".",
        "Falla rápido, aprende más rápido."
    )

    fun getRandomQuote(): String = quotes.random()

}