package com.ebc.loteriasvarias.service

import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class LoteriaService {
    fun generarNumeros() :  List<Int> {
        //Elijo mutable set porque voy a generar una estructura de N datos diferentes
        val numeros = mutableSetOf<Int>();

        while (numeros.size < 6) {
            val numeroAleatorio = Random.nextInt(1, 60);
            numeros.add(numeroAleatorio);
        }

        return numeros.toList();
    }
}