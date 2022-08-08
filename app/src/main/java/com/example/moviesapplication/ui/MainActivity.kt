package com.example.moviesapplication.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.moviesapplication.R
import com.example.moviesapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null)
            supportFragmentManager.beginTransaction().replace(R.id.container, MainScreenFragment())
                .commitNow()
    }
}