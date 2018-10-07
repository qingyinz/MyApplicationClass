package com.example.jinqh.myapplicationclass;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * 创建数据库子类，继承自SQLiteOpenHelper类
 * 需 复写 onCreat（）、onUpgrade（）
 */
public class Open_Sql extends SQLiteOpenHelper {
    // 数据库版本号
    private static Integer Version = 1;
    //新建一个SQLiteOpenHelper的对象，在之后初始化时会用到
    public static Open_Sql mySQLiteOpenHelp;

    //设置你自己的数据库名称
    public static final String DATABASE_NAME = "my.db";


    /**
     * 构造函数
     * 在SQLiteOpenHelper的子类中，必须有该构造函数
     */


    public Open_Sql(Context context, String name, SQLiteDatabase.CursorFactory factory,
                    int version) {
        super(context, name, factory, version);
        // 参数说明
        // context：上下文对象
        // name：数据库名称
        // version：当前数据库的版本，值必须是整数并且是递增的状态
        // 必须通过super调用父类的构造函数
    }

    /**
     * 复写onCreate（）
     * 调用时刻：当数据库第1次创建时调用
     * 作用：创建数据库 表 & 初始化数据
     * SQLite数据库创建支持的数据类型： 整型数据、字符串类型、日期类型、二进制
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        // 创建数据库1张表
        // 通过execSQL（）执行SQL语句（此处创建了1个名为classcourse的表）
        String sql = "create table classcourse(id integer primary key autoincrement,name varchar(64),zhouci int(10),weizhi int(10))";
        db.execSQL(sql);

        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406', 6,11 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406', 7,11 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406', 8,11 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406', 10,11 )");


        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 2,21 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 3,21 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 4,21 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 5,21 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 6,21 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 7,21 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 8,21 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 9,21 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 10,21 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 11,21 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 12,21 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 13,21 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 14,21 )");


        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 2,12 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 3,12 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 4,12 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 5,12 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 6,12 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 7,12 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 8,12 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 10,12 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 11,12 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 12,12 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 13,12 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 14,12 )");


        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405', 2,22 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405', 3,22 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405', 4,22 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405', 5,22 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405', 6,22 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405', 7,22 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405', 8,22 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405', 9,22 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405', 10,22 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405', 11,22 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405', 12,22 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405', 13,22 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405', 14,22 )");


        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408',4 ,13 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408',6 ,13 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 10,13 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 11,13 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408', 12,13 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408',13 ,13 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '智能设备应用开发 3-408',14 ,13 )");


        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404',2 ,23 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404',3 ,23 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404',4 ,23 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404',6 ,23 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404',7 ,23 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404',8 ,23 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404', 10,23 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404', 11,23 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404',12 ,23 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404',13 ,23 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404',14 ,23 )");


        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405', 2,33 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405',3 ,33 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405', 4,33 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405', 6,33 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405',7 ,33 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405', 8,33 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405', 10,33 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405',11 ,33 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405', 12,33 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405',13 ,33 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405', 14,33 )");


        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405', 2,14 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405',4 ,14 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405',6 ,14 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405', 8,14 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405',10 ,14 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网项目实战 3-405',12 ,14 )");

        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406', 2,34 )");

        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406', 3,34 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406',4 ,34 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406',5 ,34 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406',6 ,34 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406',7 ,34 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406', 8,34 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406',9 ,34 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406', 10,34 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406',11 ,34 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406',12 ,34 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406',13 ,34 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406',14 ,34 )");


        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404',2 ,44 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404',4 ,44 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404',6 ,44 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404',8 ,44 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404',10 ,44 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404',12 ,44 )");


        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404', 2,25 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404',3 ,25 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404',4 ,25 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404',6 ,25 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404',7 ,25 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404', 8,25 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404',10 ,25 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404',11 ,25 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404',12 ,25 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404',13 ,25 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '电子工程制图 3-404',14 ,25 )");

        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406', 2,35 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406',3 ,35 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406',4 ,35 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406',5 ,35 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406',6 ,35 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406',7 ,35 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406',8 ,35 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406', 9,35 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406',10 ,35 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406',11 ,35 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406', 12,35 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406',13 ,35 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '物联网系统集成技术 3-406',14 ,35 )");


        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '求职能力提升训练 3-404', 2,45 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '求职能力提升训练 3-404',3 ,45 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '求职能力提升训练 3-404', 4,45 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '求职能力提升训练 3-404',6 ,45 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '求职能力提升训练 3-404',7 ,45 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '求职能力提升训练 3-404',8 ,45 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '求职能力提升训练 3-404', 10,45 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '求职能力提升训练 3-404',11 ,45 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '求职能力提升训练 3-404',12 ,45 )");
        db.execSQL("insert into classcourse  ( name, zhouci, weizhi) values ( '求职能力提升训练 3-404',14 ,45 )");
        // 注：数据库实际上是没被创建 / 打开的（因该方法还没调用）
        // 直到getWritableDatabase() / getReadableDatabase() 第一次被调用时才会进行创建 / 打开


    }

    /**
     * 复写onUpgrade（）
     * 调用时刻：当数据库升级时则自动调用（即 数据库版本 发生变化时）
     * 作用：更新数据库表结构
     * 注：创建SQLiteOpenHelper子类对象时,必须传入一个version参数，该参数 = 当前数据库版本, 若该版本高于之前版本, 就调用onUpgrade()
     */

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
