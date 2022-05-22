package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.core.content.ContextCompat

class Description : AppCompatActivity() {

    private val arrayListRepos = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)
        val plant_id=intent.getStringExtra("plant_id")
        makeText(applicationContext,plant_id,Toast.LENGTH_SHORT).show()
        var helper=DBHelper(applicationContext)
        var db=helper.readableDatabase
        var query=db.rawQuery("SELECT * FROM DESCRIPTIONS WHERE DESCRIPTIONID ="+plant_id,null)

        val actionBar = supportActionBar
        actionBar!!.title = "Plant description"
        window.statusBarColor = ContextCompat.getColor(this, R.color.green)

        if(query.moveToNext())
        arrayListRepos.add(query.getString(1))

        val adapter: ArrayAdapter<String> = ArrayAdapter(   //array adapter, used to drop items from arraylist of repos to list view
            this,
            android.R.layout.simple_list_item_1,
            arrayListRepos
       )
       val listView=findViewById<ListView>(R.id.listView2)
       listView.adapter = adapter

        }


    }