package shapes;
import java.util.Scanner;


public class HinhTru extends HinhTron{
    
    public float chieuCao;
    Scanner sc = new Scanner(System.in);

    public HinhTru(){
        ten = "Hinh tru";
    }

    public float getChieuCao(){
        return chieuCao;
    }

    public void setChieuCao(float chieuCao){
        this.chieuCao = chieuCao;
    }

    public void tinhTheTich(){
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }

    
}
