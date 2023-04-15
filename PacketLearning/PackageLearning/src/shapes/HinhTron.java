package shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc{

    private final float PI = 3.14f;
    private float banKinh;
    public HinhTron(){
        ten = "Hinh Tron";
    }

    Scanner sc = new Scanner(System.in);

    public void nhapBanKink(){
        System.out.print("Hay nhap ban kinh hinh tron: ");
        banKinh = sc.nextFloat();
    }

    public void setBanKinh(){
        System.out.print("Hay nhap ban kinh hinh tron: ");
        this.banKinh = sc.nextFloat();
    }

    public void tinhChuVi(){
        chuVi = 2 * PI * banKinh;
    }

    public void tinhDienTich(){
        dienTich = PI * banKinh * banKinh;
    }


    public void xuatThongTin(){
        System.out.println("Day la hinh tron");
    }
}


