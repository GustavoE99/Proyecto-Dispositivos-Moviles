package com.example.modelviewer

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.modelviewer.databinding.MenuBinding
import com.example.modelviewer.ui.home.Casa
import com.example.modelviewer.ui.home.Granja

class Menu : AppCompatActivity() {

    private lateinit var  binding: MenuBinding
//
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= MenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.casabt.setOnClickListener() {
            var intent= Intent(this, Casa::class.java)
            startActivity(intent) }

        binding.granjabt.setOnClickListener() {
            var intent= Intent(this, Granja::class.java)
            startActivity(intent) }

        binding.creditosbt.setOnClickListener() {
            var intent= Intent(this, Creditos::class.java)
            startActivity(intent) }

    }}