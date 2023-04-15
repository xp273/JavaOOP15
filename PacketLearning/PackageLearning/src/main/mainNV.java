package main;

import models.NVFullTime;
import models.NVPartTime;
import models.NhanVien;
import utils.configs;

public class mainNV {
    public static void main(String[] args) {
        //Set thong tin nvien
        
        // Chuc vu: Sep - Khong lam them
        NVFullTime Sep = new NVFullTime("Nguyen Van A", 0);
        
        //Sep.setLoaiChucVu(configs.NV_Sep); - Dat loai chuc vu su dung configs.Nv_Sep???

        // Chuc vu: Nhan vien - Khong lam them
        NVFullTime Linh1 = new NVFullTime("Tran Van B", 0);

        // Chuc vu: Nhan vien - Lam them 3 ngay
        NVFullTime Linh2 = new NVFullTime("Phan Van C", 3);

        // Chuc vu: Nhan vien thoi vu - Lam them 240h
        NVPartTime ThoiVu1 = new NVPartTime("Ho Van D", 240);

        //Tinh luong
        System.out.println("======== Luong ========");

        Sep.tinhLuong();
        Linh1.tinhLuong();
        Linh2.tinhLuong();
        ThoiVu1.tinhLuong();

        //In thong tin
        System.out.println("======== Thong tin nhan vien ========");

        Sep.inThongTin();
        Linh1.inThongTin();
        Linh2.inThongTin();
        ThoiVu1.inThongTin();



    }
    
}
