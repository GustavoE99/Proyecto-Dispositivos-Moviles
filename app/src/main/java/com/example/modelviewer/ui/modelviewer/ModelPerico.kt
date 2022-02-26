package com.example.modelviewer.ui.modelviewer

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.modelviewer.R
import com.example.modelviewer.databinding.ActivityMainBinding

import com.example.modelviewer.databinding.ModelosBinding
import com.example.modelviewer.utils.viewbinding.viewBinding

class ModelPerico : AppCompatActivity() {


    private lateinit var  binding: ModelosBinding
    //@SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ModelosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding.modelWebView) {
            loadUrl("file:///android_asset/perico.html")
            settings.apply {
                javaScriptEnabled = true
                loadWithOverviewMode = true
            }
        }
    }
}
