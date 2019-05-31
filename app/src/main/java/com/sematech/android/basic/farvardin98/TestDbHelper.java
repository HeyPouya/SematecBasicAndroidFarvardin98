package com.sematech.android.basic.farvardin98;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class TestDbHelper extends SQLiteOpenHelper {

    String TABLE_NAME = "weather";
    String CREATE_TABLE_QRY = "" +
            "CREATE TABLE " +
            TABLE_NAME +
            "(" +
            "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
            "city TEXT," +
            "temperature INTEGER" +
            ")" +
            "";


    public TestDbHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_QRY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    public void insertData(String city, int temperature) {
        String insertDataIntoDB = "" +
                "INSERT INTO " +
                TABLE_NAME +
                "(" +
                "city," +
                "temperature" +
                ")" +
                "VALUES" +
                "(" +
                "'" + city + "'" + "," +
                temperature +
                ")" +
                "";
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(insertDataIntoDB);
        db.close();
    }


    public String getCities() {
        String cities = "";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT city FROM " + TABLE_NAME, null);

        while (cursor.moveToNext()) {
            cities += cursor.getString(0) + "\n";
        }

        db.close();
        return cities;
    }
}
