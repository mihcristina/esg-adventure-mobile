package com.example.esg_adventure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.esg_adventure.Adapter.AdapterCard
import com.example.esg_adventure.model.Card

class CarouselCards : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carousel_cards)

        val recyclerView_cards = findViewById<RecyclerView>(R.id.recyclerViewCards)
        recyclerView_cards.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView_cards.setHasFixedSize(true)

        //adapter
        val listaCartas: MutableList<Card> = mutableListOf()
        val adapterCard = AdapterCard(this, listaCartas)
        recyclerView_cards.adapter = adapterCard


        val cartaUm = Card(R.drawable.voluntariado)
        val cartaDois = Card(R.drawable.alimentacao)
        val cartaTres = Card(R.drawable.atividade)
        val cartaQuatro = Card(R.drawable.lixo)
        val cartaCinco = Card(R.drawable.horta)

        listaCartas.add(cartaUm)
        listaCartas.add(cartaDois)
        listaCartas.add(cartaTres)
        listaCartas.add(cartaQuatro)
        listaCartas.add(cartaCinco)
    }
}