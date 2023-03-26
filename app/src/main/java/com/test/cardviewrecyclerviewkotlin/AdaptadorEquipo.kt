package com.test.cardviewrecyclerviewkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorEquipo(val listaEquipos: List<Equipo>): RecyclerView.Adapter<AdaptadorEquipo.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vista  = LayoutInflater.from(parent.context).inflate(R.layout.item_rv_equipo, parent, false)
        return ViewHolder(vista)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val equipo = listaEquipos[position]

        holder.tvNombre.text = equipo.nombre
        holder.tvPais.text = equipo.pais
        holder.tvMote.text = equipo.mote
    }

    override fun getItemCount(): Int {
        return listaEquipos.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val tvNombre: TextView = itemView.findViewById(R.id.nombre)
        val tvPais: TextView = itemView.findViewById(R.id.pais)
        val tvMote: TextView = itemView.findViewById(R.id.mote)
    }
}