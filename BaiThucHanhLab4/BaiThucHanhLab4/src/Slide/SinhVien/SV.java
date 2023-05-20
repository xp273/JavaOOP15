package Slide.SinhVien;
import java.util.HashMap;
import java.util.Scanner;



public class SV {
    public String FullName;
    public String ID;
    public String Class;
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, SV> ListSv = new HashMap<>();

    public void NhapTTin(){
        System.out.println("Nhap ho ten sinh vien");
        FullName = sc.nextLine();
        System.out.println("Nhap ma so sinh vien");
        ID = sc.nextLine();
        System.out.println("Nhap lop sinh vien");
        Class = sc.nextLine();
        }

    public void NhapSV(HashMap<SV, Integer> ListSv){
        System.out.println("So SV can nhap: ");
        int size = sc.nextInt();

        for(int i = 0; i < size; i++){
            SV sinhvien = new SV();
            sinhvien.NhapTTin();
            ListSv.put(sinhvien, i);
        }
    }

    public void ListSVLop(HashMap<SV, Integer> ListSv){
        System.out.println("Nhap ten lop can tim: ");
        String searchClass = sc.nextLine();
        for(int i = 0; i < ListSv.size(); i++){
            if(ListSv.)
        }


    }

    
    
}
