package com.example.fitapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;




public class DatabaseAccess extends SQLiteOpenHelper {
    private static String DB_PATH="";
    private static  String DB_NAME = "RatingBar.db";
    private static String TABLE_NAME = "Ratings";
    private static String COL = "Rating";
    private SQLiteDatabase mdb;
    private Context mContext = null;

    public DatabaseAccess(Context context) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "(" + COL + " INTEGER " + ")";
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public void addData(int userRatings){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL, userRatings);
        long newRowId = db.insert(TABLE_NAME, null, values);
        db.close();
    }
}

