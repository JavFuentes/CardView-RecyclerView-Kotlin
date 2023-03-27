package com.test.cardviewrecyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtiene el RecyclerView desde el layout
        val rvEquipo = findViewById<RecyclerView>(R.id.rv_equipos)

        // Establece el LayoutManager para el RecyclerView (en este caso, LinearLayoutManager)
        rvEquipo.layoutManager = LinearLayoutManager(this)

        // Crea una lista para almacenar los objetos de tipo Equipo
        val listaEquipos = ArrayList<Equipo>()

        // Agrega objetos de tipo Equipo a la lista
        listaEquipos.add(Equipo("Boca Juniors", "Argentina", "Xeneizes"))
        listaEquipos.add(Equipo("Palmeiras", "Brasil", "Verdão"))
        listaEquipos.add(Equipo("Colo-Colo", "Chile", "Cacique"))
        listaEquipos.add(Equipo("Real Madrid", "España", "Merengues"))
        listaEquipos.add(Equipo("Universidad de Chile ", "Chile", "Romántico Viajero"))

        // Crea un adaptador personalizado para el RecyclerView, pasándole la lista de equipos
        val adaptadorEquipo = AdaptadorEquipo(listaEquipos)

        // Establece el adaptador personalizado en el RecyclerView
        rvEquipo.adapter = adaptadorEquipo
    }
}
