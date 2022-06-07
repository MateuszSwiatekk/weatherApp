package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.view.get

class Plants : AppCompatActivity() {

    private val arrayListPlantNames = ArrayList<String>()
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
        //Toast.makeText(applicationContext, plantType, Toast.LENGTH_SHORT).show()

        if(plantType == "Home") {

            var query=db.rawQuery("SELECT * FROM PLANTS WHERE PLANTTYPE LIKE "+R.string.plantType2,null)
            //var query=db.rawQuery("SELECT * FROM PLANTS LIMIT 15 OFFSET 15" ,null)
            while(query.moveToNext()) {
                var plantName=query.getString(1)
                arrayListPlantNames.add(getString(plantName.toInt()))
            }
            plantsList.add(Plant(R.drawable.plant16,"Aglaonema Zmienna"))
            plantsList.add(Plant(R.drawable.plant17,"Ardizja Karbowana"))
            plantsList.add(Plant(R.drawable.plant18,"Daktylowiec Niski"))
            plantsList.add(Plant(R.drawable.plant19,"Echmea Wstęgowa"))
            plantsList.add(Plant(R.drawable.plant20,"Fitonia"))
            plantsList.add(Plant(R.drawable.plant21,"Haworsja"))
            plantsList.add(Plant(R.drawable.plant22,"Kalanchoe Blossfelda"))
            plantsList.add(Plant(R.drawable.plant23,"Kawa Arabska"))
            plantsList.add(Plant(R.drawable.plant24,"Łosie rogi"))
            plantsList.add(Plant(R.drawable.plant25,"Monstera Dziurawa"))
            plantsList.add(Plant(R.drawable.plant26,"Pieprz Turecki"))
            plantsList.add(Plant(R.drawable.plant27,"Starzec Rowleya"))
            plantsList.add(Plant(R.drawable.plant28,"Storczyk Cymbidium"))
            plantsList.add(Plant(R.drawable.plant29,"Trzykrotka Somalijska"))
            plantsList.add(Plant(R.drawable.plant30,"Wężownica Gwinejska"))
            val customAdapter = CustomAdapter(this,R.layout.custom_list_row,plantsList)
            val listView=findViewById<ListView>(R.id.listView)
            listView.adapter = customAdapter

            listView.setOnItemClickListener { parent, view, position, id ->  //clicking an item of list view launches new activity
                val intent = Intent(this, Description::class.java)
                //val element=listView.getItemAtPosition(position).toString()
                val plant :Plant = plantsList[position]
                intent.putExtra("plant_id", arrayOf((position+16).toString(),plant.Name,"Home"))
                startActivity(intent)
            }

        }else {
                var query=db.rawQuery("SELECT * FROM PLANTS WHERE PLANTTYPE LIKE "+R.string.plantType1,null)
                //var query=db.rawQuery("SELECT * FROM PLANTS LIMIT 15",null)
                while(query.moveToNext()) {
                    var plantName=query.getString(1)
                    arrayListPlantNames.add(getString(plantName.toInt()))
            }
            plantsList.add(Plant(R.drawable.plant1,"Begonia Bulwiasta"))
            plantsList.add(Plant(R.drawable.plant2,"Cebulica Syberyjska"))
            plantsList.add(Plant(R.drawable.plant3,"Dzwonek Irlandzki"))
            plantsList.add(Plant(R.drawable.plant4,"Frezja"))
            plantsList.add(Plant(R.drawable.plant5,"Galtonia Biaława"))
            plantsList.add(Plant(R.drawable.plant6,"Goździk Brodaty"))
            plantsList.add(Plant(R.drawable.plant7,"Hiacynt"))
            plantsList.add(Plant(R.drawable.plant8,"Irys żółty"))
            plantsList.add(Plant(R.drawable.plant9,"Kamasja"))
            plantsList.add(Plant(R.drawable.plant10,"Naparstnica Purpurowa"))
            plantsList.add(Plant(R.drawable.plant11,"Niezapominajka Błotna"))
            plantsList.add(Plant(R.drawable.plant12,"Szafirek Armeński"))
            plantsList.add(Plant(R.drawable.plant13,"Szafirek Groniasty"))
            plantsList.add(Plant(R.drawable.plant14,"Tulipan"))
            plantsList.add(Plant(R.drawable.plant15,"Zawilec wieńcowy"))
            val customAdapter = CustomAdapter(this,R.layout.custom_list_row,plantsList)
            val listView=findViewById<ListView>(R.id.listView)
            listView.adapter = customAdapter

            listView.setOnItemClickListener { parent, view, position, id ->  //clicking an item of list view launches new activity
                val intent = Intent(this, Description::class.java)
                //val element=listView.getItemAtPosition(position).toString()
                val plant :Plant = plantsList[position]
                intent.putExtra("plant_id", arrayOf((position+1).toString(),plant.Name,"Garden"))
                startActivity(intent)
            }
        }

    }



}