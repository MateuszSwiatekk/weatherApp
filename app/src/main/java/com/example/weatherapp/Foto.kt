package com.example.weatherapp

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Bitmap.CompressFormat
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import java.io.File
import java.io.FileOutputStream
import kotlin.random.Random


class Foto : AppCompatActivity() {
    private lateinit var fotobutton : Button
    private lateinit var fotoview : ImageView
    val REQUEST_IMAGE_CAPTURE = 1

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        fotobutton = findViewById<Button>(R.id.fotoButton)
        fotoview = findViewById<ImageView>(R.id.fotoView)
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==3 && resultCode== RESULT_OK){
            val selectedImage=data?.data
            fotoview.setImageURI(selectedImage)
        }
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            fotoview.setImageBitmap(imageBitmap)
            val root = Environment.getExternalStorageDirectory()
            val file = File(root.absolutePath + "/DCIM/Plants/img"+ Random(1) +"4.jpg")
            val mediaScanIntent = Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE)
            try {
                file.createNewFile()
                val ostream = FileOutputStream(file)
                imageBitmap.compress(CompressFormat.JPEG, 100, ostream)
                mediaScanIntent.setData(Uri.fromFile(file))
                this.sendBroadcast(mediaScanIntent);
                ostream.close()
            } catch (e: Exception) {
                e.printStackTrace()
            }
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

    fun viewImagesClick(view: View){
        val intent=Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(intent,3)
    }
}