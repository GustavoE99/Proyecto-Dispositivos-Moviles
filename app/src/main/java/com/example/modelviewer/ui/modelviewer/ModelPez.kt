package com.example.modelviewer.ui.modelviewer


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.modelviewer.databinding.ModelosBinding


class ModelPez : AppCompatActivity() {


    private lateinit var  binding: ModelosBinding
    //@SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ModelosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding.modelWebView) {
            loadUrl("file:///android_asset/pez.html")
            settings.apply {
                javaScriptEnabled = true
                loadWithOverviewMode = true
            }
        }
    }
}
