package com.example.animalito3d

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ingresa_btn=findViewById<Button>(R.id.ingresar_btn)
        var text=findViewById<TextInputLayout>(R.id.text)
        var nombre=findViewById<EditText>(R.id.nombre)

        ingresa_btn.setOnClickListener(){
            if(nombre.text.toString()==""){
                text.error=getString(R.string.error)
            }else{
            text.error=null

                var intent= Intent(this,Menu::class.java)
                startActivity(intent)
            }

        }
    }
}