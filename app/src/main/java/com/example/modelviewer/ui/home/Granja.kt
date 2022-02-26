package com.example.modelviewer.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.modelviewer.databinding.GranjaBinding
import com.example.modelviewer.ui.modelviewer.ModelPerro
import com.example.modelviewer.ui.modelviewer.ModelGato

class Granja : AppCompatActivity() {

    private lateinit var  binding: GranjaBinding

    override fun onCreate( savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding= GranjaBinding.inflate(layoutInflater)
        setContentView(binding.root)

            binding.cardV.setOnLongClickListener {
                binding.cardV.setChecked(!binding.cardV.isChecked)
                true}
            binding.cardV.setOnClickListener() {
                    var intent= Intent(this,ModelPerro::class.java)
                    startActivity(intent) }

            binding.cardGallina.setOnLongClickListener {
            binding.cardGallina.setChecked(!binding.cardGallina.isChecked)
            true}
            binding.cardGallina.setOnClickListener() {
                var intent= Intent(this,ModelGato::class.java)
                startActivity(intent) }




        }
    }



   

