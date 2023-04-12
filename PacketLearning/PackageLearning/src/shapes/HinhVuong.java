package shapes;
import java.util.Scanner;


public class HinhVuong extends HinhChuNhat{

    Scanner sc= new Scanner(System.in);

    public HinhVuong(){
        ten = "Hinh Vuong";
    }
    
    public void nhapCanh(){
        System.out.print("Canh = ");
        dai = rong = sc.nextFloat();
    }
}
