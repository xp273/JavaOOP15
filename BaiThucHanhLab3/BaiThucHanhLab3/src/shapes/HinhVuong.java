package shapes;
import java.util.Scanner;



public class HinhVuong extends HinhChuNhat{

    public float canh;
    Scanner sc= new Scanner(System.in);

    public HinhVuong(){
        ten = "Hinh Vuong";
    }
    
    public float getCanh(){
       return canh;
    }

    public void setCanh(float canh){
        this.canh = canh;
    }

    public void tinhChuVi(){
        chuVi = 4*canh;
    }

    public void tinhDienTich(){
        dienTich = canh*canh;
    }

}

