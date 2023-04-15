package models;
import utils.configs;


public class NVPartTime extends NhanVien{
    private int gioLamViec; //Tong so gio lam viec cua nhan vien
    
    public NVPartTime(String Ten, int gioLamViec){
        this.Ten = Ten;                 //this -> Nhan vien
        this.gioLamViec = gioLamViec;
    }

    @Override
    public String loaiNV(){
        return "Nhan vien thoi vu"; //Ghi de NhanVien.loaiNV
    }

    public void tinhLuong(){
        Luong = configs.Luong_NV_PartTime_MoiGio * gioLamViec; //gioLamViec * 100k
    }
}
