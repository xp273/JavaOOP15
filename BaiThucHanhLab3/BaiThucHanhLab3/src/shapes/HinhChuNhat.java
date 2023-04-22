package shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc{

    public float dai;
    public float rong;
    
    public HinhChuNhat(){
        ten = "Hinh chu nhat";
    }

    Scanner sc = new Scanner(System.in);

    public float getChieuDai(){
        return dai;
    }

    public void setChieuDai(float dai){
        this.dai = dai;
    }


    public float nhapChieuRong(){
        return rong;
    }
   
    public void setChieuRong(float rong){
        this.rong = rong;
    }

    public void tinhChuVi(){
        chuVi = 2*(dai+rong);
    }

    public void tinhDienTich(){
        dienTich = dai*rong;
    }

}


