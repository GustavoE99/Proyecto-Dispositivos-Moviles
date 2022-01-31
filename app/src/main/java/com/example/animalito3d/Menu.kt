package com.example.animalito3d

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnIngresar=findViewById<Button>(R.id.btnIngresar)
        var inst_btn=findViewById<Button>(R.id.inst_btn)
        var credi_btn=findViewById<Button>(R.id.credi_btn)

        btnIngresar.setOnClickListener(){
        var intent= Intent(this,Menu2::class.java)
        startActivity(intent)
    }}
}