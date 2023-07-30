package com.dovantuan.Asm1_DoVanTuan_PH31763.DTO;

public class CVDTO {

    private int id;
    private String tenCV;
    private String noiDung;
    private int trangThai;
    private String ngayBatDau;
    private String ngayKetThuc;

    public CVDTO() {
        this.id = id;
        this.tenCV = tenCV;
        this.noiDung = noiDung;
        this.trangThai = trangThai;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getId() {
        return id;
    }

    public String getTenCV() {
        return tenCV;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    @Override
    public String toString() {
        return "CVDTO{" +
                "id=" + id +
                ", tenCV='" + tenCV + '\'' +
                ", noiDung='" + noiDung + '\'' +
                ", trangThai=" + trangThai +
                ", ngayBatDau='" + ngayBatDau + '\'' +
                ", ngayKetThuc='" + ngayKetThuc + '\'' +
                '}';
    }
}


