package models;
import utils.configs;


public class NVFullTime extends NhanVien{
    private int ngayLamViec; //Tong so ngay lam viec cua nhan vien
    
    public NVFullTime(String Ten, int ngayLamViec){
        this.Ten = Ten;                 //this -> Nhan vien
        this.ngayLamViec = ngayLamViec;
    }

    @Override
    public String loaiNV(){
        return "Nhan vien chinh thuc"; //Ghi de NhanVien.loaiNV
    }


    public void tinhLuong(){
        Luong = configs.Luong_NV_FullTime_Sep * ngayLamViec; //ngayLamViec * 800k
    }
}
