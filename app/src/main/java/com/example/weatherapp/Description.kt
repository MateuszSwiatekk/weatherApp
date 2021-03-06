package com.example.weatherapp

import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.Toast.makeText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class Description : AppCompatActivity() {

    private val arrayListRepos = ArrayList<String>()
    val characteristicList= ArrayList<Plant>()
    val careList=ArrayList<Plant>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)

        val plantImages= arrayOf(R.drawable.plant1,R.drawable.plant2,R.drawable.plant3,R.drawable.plant4,R.drawable.plant5,R.drawable.plant6,
        R.drawable.plant7,R.drawable.plant8,R.drawable.plant9,R.drawable.plant10,R.drawable.plant11,R.drawable.plant12,
        R.drawable.plant13,R.drawable.plant14,R.drawable.plant15,R.drawable.plant16,R.drawable.plant17,R.drawable.plant18,R.drawable.plant19,
        R.drawable.plant20,R.drawable.plant21,R.drawable.plant22,R.drawable.plant23,R.drawable.plant24,R.drawable.plant25,R.drawable.plant26,
        R.drawable.plant27,R.drawable.plant28,R.drawable.plant29,R.drawable.plant30)

        val image=findViewById<ImageView>(R.id.imageView8)
        val nameDesc=findViewById<Button>(R.id.plantName)
        val plant_array = intent.getStringArrayExtra("plant_id")
        val plant_id= plant_array?.get(0)
        var img=plant_id?.toInt()
        val name=plant_array?.get(1)
        nameDesc.text = name
            if (img != null) {
                image.setImageResource(plantImages[img-1])
            }

        var helper=DBHelper(applicationContext)
        var db=helper.readableDatabase
        var query=db.rawQuery("SELECT * FROM DESCRIPTIONS WHERE DESCRIPTIONID ="+plant_id,null)
        val actionBar = supportActionBar
        supportActionBar?.hide()
        actionBar!!.title = "Plant description"
        window.statusBarColor = ContextCompat.getColor(this, R.color.whiteaf)

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

        var query2=db.rawQuery("SELECT * FROM CARE WHERE CAREID = "+plant_id,null)
        if(query2.moveToNext()){
            var diff=query2.getString(1)
            var sun=query2.getString(2)
            var toxic=query2.getString(3)
            var water=query2.getString(4)
            var watering=query2.getString(5)
            var fertilizer=query2.getString(6)

            characteristicList.add(Plant(R.drawable.piramida,diff))
            characteristicList.add(Plant(R.drawable.slonce,sun))
            characteristicList.add(Plant(R.drawable.czaszka,toxic))
            characteristicList.add(Plant(R.drawable.kropla,water))
            careList.add(Plant(R.drawable.konewka,watering))
            careList.add(Plant(R.drawable.worek,fertilizer))
        }
        val customAdapter = CustomAdapter(this,R.layout.custom_list_row,characteristicList)
        val listView2=findViewById<ListView>(R.id.listView4)
        listView2.adapter = customAdapter
        val customAdapter2 = CustomAdapter(this,R.layout.custom_list_row,careList)
        val listView3=findViewById<ListView>(R.id.listView3)
        listView3.adapter=customAdapter2


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