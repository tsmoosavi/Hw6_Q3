package com.example.hw6_q3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw6_q3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
//        val view = binding.root
//        setContentView(view)
        setContentView(binding.root)

    }
}