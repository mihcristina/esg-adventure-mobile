package com.example.esg_adventure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.esg_adventure.Adapter.AdapterCard
import com.example.esg_adventure.Adapter.AdapterFruit
import com.example.esg_adventure.databinding.ActivityFruitDetailsBinding
import com.example.esg_adventure.databinding.ActivityMainBinding
import com.example.esg_adventure.model.Card
import com.example.esg_adventure.model.Fruit
import com.example.esg_adventure.model.Nutrition

class FruitDetails : AppCompatActivity() {

    private lateinit var binding: ActivityFruitDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFruitDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView_cards = findViewById<RecyclerView>(R.id.recyclerViewFruits)
        recyclerView_cards.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView_cards.setHasFixedSize(true)

        //adapter
        val listaFrutas: MutableList<Fruit> = mutableListOf()
        val adapterFrutas = AdapterFruit(this, listaFrutas)
        recyclerView_cards.adapter = adapterFrutas


        val frutaUm = Fruit(
            name = "Watermelon",
            id = 2,
            family = "Cucurbitaceae",
            order = "Cucurbitales",
            genus = "Citrullus",
            nutritions = Nutrition(
                calories = 30,
                fat = 0.2,
                sugar = 6.0,
                carbohydrates = 8.0,
                protein = 0.6
            )
        )

        listaFrutas.add(frutaUm)

    }
}
