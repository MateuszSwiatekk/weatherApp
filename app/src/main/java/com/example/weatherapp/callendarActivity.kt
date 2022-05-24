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
        val callendar=findViewById<CalendarView>(R.id.calendarView)
            callendar.setOnDateChangeListener(object:CalendarView.OnDateChangeListener{
                override fun onSelectedDayChange(p0: CalendarView, year: Int, month: Int, day: Int) {
                    val date=day.toString()+"."+month.toString()+"."+year.toString()
                    makeText(applicationContext,date,Toast.LENGTH_SHORT).show()
                    val intent = Intent(applicationContext,dateActivity::class.java).apply {
                        putExtra("date",date)
                    }
                    startActivity(intent)
                }
            })
    }
}
