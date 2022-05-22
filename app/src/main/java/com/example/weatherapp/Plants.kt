package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.core.content.ContextCompat

class Plants : AppCompatActivity() {

    private val arrayListRepos = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plants)

        val actionBar = supportActionBar
        actionBar!!.title = "Plants"
        window.statusBarColor = ContextCompat.getColor(this, R.color.green)

        var helper=DBHelper(applicationContext)
        var db=helper.readableDatabase
        var query=db.rawQuery("SELECT * FROM PLANTS",null)

        while(query.moveToNext()) {
            var plantName=query.getString(1)
            arrayListRepos.add(getString(plantName.toInt()))
        }
        val adapter: ArrayAdapter<String> = ArrayAdapter(   //array adapter, used to drop items from arraylist of repos to list view
            this,
            android.R.layout.simple_dropdown_item_1line,
            arrayListRepos
        )
        val listView=findViewById<ListView>(R.id.listView)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->  //clicking an item of list view launches new activity
            val intent = Intent(this, Description::class.java).apply {
                putExtra("plant_id", (position+1).toString())
            }
            startActivity(intent)
        }


    }



}