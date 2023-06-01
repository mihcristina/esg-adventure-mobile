package com.example.esg_adventure.Adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.esg_adventure.R
import com.example.esg_adventure.model.Card

class AdapterCard(private val context: Context, private val cards: MutableList<Card>): RecyclerView.Adapter<AdapterCard.CardViewHolder>() {


    inner class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto = itemView.findViewById<ImageView>(R.id.card)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.cards, parent, false)
        val holder = CardViewHolder(itemLista)
        return holder
    }

    override fun getItemCount(): Int  = cards.size

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.foto.setImageResource(cards[position].card)
    }
}