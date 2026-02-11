package com.ebc.loteriasvarias.service;

import org.springframework.stereotype.Service;
import kotlin.random.Random

@Service
class PropinaService {

    fun calcularPropinaRandom(cantidad: Double) : Double {
        require(cantidad >=0) {
            "La cantidad tiene que ser mayor o igual 0"
        }
        val porcentaje = Random.nextInt(0, 101) //El porcentaje puede ser de 0 a 100
        val resultado = cantidad * (porcentaje/100.0)
        return resultado
    }
}