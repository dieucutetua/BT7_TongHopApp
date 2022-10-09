package com.example.taoapptonghop;

public class ThuVien {
    private String tenSach;
    private String chitiet;
    private String gia;
    private int hinh;

    public ThuVien(String tenSach, String chitiet, String gia, int hinh) {
        this.tenSach = tenSach;
        this.chitiet = chitiet;
        this.gia = gia;
        this.hinh = hinh;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getChitiet() {
        return chitiet;
    }

    public void setChitiet(String chitiet) {
        this.chitiet = chitiet;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
