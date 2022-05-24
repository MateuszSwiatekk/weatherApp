package com.example.weatherapp

import android.content.Context
import android.content.res.Resources
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import kotlin.coroutines.coroutineContext

class DBHelper(context: Context): SQLiteOpenHelper(context,"PLANTSDB",null,1) {

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE PLANTS(PLANTID INTEGER PRIMARY KEY AUTOINCREMENT,PLANTNAME TEXT)")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ("+R.string.plantName1+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ("+R.string.plantName2+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ("+R.string.plantName3+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ("+R.string.plantName4+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ("+R.string.plantName5+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ("+R.string.plantName6+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ("+R.string.plantName7+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ("+R.string.plantName8+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ("+R.string.plantName9+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ("+R.string.plantName10+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ("+R.string.plantName11+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ("+R.string.plantName12+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ("+R.string.plantName13+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME) VALUES ("+R.string.plantName14+")")

        db?.execSQL("CREATE TABLE DESCRIPTIONS(DESCRIPTIONID INTEGER PRIMARY KEY AUTOINCREMENT,DESCRIPTION TEXT)")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription1+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription2+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription3+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription4+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription5+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription6+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription7+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription8+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription9+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription10+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription11+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription12+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription13+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription14+")")
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {

    }
}