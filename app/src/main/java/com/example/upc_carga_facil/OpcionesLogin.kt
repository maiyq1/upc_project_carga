package com.example.upc_carga_facil

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.upc_carga_facil.Opciones_Login.Login_email
import com.example.upc_carga_facil.databinding.ActivityOpcionesLoginBinding

class OpcionesLogin : AppCompatActivity() {

    private lateinit var binding : ActivityOpcionesLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOpcionesLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.IngresarEmail.setOnClickListener{
            startActivity(Intent(this@OpcionesLogin, Login_email::class.java))
        }
    }
}