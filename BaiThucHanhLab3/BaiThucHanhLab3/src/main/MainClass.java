package main;

import shapes.HinhChuNhat;
import shapes.HinhTru;
import shapes.HinhVuong;
import shapes.HinhTron;

public class MainClass{

    public static void main(String[] args) {

        System.out.println("Hinh chu nhat:");

       HinhChuNhat hcn1 = new HinhChuNhat();
            hcn1.setChieuDai(10);
            hcn1.setChieuRong(5);
            hcn1.tinhChuVi();
            hcn1.tinhDienTich();
            hcn1.inChuVi();
            hcn1.inDienTich();

        System.out.println("=================================");

        System.out.println("Hinh tron:");

        HinhTron ht1 = new HinhTron();
            ht1.setBanKinh(5);
            ht1.tinhChuVi();
            ht1.tinhDienTich();
            ht1.inChuVi();
            ht1.inDienTich();

        System.out.println("=================================");

        System.out.println("Hinh tru:");

        HinhTru htr1 = new HinhTru();
            htr1.setBanKinh(5);
            htr1.setChieuCao(10);
            htr1.tinhChuVi();
            htr1.tinhDienTich();
            htr1.tinhTheTich();
            htr1.inChuVi();
            htr1.inDienTich();
            htr1.inTheTich();

        System.out.println("=================================");

        System.out.println("Hinh vuong:");

        HinhVuong hv1 = new HinhVuong();
            hv1.setCanh(10);
            hv1.tinhChuVi();
            hv1.tinhDienTich();
            hv1.inChuVi();
            hv1.inDienTich();

         System.out.println("=================================");

    }
}

