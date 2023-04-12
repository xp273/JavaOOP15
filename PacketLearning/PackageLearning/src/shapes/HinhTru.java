package shapes;
import java.util.Scanner;

public class HinhTru extends HinhTron{
    
    public float chieuCao;
    Scanner sc = new Scanner(System.in);

    public HinhTru(){
        ten = "Hinh tru";
    }

    public void nhapChieuCao(){
        nhapBanKink();

        System.out.print("Hay nhap chieu cao hinh tru:  ");
        chieuCao = sc.nextFloat();
    }

    public void tinhTheTich(){
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}
