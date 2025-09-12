package com.ebc.loteriasvarias.service

import org.springframework.stereotype.Service

@Service
class HoroscopoService {

    private val predicciones = mapOf(
        1 to "Aries: Hoy tu vida compilará sin errores, pero aguas con los merge conflicts en tu corazón. Haz commit de tus sentimientos antes de que se acumulen los cambios.",
        2 to "Tauro: Te sientes como un servidor en producción: estable, pero con miedo a que te hagan deploy un viernes en la noche. Mantén tu uptime con café y buena música.",
        3 to "Géminis: Tus ideas son como microservicios: pequeñas, escalables y todas quieren correr en distintos puertos. Usa un buen gateway para no perderte en el tráfico.",
        4 to "Cáncer: Tu día será como un CSS mal escrito: lleno de cascadas inesperadas. Respira hondo y aplica un !important de paciencia.",
        5 to "Leo: Vas a brillar más que un console.log en la oscuridad. Solo recuerda no spamear tu entorno con demasiada verbosidad.",
        6 to "Virgo: Eres tan perfeccionista que hasta tu JSON está bien identado. Relájate, no todo necesita pasar por Prettier hoy.",
        7 to "Libra: Te sientes como un load balancer, siempre equilibrando a todos. Ojo, no descuides tu propio request.",
        8 to "Escorpio: Hoy serás tan intenso como un bucle infinito sin break. Recuerda soltar el teclado antes de sobrecalentarte.",
        9 to "Sagitario: Tu energía está en modo async: no todos te entienden, pero al final entregas resultados cuando menos se lo esperan.",
        10 to "Capricornio: La vida te pondrá pruebas como un bug en producción sin logs. No entres en pánico, haz debug con calma.",
        11 to "Acuario: Tu mente está en la nube, literal, como si vivieras en AWS free tier. Cuida tus recursos para no pasarte de presupuesto.",
        12 to "Piscis: Eres tan soñador que tus queries siempre hacen LEFT JOIN con la imaginación. No olvides aplicar un WHERE realista.",
        13 to "Ofiuco: Nadie te pela en el zodiaco, pero eres como esa librería desconocida de npm que salva todo el proyecto. Hoy tendrás tu momento de gloria."
    )

    fun obtenerHoroscopo(signo: Int): String {
        return predicciones[signo] ?: "Signo inválido. Debe estar entre 1 y 13."
    }
}