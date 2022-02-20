package com.example.modelviewer.ui.modelviewer

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.modelviewer.R
import com.example.modelviewer.databinding.FragmentModelViewerBinding
import com.example.modelviewer.utils.viewbinding.viewBinding

class ModelViewerFragment1 : AppCompatActivity() {


    private lateinit var  binding: FragmentModelViewerBinding
    //@SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= FragmentModelViewerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding.modelWebView) {
            loadUrl("file:///android_asset/modelViewer1.html")
            settings.apply {
                javaScriptEnabled = true
                loadWithOverviewMode = true
            }
        }
    }
}
