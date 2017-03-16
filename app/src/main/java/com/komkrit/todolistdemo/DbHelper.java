package com.komkrit.todolistdemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Windows10 on 1/3/2560.
 */

public class DbHelper extends SQLiteOpenHelper {
    private static final String databaseName = "todolist.sqlite";
    private static final int databaseVersion = 1;
    Context myContext;

    private static final String tableCreateSQL = "CREATE TABLE todo_list("+
            "id INTEGER PRIMARY KEY AUTOINCREMENT,"+
            "todo_text TEXT"+");";

    public DbHelper(Context context){
        super(context, databaseName, null, databaseVersion);
        this.myContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tableCreateSQL);
        String insertData1 = "INSERT INTO todo_list (todo_text) VALUES ('Todo Text 1');";
        String insertData2 = "INSERT INTO todo_list (todo_text) VALUES ('Todo Text 2');";
        String insertData3 = "INSERT INTO todo_list (todo_text) VALUES ('Todo Text 3');";
        String insertData4 = "INSERT INTO todo_list (todo_text) VALUES ('Todo Text 4');";
        db.execSQL(insertData1);
        db.execSQL(insertData2);
        db.execSQL(insertData3);
        db.execSQL(insertData4);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
