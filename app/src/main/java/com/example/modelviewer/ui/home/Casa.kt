package com.example.modelviewer.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.modelviewer.databinding.CasaBinding
import com.example.modelviewer.ui.modelviewer.*

class Casa : AppCompatActivity() {

    private lateinit var  binding: CasaBinding

    override fun onCreate( savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding= CasaBinding.inflate(layoutInflater)
        setContentView(binding.root)

            binding.cardP.setOnLongClickListener {
                binding.cardP.setChecked(!binding.cardP.isChecked)
                true}
            binding.cardP.setOnClickListener() {
                    var intent= Intent(this,ModelPerro::class.java)
                    startActivity(intent) }

            binding.cardG.setOnLongClickListener {
            binding.cardG.setChecked(!binding.cardG.isChecked)
            true}
            binding.cardG.setOnClickListener() {
                var intent= Intent(this,ModelGato::class.java)
                startActivity(intent) }

            binding.cardH.setOnLongClickListener {
            binding.cardH.setChecked(!binding.cardH.isChecked)
            true}
            binding.cardH.setOnClickListener() {
                 var intent= Intent(this,ModelHamster::class.java)
                startActivity(intent) }

            binding.cardPerico.setOnLongClickListener {
            binding.cardPerico.setChecked(!binding.cardPerico.isChecked)
            true}
            binding.cardPerico.setOnClickListener() {
                var intent= Intent(this,ModelPerico::class.java)
                startActivity(intent) }

            binding.cardPez.setOnLongClickListener {
            binding.cardPez.setChecked(!binding.cardPez.isChecked)
            true}
            binding.cardPez.setOnClickListener() {
                var intent= Intent(this, ModelPez::class.java)
                startActivity(intent) }


        }
    }



   

