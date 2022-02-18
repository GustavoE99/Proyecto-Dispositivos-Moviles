package com.example.animalito3d

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnIngresar=findViewById<Button>(R.id.btnIngresar)
        var entrada_nombre=findViewById<TextView>(R.id.entrada_nombre)

        btnIngresar.setOnClickListener(){
        var intent= Intent(this,Menu2::class.java)
        startActivity(intent)}

        YO=entrada_nombre.getText().toString()


            }

        }
}