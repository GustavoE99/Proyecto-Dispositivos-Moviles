package com.example.modelviewer

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.modelviewer.databinding.ActivityMainBinding
import com.example.modelviewer.ui.home.HomeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ingresarbt.setOnClickListener() {
            if(binding.nombre.text.toString()==""){
                binding.text.error=getString(R.string.error)
            }else{
                binding.text.error=null
            var intent= Intent(this, HomeFragment::class.java)
            startActivity(intent) }
        }
    }
}
