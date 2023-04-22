package shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc{

    private final float PI = 3.14f;
    private float banKinh;
    public HinhTron(){
        ten = "Hinh Tron";
    }

    Scanner sc = new Scanner(System.in);

    public float getBanKink(){
        return banKinh;
    }

    public void setBanKinh(float banKinh){
        this.banKinh = banKinh;
    }

    public void tinhChuVi(){
        chuVi = 2 * PI * banKinh;
    }

    public void tinhDienTich(){
        dienTich = PI * banKinh * banKinh;
    }

}


