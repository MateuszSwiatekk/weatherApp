package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class PlantTypeSelector : AppCompatActivity() {

    private lateinit var garden: Button
    private lateinit var home: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_type_selector)

        supportActionBar?.hide()
    }

    fun plantsClickGarden(view: View){
        val intent = Intent(this,Plants::class.java).apply {
            putExtra("plant", "Garden")
        }
        startActivity(intent)
    }

    fun plantsClickHome(view: View){
        val intent = Intent(this,Plants::class.java).apply {
            putExtra("plant", "Home")
        }
        startActivity(intent)
    }
}