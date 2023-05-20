package Slide.SinhVien;
import java.util.List;
import java.util.Scanner;

public class SinhVien {
    public String FullName;
    public Float Diem;
    Scanner sc = new Scanner(System.in);

    public void NhapThongTin(){
        System.out.println("Nhap ten SV: ");
        FullName = sc.nextLine();
        System.out.println("Nhap diem SV: ");
        Diem = sc.nextFloat();
    }
    
    public void NhapDSSV(List<SinhVien> ListSV){
        System.out.println("So sinh vien can nhap: ");
        int size = sc.nextInt();

        System.out.println("Nhap thong tin SV");
        for(int i = 0; i < size; i++){
        SinhVien SV = new SinhVien();
        SV.NhapThongTin();
        if((SV.FullName.equals(""))){
            break;} else
        ListSV.add(i, SV);   
        }
    
        System.out.println("Danh sach SV: ");
        for(int i = 0; i < ListSV.size(); i++){
            System.out.printf("Sinh vien thu %d: ", i + 1);
            System.out.println("Ten: " + ListSV.get(i).FullName + "- Diem: " + ListSV.get(i).Diem);
            System.out.println("-------------------------------------------");
        }
    }

    public void ThiLai(List<SinhVien> ListSV, List<SinhVien> ThiLai){
        for(int i = 0; i < ListSV.size(); i++){
            if(ListSV.get(i).Diem <= 5){
                ThiLai.add(i, ListSV.get(i));
            }
        }
    
        System.out.println("Danh sach thi lai: ");
        for(int i = 0; i < ThiLai.size(); i++){
            System.out.printf("Sinh vien thu %d: ", i + 1);
            System.out.println("Ten: " + ThiLai.get(i).FullName + "- Diem: " + ThiLai.get(i).Diem);
            System.out.println("-------------------------------------------");
        }
    }

    public void TimMax(List<SinhVien> ListSV, List<SinhVien> DiemCao){
        float max = ListSV.get(0).Diem;
        for(int i = 1; i < ListSV.size(); i++){
            if(ListSV.get(i).Diem > max)
            {
                max = ListSV.get(i).Diem;
            }
        }

        for(int i = 0; i < ListSV.size(); i++){
            if(ListSV.get(i).Diem == max)
            {
                DiemCao.add(ListSV.get(i));
            }
        }

    System.out.println("Danh sach SV co diem cao nhat: ");
    for(int i = 0; i < DiemCao.size(); i++){
        System.out.printf("Sinh vien thu %d: ", i + 1);
        System.out.println("Ten: " + DiemCao.get(i).FullName + "- Diem: " + DiemCao.get(i).Diem);
        System.out.println("-------------------------------------------");
        }
    }

    public void TimSV(List<SinhVien> ListSV){
        String searchName;
        System.out.println("Nhap ten SV can tim: ");
        searchName = sc.nextLine();
        System.out.println("Danh sach SV can tim: ");
        for(int i = 0; i < ListSV.size(); i++){
        if(ListSV.get(i).FullName == searchName)
            {
            System.out.println(ListSV.get(i));
            }
        }
    }
}
