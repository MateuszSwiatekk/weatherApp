package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import android.widget.Toast.makeText

class dateActivity : AppCompatActivity() {
    private val arrayListRepos = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        var helper=DBHelper(applicationContext)
        var db=helper.readableDatabase
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date)
        val date=intent.getStringExtra("date")
        makeText(applicationContext,date,Toast.LENGTH_SHORT).show()
        var query=db.rawQuery("SELECT * FROM TASKS",null)

        while(query.moveToNext()) {
            if(date==query.getString(1)){
                var task = query.getString(2)
                arrayListRepos.add(task)
                }
        }
        val adapter: ArrayAdapter<String> = ArrayAdapter(   //array adapter, used to drop items from arraylist of repos to list view
            this,
            android.R.layout.simple_list_item_1,
            arrayListRepos
        )
        val listView=findViewById<ListView>(R.id.taskList)
        listView.adapter = adapter
    }
    fun addTask(view: View){
        var helper=DBHelper(applicationContext)
        var db=helper.readableDatabase
        val taskText=findViewById<EditText>(R.id.taskText).text.toString()
        db?.execSQL("INSERT INTO TASKS(DATE,TASK) VALUES ("+"'"+intent.getStringExtra("date")+"'"+","+"'"+taskText+"'"+")")
        findViewById<EditText>(R.id.taskText).setText("")
        makeText(applicationContext,"Task added",Toast.LENGTH_SHORT).show()
    }
}