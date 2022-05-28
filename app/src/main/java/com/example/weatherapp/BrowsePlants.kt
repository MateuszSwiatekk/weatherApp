package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class BrowsePlants : AppCompatActivity() {
    private val arrayListRepos = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browse_plants)

        var helper=DBHelper(applicationContext)
        var db=helper.readableDatabase
        var query=db.rawQuery("SELECT * FROM PLANTSOWNED",null)
        while(query.moveToNext()) {
            var plants=query.getString(1)+" : "+query.getString(2)
            arrayListRepos.add(plants)
        }
        val adapter: ArrayAdapter<String> = ArrayAdapter(   //array adapter, used to drop items from arraylist of repos to list view
            this,
            android.R.layout.simple_list_item_1,
            arrayListRepos
        )
        val listView=findViewById<ListView>(R.id.plantsOwned)
        listView.adapter = adapter
    }
}