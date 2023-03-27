package com.test.cardviewrecyclerviewkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Adaptador personalizado para el RecyclerView que maneja la lista de equipos
class AdaptadorEquipo(val listaEquipos: List<Equipo>) : RecyclerView.Adapter<AdaptadorEquipo.ViewHolder>() {

    // Método para inflar el layout del ítem y crear un ViewHolder personalizado
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vista = LayoutInflater.from(parent.context).inflate(R.layout.item_rv_equipo, parent, false)
        return ViewHolder(vista)
    }

    // Método para enlazar los datos del equipo con el ViewHolder personalizado
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val equipo = listaEquipos[position]

        holder.tvNombre.text = equipo.nombre
        holder.tvPais.text = equipo.pais
        holder.tvMote.text = equipo.mote
    }

    // Método para obtener la cantidad de elementos en la lista de equipos
    override fun getItemCount(): Int {
        return listaEquipos.size
    }

    // Clase ViewHolder personalizada que maneja las vistas del ítem del RecyclerView
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNombre: TextView = itemView.findViewById(R.id.nombre)
        val tvPais: TextView = itemView.findViewById(R.id.pais)
        val tvMote: TextView = itemView.findViewById(R.id.mote)
    }
}
