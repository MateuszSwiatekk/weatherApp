package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class BrowsePlants : AppCompatActivity() {
    private val arrayListGardenPlants = ArrayList<String>()
    private val arrayListHomePlants = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browse_plants)

        supportActionBar?.hide()

        var helper=DBHelper(applicationContext)
        var db=helper.readableDatabase
        var query=db.rawQuery("SELECT * FROM PLANTSOWNED WHERE TYPE='Garden'",null)
        while(query.moveToNext()) {
            var plants=query.getString(1)+" : "+query.getString(2)
            arrayListGardenPlants.add(plants)
        }
        val adapter: ArrayAdapter<String> = ArrayAdapter(   //array adapter, used to drop items from arraylist of repos to list view
            this,
            android.R.layout.simple_list_item_1,
            arrayListGardenPlants
        )
        val listView2=findViewById<ListView>(R.id.plantsOwned)
        listView2.adapter = adapter

        var queryTwo=db.rawQuery("SELECT * FROM PLANTSOWNED WHERE TYPE='Home'",null)
        while(queryTwo.moveToNext()) {
            var plantsTwo=queryTwo.getString(1)+" : "+queryTwo.getString(2)
            arrayListHomePlants.add(plantsTwo)
        }
        val adapterTwo: ArrayAdapter<String> = ArrayAdapter(   //array adapter, used to drop items from arraylist of repos to list view
            this,
            android.R.layout.simple_list_item_1,
            arrayListHomePlants
        )
        val listView3=findViewById<ListView>(R.id.homePlantsList)
        listView3.adapter = adapterTwo
    }
}