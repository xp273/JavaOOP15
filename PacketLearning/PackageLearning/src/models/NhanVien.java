package models;

import utils.configs;


public class NhanVien {
    protected String Ten;
    protected long Luong;
    protected int ChucVu;

    public NhanVien() {}
    public NhanVien(String Ten, int loaiChucVu){
        this.Ten = Ten;
    }

    protected String loaiNV(){
        return""; //String trong, ghi de boi lop con (NvPartTime)
    }


    public void inThongTin(){
        System.out.println("=== Nhan vien: " + Ten + "===");
        System.out.println("- Loai nhan vien: " + loaiNV());
        System.out.println("- Luong: " + Luong + " VND");
    }
}
