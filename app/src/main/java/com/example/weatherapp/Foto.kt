package com.example.weatherapp

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.core.content.ContextCompat


class Foto : AppCompatActivity() {
    private lateinit var fotobutton : Button
    private lateinit var fotoview : ImageView
    val REQUEST_IMAGE_CAPTURE = 1

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        fotobutton = findViewById<Button>(R.id.fotoButton)
        fotoview = findViewById<ImageView>(R.id.fotoView)
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            fotoview.setImageBitmap(imageBitmap)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foto)

        val actionBar = supportActionBar
        actionBar!!.title = "Gallery"
        window.statusBarColor = ContextCompat.getColor(this, R.color.green)

        fotobutton = findViewById<Button>(R.id.fotoButton)
        fotobutton.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if(intent.resolveActivity(packageManager)!=null){
                startActivityForResult(intent, REQUEST_IMAGE_CAPTURE)
            }
        }
    }
}