package com.example.upc_carga_facil

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.upc_carga_facil.Fragmentos.FragmentInicio
import com.example.upc_carga_facil.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        verFragmentInicio()

        binding.BottomNV.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.Item_Inicio->{
                    verFragmentInicio()
                    true
                }
                R.id.Item_Chats->{
                    verFragmentChats()
                    true
                }
                R.id.Item_Servicios->{
                    verFragmentServicios()
                    true
                }
                R.id.Item_Cuenta->{
                    verFragmentCuenta()
                    true
                } else -> {
                    false
                }
            }
        }
    }

    private fun verFragmentInicio() {
        binding.TituloRl.text = "Inicio"
        val fragment = FragmentInicio()
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.replace(binding.FragmentL1.id, fragment, "FragmentInicio")
        fragmentTransition.commit()
    }

    private fun verFragmentChats() {
        binding.TituloRl.text = "Chats"
        val fragment = FragmentInicio()
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.replace(binding.FragmentL1.id, fragment, "FragmentChats")
        fragmentTransition.commit()
    }

    private fun verFragmentServicios() {
        binding.TituloRl.text = "Servicios"
        val fragment = FragmentInicio()
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.replace(binding.FragmentL1.id, fragment, "FragmentServicios")
        fragmentTransition.commit()
    }

    private fun verFragmentCuenta() {
        binding.TituloRl.text = "Cuenta"
        val fragment = FragmentInicio()
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.replace(binding.FragmentL1.id, fragment, "FragmentCuenta")
        fragmentTransition.commit()
    }
}