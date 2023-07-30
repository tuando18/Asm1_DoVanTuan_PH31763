package com.dovantuan.Asm1_DoVanTuan_PH31763.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.dovantuan.Asm1_DoVanTuan_PH31763.DTO.CVDTO;
import com.dovantuan.Asm1_DoVanTuan_PH31763.R;

import java.util.List;

public class CVApdater extends BaseAdapter {
    List<CVDTO> listcv;
    Context context;

    public CVApdater(List<CVDTO> listcv, Context context) {
        this.listcv = listcv;
        this.context = context;
    }


    @Override
    public int getCount() {
        return listcv.size();
    }

    @Override
    public Object getItem(int position) {
        return listcv.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listcv.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        if (convertView == null) {
            row = View.inflate(context, R.layout.hienthithongtin, null);
        } else
            row = convertView;
            CVDTO objcv = listcv.get(position);

            TextView tv_id = row.findViewById(R.id.tv_id);
            TextView tv_ten = row.findViewById(R.id.tv_ten);

            TextView tv_nd = row.findViewById(R.id.tv_noidung);
            TextView tv_trangthai = row.findViewById(R.id.tv_trangthai);
            TextView tv_ngaybd = row.findViewById(R.id.tv_ngaybd);
            TextView tv_ngkt = row.findViewById(R.id.tv_ngaykt);

            tv_id.setText(objcv.getId() + "");
            tv_ten.setText(objcv.getTenCV());
            tv_nd.setText(objcv.getNoiDung());
            tv_trangthai.setText(objcv.getTrangThai() + "");
            tv_ngaybd.setText(objcv.getNgayBatDau());
            tv_ngkt.setText(objcv.getNgayKetThuc());

        return row;
    }
}
