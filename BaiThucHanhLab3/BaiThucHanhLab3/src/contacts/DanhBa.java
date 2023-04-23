package contacts;
import java.util.Scanner;

public class DanhBa {
    Scanner sc = new Scanner(System.in);
    public String SearchName, FullName, PhoneNum;


    public void SearchUser(){
        System.out.println("Nhap ten nguoi dung: ");
        SearchName = sc.nextLine();
    }

    public void addData(){
        System.out.println("Nhap ten nguoi dung: ");
        FullName = sc.nextLine();
        System.out.println("Nhap SDT nguoi dung: ");
        PhoneNum = sc.nextLine();
    }
    
}
