package com.example.weatherapp

import android.content.Context
import android.content.res.Resources
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import kotlin.coroutines.coroutineContext

class DBHelper(context: Context): SQLiteOpenHelper(context,"PLANTSDB",null,2) {

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE PLANTS(PLANTID INTEGER PRIMARY KEY AUTOINCREMENT,PLANTNAME TEXT, PLANTTYPE TEXT)")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName1+","+R.string.plantType1+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName2+","+R.string.plantType1+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName3+","+R.string.plantType1+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName4+","+R.string.plantType1+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName5+","+R.string.plantType1+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName6+","+R.string.plantType1+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName7+","+R.string.plantType1+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName8+","+R.string.plantType1+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName9+","+R.string.plantType1+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName10+","+R.string.plantType1+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName11+","+R.string.plantType1+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName12+","+R.string.plantType1+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName13+","+R.string.plantType1+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName14+","+R.string.plantType1+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName15+","+R.string.plantType1+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName16+","+R.string.plantType2+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName17+","+R.string.plantType2+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName18+","+R.string.plantType2+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName19+","+R.string.plantType2+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName20+","+R.string.plantType2+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName21+","+R.string.plantType2+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName22+","+R.string.plantType2+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName23+","+R.string.plantType2+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName24+","+R.string.plantType2+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName25+","+R.string.plantType2+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName26+","+R.string.plantType2+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName27+","+R.string.plantType2+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName28+","+R.string.plantType2+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName29+","+R.string.plantType2+")")
        db?.execSQL("INSERT INTO PLANTS(PLANTNAME, PLANTTYPE) VALUES ("+R.string.plantName30+","+R.string.plantType2+")")

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
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription15+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription16+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription17+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription18+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription19+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription20+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription21+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription22+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription23+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription24+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription25+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription26+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription27+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription28+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription29+")")
        db?.execSQL("INSERT INTO DESCRIPTIONS(DESCRIPTION) VALUES ("+R.string.plantDescription30+")")

        db?.execSQL("CREATE TABLE TASKS(TASKID INTEGER PRIMARY KEY AUTOINCREMENT,DATE TEXT, TASK TEXT)")
        db?.execSQL("INSERT INTO TASKS(DATE,TASK) VALUES ('25/4/2022','Fitonia B)')")

        db?.execSQL("CREATE TABLE PLANTSOWNED(PLANTID INTEGER PRIMARY KEY AUTOINCREMENT,PLANTNAME TEXT, PLANTAMOUNT INTEGER,TYPE TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {

    }
}