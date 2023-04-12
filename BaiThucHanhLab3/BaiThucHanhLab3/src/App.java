
public class App {
    public static void main(String[] args) {
        
        //Hinh tron
        HinhTron ht = new HinhTron();

        ht.nhapDuLieuHinhTron();
        ht.TinhCVDT();
        ht.inDuLieuHinhTron();

        //Hinh tru
        HinhTru htr = new HinhTru();

        htr.nhapDuLieuHinhTru();
        htr.TinhCVDTTT();
        htr.inDuLieuHinhTru();

        //Nhan vien
        NhanVien nv1 = new NhanVien();

        nv1.nhapThongTinNhanVien();
        nv1.nhapHeSoLuong();
        nv1.tinhLuongNhanVien();
        nv1.inThongTinNhanVien();
       
    }
    
}
