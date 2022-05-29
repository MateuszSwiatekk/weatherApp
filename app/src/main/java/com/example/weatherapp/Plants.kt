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
    val plantsList= ArrayList<Plant>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plants)

        val actionBar = supportActionBar
        actionBar!!.title = "Plants"
        window.statusBarColor = ContextCompat.getColor(this, R.color.green)

        var helper=DBHelper(applicationContext)
        var db=helper.readableDatabase
        val plantType = intent.getStringExtra("plant")
        Toast.makeText(applicationContext, plantType, Toast.LENGTH_SHORT).show()

        if(plantType == "Home") {

            var query=db.rawQuery("SELECT * FROM PLANTS WHERE PLANTTYPE LIKE "+R.string.plantType2,null)
            //var query=db.rawQuery("SELECT * FROM PLANTS LIMIT 15 OFFSET 15" ,null)
            while(query.moveToNext()) {
                var plantName=query.getString(1)
                arrayListRepos.add(getString(plantName.toInt()))
            }
            plantsList.add(Plant(R.drawable.plant16,"Aglaonema Zmienna"))
            plantsList.add(Plant(R.drawable.plant17,"Ardizja Karbowana"))
            val customAdapter = CustomAdapter(this,R.layout.custom_list_row,plantsList)
            val listView=findViewById<ListView>(R.id.listView)
            listView.adapter = customAdapter

            listView.setOnItemClickListener { parent, view, position, id ->  //clicking an item of list view launches new activity
                val intent = Intent(this, Description::class.java)
                val element=listView.getItemAtPosition(position).toString()
                intent.putExtra("plant_id", arrayOf((position+16).toString(),element,"Home"))
                startActivity(intent)
            }

        }else {
                var query=db.rawQuery("SELECT * FROM PLANTS WHERE PLANTTYPE LIKE "+R.string.plantType1,null)
                //var query=db.rawQuery("SELECT * FROM PLANTS LIMIT 15",null)
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
                val intent = Intent(this, Description::class.java)
                val element=listView.getItemAtPosition(position).toString()
                intent.putExtra("plant_id", arrayOf((position+1).toString(),element,"Garden"))
                startActivity(intent)
            }
        }

    }



}