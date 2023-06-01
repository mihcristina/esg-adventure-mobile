package com.example.esg_adventure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.esg_adventure.databinding.ActivityMainBinding
import com.example.esg_adventure.databinding.ActivityTelaPrincipalBinding

class TelaPrincipal : AppCompatActivity() {

    private lateinit var binding: ActivityTelaPrincipalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btComecar.setOnClickListener() {
            nextScreen()
        }
    }

    private fun nextScreen() {
        val intent = Intent(this, CarouselCards::class.java)
        startActivity(intent)
        finish()
    }
}