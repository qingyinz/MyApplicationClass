package com.example.jinqh.myapplicationclass;


import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

public class User_Data {

    public Open_Sql dbHelper;

    public SQLiteDatabase db;
    Context mcontext;

    public User_Data(Context context) {
        this.mcontext = context;
        // 创建DatabaseHelper对象
        dbHelper = new Open_Sql(mcontext, "my.db", null, 1);
        db = dbHelper.getWritableDatabase(); // 创建 or 打开 可读/写的数据库

    //    Log.d(TAG, "ggggggggg" + db);


    }

    public List<classcourse_json> find(Integer id) {
        List<classcourse_json> classcourse_jsons = new ArrayList<classcourse_json>();
        Open_Sql dbHelper1 = new Open_Sql(mcontext, "my.db", null, 1);
        SQLiteDatabase db1 = dbHelper1.getReadableDatabase();

        //查询部分数据
        Cursor cursor = db1.rawQuery("select * from classcourse where zhouci = ?", new String[]{id.toString()});

     //   Log.d(TAG, "bbbbbbbbbbbbb" + cursor.getCount());
        if (cursor.moveToFirst() == false) {
            Toast.makeText(mcontext, "您的CC表中无数据！！！", Toast.LENGTH_SHORT).show();
        }
        cursor.moveToFirst();
        do {
            //遍历保存数据
            int name_id = cursor.getInt(cursor.getColumnIndex("id"));
            String name = cursor.getString(cursor.getColumnIndex("name"));
            int zhouci = cursor.getInt(cursor.getColumnIndex("zhouci"));
            int weizhi = cursor.getInt(cursor.getColumnIndex("weizhi"));
            classcourse_jsons.add(new classcourse_json(name_id, name, zhouci, weizhi));
            //    Log.d(TAG, "name_id:" + name_id + "name:" + name + "zhouci: " + zhouci + "weizhi: " + weizhi);

        } while (cursor.moveToNext());

        cursor.close();
        return classcourse_jsons;
    }
}
