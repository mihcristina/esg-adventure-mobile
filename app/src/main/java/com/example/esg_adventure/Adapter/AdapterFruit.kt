package com.example.esg_adventure.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.esg_adventure.R
import com.example.esg_adventure.model.Fruit

class AdapterFruit(private val context: Context, private val frutas: MutableList<Fruit>): RecyclerView.Adapter<AdapterFruit.FruitViewHolder>() {


    inner class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name = itemView.findViewById<TextView>(R.id.nameFruits)
        var fruit = itemView.findViewById<TextView>(R.id.family)
        var calories = itemView.findViewById<TextView>(R.id.calories)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.information_fruits, parent, false)
        val holder = FruitViewHolder(itemLista)
        return holder
    }

    override fun getItemCount(): Int  = frutas.size

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        holder.name.text = "Nome: " + frutas[position].name
        holder.fruit.text = "Família: " + frutas[position].family
        holder.calories.text = "Calorias: " + frutas[position].nutritions.calories
    }
}