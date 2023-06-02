package com.example.esg_adventure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.esg_adventure.Adapter.AdapterCard
import com.example.esg_adventure.databinding.ActivityCarouselCardsBinding
import com.example.esg_adventure.databinding.ActivityFruitDetailsBinding
import com.example.esg_adventure.model.Card

class CarouselCards : AppCompatActivity() {

    private lateinit var binding: ActivityCarouselCardsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityCarouselCardsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

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

        binding.btJogar.setOnClickListener {
            jogar()
        }
    }

    private fun jogar() {
        val intent = Intent(this, FruitDetails::class.java)
        startActivity(intent)
        finish()
    }
}