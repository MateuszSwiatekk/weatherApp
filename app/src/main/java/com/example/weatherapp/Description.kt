package com.example.weatherapp

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class Description : AppCompatActivity() {

    private val arrayListRepos = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)
        val plant_array = intent.getStringArrayExtra("plant_id")
        val plant_id= plant_array?.get(0)



        var helper=DBHelper(applicationContext)
        var db=helper.readableDatabase
        var query=db.rawQuery("SELECT * FROM DESCRIPTIONS WHERE DESCRIPTIONID ="+plant_id,null)
        val actionBar = supportActionBar
        supportActionBar?.hide()
        actionBar!!.title = "Plant description"
        window.statusBarColor = ContextCompat.getColor(this, R.color.whiteaf)

        //if(query.moveToNext())
        //arrayListRepos.add(query.getString(1))

        while(query.moveToNext()) {
            var description=query.getString(1)
            arrayListRepos.add(getString(description.toInt()))
        }

        val adapter: ArrayAdapter<String> = ArrayAdapter(   //array adapter, used to drop items from arraylist of repos to list view
            this,
            android.R.layout.simple_list_item_1,
            arrayListRepos
       )
       val listView=findViewById<ListView>(R.id.listView2)
       listView.adapter = adapter

        }
        fun addPlants(view: View){
            val plant_array = intent.getStringArrayExtra("plant_id")
            val numberOfPlants=findViewById<EditText>(R.id.plantsNumber).text
            if (numberOfPlants.isNullOrEmpty()||numberOfPlants.toString().toInt()==0)
                makeText(applicationContext,"No plants added",Toast.LENGTH_SHORT).show()
            else {
                makeText(
                    applicationContext,
                    "Added " + numberOfPlants.toString().toInt() + " plants",
                    Toast.LENGTH_SHORT
                ).show()
                var helper=DBHelper(applicationContext)
                var db=helper.readableDatabase

                db?.execSQL("INSERT INTO PLANTSOWNED(PLANTNAME,PLANTAMOUNT,TYPE) VALUES ('"+plant_array?.get(1)+"',"+numberOfPlants+",'"+plant_array?.get(2)+"')")
            }
    }


    }