package com.example.modelviewer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.modelviewer.databinding.CreditosBinding

class Creditos: AppCompatActivity() {

    private lateinit var  binding: CreditosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= CreditosBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }}