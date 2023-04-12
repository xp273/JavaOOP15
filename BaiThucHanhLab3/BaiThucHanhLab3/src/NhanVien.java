import java.util.Scanner;


public class NhanVien {

    Scanner sc = new Scanner(System.in);

    String Ten;
    int tuoi;
    float hsl = 0;
    float luong = 0, lcb = 1490000;

    public void nhapThongTinNhanVien()
    {
        System.out.print("Nhap ho ten nhan vien: ");
        Ten = sc.nextLine();
        System.out.print("Nhap tuoi nhan vien: ");
        tuoi = sc.nextInt();
    }

    public void nhapHeSoLuong()
    {
        System.out.print("Nhap he so luong cua nhan vien: ");
        hsl = sc.nextFloat();
    }

    public void tinhLuongNhanVien()
    {
        luong = hsl * lcb;
    }

    public void inThongTinNhanVien()
    {
        System.out.println("Nhan vien " + Ten + " - " + tuoi + " tuoi");
        System.out.printf("Luong cua nhan vien: %f VND", luong);
    }
}
