package com.ebc.loteriasvarias.service

import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class NumeroSecretoService {
    private var numero: Int = 0;

    init {
        generarNumeroNuevo();
    }

    private fun generarNumeroNuevo() {
        numero = Random.nextInt(10) + 1;
    }

    fun adivinar(intento: Int): String {
       if (intento == numero) {
           generarNumeroNuevo();
           return "Bien hecho muggle... adivinaste... se generó un nuevo número";
       } else {
           return "¡Ha ha ha! Estás atrapado";

           //exitProcess(0)
       }
    }
}