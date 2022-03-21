package com.example.modelviewer.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.modelviewer.databinding.GranjaBinding
import com.example.modelviewer.ui.modelviewer.*

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
                    var intent= Intent(this,ModelVaca::class.java)
                    startActivity(intent) }

            binding.cardGallina.setOnLongClickListener {
            binding.cardGallina.setChecked(!binding.cardGallina.isChecked)
            true}
            binding.cardGallina.setOnClickListener() {
                var intent= Intent(this,ModelGallina::class.java)
                startActivity(intent) }

            binding.cardCerdo.setOnLongClickListener {
            binding.cardCerdo.setChecked(!binding.cardCerdo.isChecked)
            true}
            binding.cardCerdo.setOnClickListener() {
                var intent= Intent(this,ModelCerdo::class.java)
                startActivity(intent) }

            binding.cardO.setOnLongClickListener {
            binding.cardO.setChecked(!binding.cardO.isChecked)
            true}
            binding.cardO.setOnClickListener() {
                var intent= Intent(this, ModelOveja::class.java)
                startActivity(intent) }

            binding.cardPato.setOnLongClickListener {
            binding.cardPato.setChecked(!binding.cardPato.isChecked)
            true}
            binding.cardPato.setOnClickListener() {
                var intent= Intent(this,ModelPato::class.java)
                startActivity(intent) }




        }
    }



   

