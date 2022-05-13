package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

    }
    fun weatherClick(view:View){
        val intent = Intent(this,GetWeatherLocation::class.java)
        startActivity(intent)
    }
    fun plantsClick(view: View){
        val intent = Intent(this,Plants::class.java)
        startActivity(intent)
    }



    override fun onBackPressed() {
        finish()
    }
}