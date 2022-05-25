package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        window.statusBarColor = ContextCompat.getColor(this, R.color.whiteaf)
    }

    fun plantTypeSelector(view:View){
        val intent = Intent(this,PlantTypeSelector::class.java)
        startActivity(intent)
    }

    fun weatherClick(view:View){
        val intent = Intent(this,GetWeatherLocation::class.java)
        startActivity(intent)
    }

    fun tasksClick(view: View){
        val intent = Intent(this,callendarActivity::class.java)
        startActivity(intent)
    }

    fun fotoClick(view: View){
        val intent = Intent(this,Foto::class.java)
        startActivity(intent)
    }

    fun lightSensorClick(view:View){
        val intent = Intent(this,LightSensor::class.java)
        startActivity(intent)
    }

    override fun onBackPressed() {
        finish()
    }
}