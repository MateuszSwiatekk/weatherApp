package com.example.weatherapp

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context): SQLiteOpenHelper(context,"PLANTSDB",null,1) {

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE PLANTS(PLANTID INTEGER PRIMARY KEY AUTOINCREMENT,PLANTNAME TEXT)")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ('Aglaonema Zmienna')")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ('Ardizja Karbowana')")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ('Szafirek Armeński')")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ('Hiacynt')")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ('Tulipan')")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ('Irys Żółty')")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ('Galtonia Biaława')")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ('Cebulica Syberyjska')")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ('Szafirek Groniasty')")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ('Frezja')")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ('Begonia Bulwiasta')")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ('Kamasja')")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ('Zawilec Wieńcowy')")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ('Fitonia')")
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {

    }
}