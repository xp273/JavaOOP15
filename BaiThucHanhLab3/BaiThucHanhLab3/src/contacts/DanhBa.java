package contacts;
import java.util.Scanner;

public class DanhBa {
    Scanner sc = new Scanner(System.in);
    public String SearchName, FullName, PhoneNum, NewFullName, NewPhoneNum;


    public void searchUser(){
        System.out.println("Nhap ten nguoi dung: ");
        SearchName = sc.nextLine();
    }

    public void addData(){
        System.out.println("Nhap ten nguoi dung: ");
        FullName = sc.nextLine();
        System.out.println("Nhap SDT nguoi dung: ");
        PhoneNum = sc.nextLine();
    }

    public void updateName(){
        System.out.println("Nhap ten moi cua nguoi dung: ");
        NewFullName = sc.nextLine();
    }

    public void updateNum(){
        System.out.println("Nhap ten moi cua nguoi dung: ");
        NewPhoneNum = sc.nextLine();
    }
    
    public void removeUser(){
        FullName = null;
        PhoneNum = null;
    }


}
