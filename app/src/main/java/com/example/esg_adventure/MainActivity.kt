package com.example.esg_adventure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.esg_adventure.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btEntrar.setOnClickListener {
            val email = binding.editEmail.text.toString()
            val password = binding.editPassword.text.toString()

            when {
                email.isEmpty() -> {
                    binding.editEmail.error = "Preencha o E-mail!"
                }
                password.isEmpty() -> {
                    binding.editPassword.error = "Preencha a Senha!"
                }
                !email.contains("@gmail.com") -> {
                    val snackbar = Snackbar.make(it, "E-mail inválido", Snackbar.LENGTH_SHORT)
                    snackbar.show()
                }
                password.length <= 5 -> {
                    val snackbar = Snackbar.make(it, "A senha precisa ter pelo menos 6 caracteres!", Snackbar.LENGTH_SHORT)
                    snackbar.show()
                }
                else -> {
                    login()
                }
            }
        }
    }
    private fun login() {
        val intent = Intent(this, TelaPrincipal::class.java)
        startActivity(intent)
        finish()
    }
}