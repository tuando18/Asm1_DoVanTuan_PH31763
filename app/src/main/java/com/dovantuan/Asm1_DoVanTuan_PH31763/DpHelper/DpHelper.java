package com.dovantuan.Asm1_DoVanTuan_PH31763.DpHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DpHelper extends SQLiteOpenHelper {
    static  String DB_NAME = "QuanLy_SinhVien";
    static int DB_VERSION = 1;
    public DpHelper(Context context){
        super(context,DB_NAME, null,DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql_tb_cv = "CREATE TABLE cong_viec (\n" +
                "    id         INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "    ten        TEXT,\n" +
                "    noi_dung   TEXT,\n" +
                "    trang_thai INTEGER,\n" +
                "    bat_dau    TEXT,\n" +
                "    ket_thuc   TEXT\n" +
                ");";
        db.execSQL(sql_tb_cv);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       db.execSQL("DROP TABLE cong_viec");
       onCreate(db);
    }
}
