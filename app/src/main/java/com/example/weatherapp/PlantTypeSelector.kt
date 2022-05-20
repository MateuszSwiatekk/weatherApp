package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PlantTypeSelector : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_type_selector)

        supportActionBar?.hide()
    }
}