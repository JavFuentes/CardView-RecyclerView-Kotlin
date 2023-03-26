package com.test.cardviewrecyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvEquipo = findViewById<RecyclerView>(R.id.rv_equipos)
        rvEquipo.layoutManager = LinearLayoutManager(this)

        val listaEquipos = ArrayList<Equipo>()

        listaEquipos.add(Equipo("Boca Juniors", "Argentina", "Xeneizes"))
        listaEquipos.add(Equipo("Palmeiras", "Brasil", "Verdão"))
        listaEquipos.add(Equipo("Colo-Colo", "Chile", "Cacique"))
        listaEquipos.add(Equipo("Real Madrid", "España", "Merengues"))
        listaEquipos.add(Equipo("Universidad de Chile ", "Chile", "Romántico Viajero"))

        val adaptadorEquipo = AdaptadorEquipo(listaEquipos)
        rvEquipo.adapter = adaptadorEquipo
    }
}