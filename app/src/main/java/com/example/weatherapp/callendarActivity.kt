package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.Toast
import android.widget.Toast.makeText

class callendarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_callendar)

        supportActionBar?.hide()

        val callendar=findViewById<CalendarView>(R.id.calendarView)
            callendar.setOnDateChangeListener(object:CalendarView.OnDateChangeListener{
                override fun onSelectedDayChange(p0: CalendarView, year: Int, month: Int, day: Int) {
                    val date=day.toString()+"/"+(month+1).toString()+"/"+year.toString()
                    val intent = Intent(applicationContext,dateActivity::class.java).apply {
                        putExtra("date",date)
                    }
                    startActivity(intent)
                }
            })
    }
}
