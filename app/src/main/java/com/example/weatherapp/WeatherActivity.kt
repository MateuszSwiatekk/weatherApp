package com.example.weatherapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.squareup.picasso.Picasso
import org.json.JSONObject
import java.text.SimpleDateFormat
import java.util.*


class WeatherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)
        val lat: String? = intent.getStringExtra("lat")
        val lon: String? = intent.getStringExtra("lon")
        getJsonData(lat,lon)

        val actionBar = supportActionBar
        actionBar!!.title = "Weather"

    }

    override fun onBackPressed() {
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

    private fun getJsonData(lat:String?,lon:String?) {
        val api = "8802f62a335137536bca74b88f993b60"
        val queue = Volley.newRequestQueue(this)
        val url = "https://api.openweathermap.org/data/2.5/onecall?lat=" + lat + "&lon=" + lon + "&units=metric&exclude=minutely,hourly,alerts&appid=" + api

            val jsonRequest = JsonObjectRequest(
                Request.Method.GET, url, null,
                {
                        response -> setValues(response)
                },
                {
                    makeText(this, "Something went wrong", Toast.LENGTH_LONG).show()
                },
            )
            queue.add(jsonRequest)
    }

    val dateDays = arrayOf(R.id.dateday1, R.id.dateday2, R.id.dateday3)
    val weatherDays = arrayOf(R.id.weatherday1, R.id.weatherday2, R.id.weatherday3)
    val iconDays = arrayOf(R.id.iconday1, R.id.iconday2, R.id.iconday3)

    private fun setValues(response: JSONObject) {
            try {
                for (i in 0..2) {
                    val daily = response.getJSONArray("daily").getJSONObject(i)?.getJSONObject("temp")
                    val icon = response.getJSONArray("daily").getJSONObject(i)?.getJSONArray("weather")?.getJSONObject(0)?.getString("icon")
                    val temperature = daily?.getDouble("day")?.toInt().toString()
                    val dateRaw = response.getJSONArray("daily").getJSONObject(i)?.getLong("dt")
                    val dateNormal = SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(Date(dateRaw!! * 1000))

                    findViewById<TextView>(dateDays[i]).text = dateNormal

                    findViewById<TextView>(weatherDays[i]).text = getString(R.string.day_temp, temperature)

                    val img = findViewById<ImageView>(iconDays[i])
                    Picasso.get()
                        .load("https://openweathermap.org/img/wn/" + icon + "@2x.png")
                        .resize(60, 60)
                        .into(img)
                }
                val updateTime = response.getJSONObject("current").getLong("dt")
                val updateTimeText = "Updated at: " + SimpleDateFormat("dd/MM/yyyy hh:mm a", Locale.ENGLISH).format(Date(updateTime * 1000))
                val temp = response.getJSONObject("current").getString("temp") + "°C"
                val city: String? = intent.getStringExtra("city")
                findViewById<TextView>(R.id.locationView).append(": " + city)
                findViewById<TextView>(R.id.temp).text = getString(R.string.current_temp, temp)
                findViewById<TextView>(R.id.updatedAt).text = updateTimeText

            } catch (e: Exception) {
                Log.d("TAG", "ERR")
                findViewById<TextView>(R.id.temp).text = getString(R.string.Error)
            }
    }
}

