package com.test.cardviewrecyclerviewkotlin

// Clase Equipo que representa a un equipo de fútbol
class Equipo {

    // Propiedades de la clase Equipo: nombre, país y mote
    var nombre: String? = null
    var pais: String? = null
    var mote: String? = null

    // Constructor que inicializa las propiedades de la clase Equipo
    constructor(nombre: String, pais: String, mote: String) {
        this.nombre = nombre
        this.pais = pais
        this.mote = mote
    }
}
