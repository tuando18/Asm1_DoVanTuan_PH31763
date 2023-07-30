package com.dovantuan.Asm1_DoVanTuan_PH31763.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.dovantuan.Asm1_DoVanTuan_PH31763.DTO.CVDTO;
import com.dovantuan.Asm1_DoVanTuan_PH31763.DpHelper.DpHelper;

import java.util.ArrayList;
import java.util.List;

public class CVDAO {
    private SQLiteDatabase database;
    private DpHelper cachLK;

    public CVDAO(Context context) {
        cachLK = new DpHelper(context);
        database = cachLK.getWritableDatabase();
    }


    public long addCV(CVDTO cv) {
        ContentValues values = new ContentValues();
        values.put("id", cv.getId());
        values.put("tencv", cv.getTenCV());
        values.put("noidung", cv.getNoiDung());
        values.put("trangThai", cv.getTrangThai());
        values.put("ngaybatdau", cv.getNgayBatDau());
        values.put("ngayketthuc", cv.getNgayKetThuc());
        return database.insert("tb_cv", null, values);
    }

    public int updateCV(CVDTO cv) {
        ContentValues values = new ContentValues();
        values.put("id", cv.getId());
        values.put("tencv", cv.getTenCV());
        values.put("noidung", cv.getNoiDung());
        values.put("trangThai", cv.getTrangThai());
        values.put("ngaybatdau", cv.getNgayBatDau());
        values.put("ngayketthuc", cv.getNgayKetThuc());
        // điều kiện sửa
        String[] dieukien = new String[]{String.valueOf(cv.getId())};
        return database.update("tb_cv", values, "id=?", dieukien);
    }

    public int deleteCV(CVDTO cv) {
        String[] dieukien = new String[]{String.valueOf(cv.getId())};
        return database.delete("tb_cv", "id=?", dieukien);
    }

    public List<CVDTO> getAllCV() {
        List<CVDTO> listCat = new ArrayList<>();
        Cursor c = database.rawQuery("SELECT * FROM tb_cv", null);
        if (c != null && c.getCount() > 0) {
            c.moveToFirst();
            do { // thứ tự cột: 0-id, 1- name
                int id = c.getInt(0);
                String tencv = c.getString(1);
                String noidung = c.getString(2);
                int trangthai = c.getInt(4);
                String ngaybd = c.getString(5);
                String ngaykt = c.getString(6);

                // tạo đối tượng DTO
                CVDTO objCV = new CVDTO();
                objCV.setId(id);
                objCV.setTenCV(tencv);
                objCV.setNoiDung(noidung);
                objCV.setTrangThai(trangthai);
                objCV.setNgayBatDau(ngaybd);
                objCV.setNgayKetThuc(ngaykt);
                // cho vào ds
                listCat.add(objCV);

            } while (c.moveToNext());
        }
        return listCat;
    }
}

