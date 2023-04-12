package shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc{

    public float dai;
    public float rong;
    
    public HinhChuNhat(){
        ten = "Hinh chu nhat";
    }

    Scanner sc = new Scanner(System.in);

    public void nhapChieuDai(){
        System.out.print("Hay nhap chieu dai hinh chu nhat: ");
        dai = sc.nextFloat();
    }

    public void nhapChieuRong(){
        System.out.print("Hay nhap chieu rong hinh chu nhat: ");
        rong = sc.nextFloat();
    }

    public void tinhChuVi(){
        chuVi = 2*(dai+rong);
    }

    public void tinhDienTich(){
        dienTich = dai*rong;
    }

}


