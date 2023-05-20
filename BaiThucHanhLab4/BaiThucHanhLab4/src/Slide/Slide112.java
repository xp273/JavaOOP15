package Slide;
import Slide.SinhVien.SinhVien;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Slide112 {
    public static void main(String[] args) {
    LinkedList<SinhVien> ListSV = new LinkedList<SinhVien>();
    LinkedList<SinhVien> ThiLai = new LinkedList<SinhVien>();
    LinkedList<SinhVien> DiemCao = new LinkedList<SinhVien>();
    Scanner sc = new Scanner(System.in);

    ListSV.NhapDSSV();
    ListSV.ThiLai();
    ListSV.DiemCao();
    ListSV.TimSV();
    
    sc.close();

    }
}