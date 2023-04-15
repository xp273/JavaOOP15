package main;

import shapes.HinhChuNhat;
import shapes.HinhTru;
import shapes.HinhVuong;
import shapes.HinhTron;

public class MainClass{

    public static void main(String[] args) {
        HinhTron hinhTron = new HinhTron();

        hinhTron.nhapBanKink();
        hinhTron.xuatTen();
        hinhTron.tinhChuVi();
        hinhTron.tinhDienTich();
        hinhTron.inChuVi();
        hinhTron.inDienTich();

        System.out.println("\n\n");

        HinhTru hinhTru = new HinhTru();
        hinhTru.xuatTen();
        hinhTru.nhapChieuCao();
        hinhTru.tinhTheTich();
        hinhTru.inTheTich();

        System.out.println("\n\n");

        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.xuatTen();
        hinhChuNhat.nhapChieuDai();
        hinhChuNhat.nhapChieuRong();
        hinhChuNhat.tinhChuVi();
        hinhChuNhat.tinhDienTich();
        hinhChuNhat.inChuVi();
        hinhChuNhat.inDienTich();

        System.out.println("\n\n");

        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.xuatTen();
        hinhVuong.nhapCanh();
        hinhVuong.tinhChuVi();
        hinhVuong.tinhDienTich();
        hinhVuong.inChuVi();
        hinhVuong.inDienTich();


        System.out.println("\n");


        //Override
            HinhTron htron = new HinhTron();
            HinhTru htru = new HinhTru();

            htron.xuatThongTin();
            htru.xuatThongTin();


        //class Object
        //Tao doi tuong hinh tron ht1
        HinhTron ht1 = new HinhTron(); //Tao doi tuong hinh tron ht1
        //getClass() - lay thong tin class cua doi tuong ht1
        System.out.print("Thong tin doi tuong hinh tron: " + ht1.getClass());
        System.out.println("\n");

        //getClass().getName() - lay ten class
        System.out.print("Thong tin doi tuong hinh tron: " + ht1.getClass().getName());
        System.out.println("\n");

        //getClass().getSimpleName - lay ten don gian cua class
        System.out.print("Thong tin doi tuong hinh tron: " + ht1.getClass().getSimpleName());
        System.out.println("\n");

        //test private
        HinhTron htron1 = new HinhTron();
        htron1.setBanKinh();
        htron1.tinhChuVi();
        htron1.tinhDienTich();
        htron1.inChuVi();
        htron1.inDienTich();

    
    }
}

