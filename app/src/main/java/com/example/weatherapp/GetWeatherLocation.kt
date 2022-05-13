package com.example.weatherapp

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Address
import android.location.Geocoder
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import java.util.*


class GetWeatherLocation : AppCompatActivity() {

    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient

    override fun onCreate(savedInstanceState: Bundle?) {

        val actionBar = supportActionBar
        actionBar!!.title = "Weather"



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_weather_location)
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)
        val task = fusedLocationProviderClient.lastLocation
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
            && ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                101
            )
        }
        task.addOnSuccessListener {
            if (it != null) {
                val geocoder = Geocoder(this, Locale.getDefault())
                val addresses: List<Address> =
                    geocoder.getFromLocation(it.latitude, it.longitude, 1)
                val cityName: String = addresses[0].subAdminArea + ", " + addresses[0].countryName

                val intent = Intent(this, WeatherActivity::class.java).apply {
                    putExtra("lat", it.latitude.toString())
                    putExtra("lon", it.longitude.toString())
                    putExtra("city", cityName)
                }
                startActivity(intent)
            }
            if (it==null){
                Toast.makeText(applicationContext,"Please enable internet and location services",Toast.LENGTH_SHORT).show()
            }
        }
    }
    fun onRefreshClicked(view:View){
        finish()
        startActivity(intent)
    }
}
