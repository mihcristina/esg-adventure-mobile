package com.example.esg_adventure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.esg_adventure.databinding.ActivityFruitDetailsBinding
import com.example.esg_adventure.databinding.ActivityMainBinding

class FruitDetails : AppCompatActivity() {

    private lateinit var binding: ActivityFruitDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFruitDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}