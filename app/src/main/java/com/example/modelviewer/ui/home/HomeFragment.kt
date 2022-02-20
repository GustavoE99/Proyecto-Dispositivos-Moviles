package com.example.modelviewer.ui.home

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.modelviewer.R
import com.example.modelviewer.databinding.FragmentHomeBinding
import com.example.modelviewer.ui.modelviewer.ModelViewerFragment
import com.example.modelviewer.ui.modelviewer.ModelViewerFragment1
import com.example.modelviewer.utils.viewbinding.viewBinding

class HomeFragment : AppCompatActivity() {

    private lateinit var  binding: FragmentHomeBinding

    override fun onCreate( savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding= FragmentHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

            binding.cardP.setOnLongClickListener {
                binding.cardP.setChecked(!binding.cardP.isChecked)
                true}
            binding.cardP.setOnClickListener() {
                    var intent= Intent(this,ModelViewerFragment::class.java)
                    startActivity(intent) }

            binding.cardG.setOnLongClickListener {
            binding.cardG.setChecked(!binding.cardG.isChecked)
            true}
            binding.cardG.setOnClickListener() {
                var intent= Intent(this,ModelViewerFragment1::class.java)
                startActivity(intent) }




        }
    }



   

