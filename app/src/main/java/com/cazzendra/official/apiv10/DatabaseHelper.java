package com.cazzendra.official.apiv10;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by 4m4l on 12/7/17.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Association.db";
    public static final String TABLE_NAME = "member";
    public static final String COL_1 = "memberId";
    public static final String COL_2 = "memberName";
    public static final String COL_3 = "memberBDate";
    public static final String COL_4 = "memberContact";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " +TABLE_NAME+ " " +
                "(memberId INTEGER PRIMARY KEY AUTOINCREMENT, memberName TEXT, memberBDate TEXT, memberContact TEXT )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }
}
