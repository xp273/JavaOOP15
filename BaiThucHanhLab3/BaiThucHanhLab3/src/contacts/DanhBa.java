package contacts;
import java.util.Scanner;


public class DanhBa {
    Scanner sc = new Scanner(System.in);
    public String SearchName, FullName, PhoneNum, NewFullName, NewPhoneNum;


    public String searchUser(){
        System.out.println("Nhap ten nguoi dung: ");
        SearchName = sc.nextLine();
        return SearchName;
    }

    public String addDataName(){
        System.out.println("Nhap ten nguoi dung: ");
        FullName = sc.nextLine();
        return FullName;
    }

    public String addDataNum(){
        System.out.println("Nhap SDT nguoi dung: ");
        PhoneNum = sc.nextLine();
        return PhoneNum;
    }

    public String updateName(){
        System.out.println("Nhap ten moi cua nguoi dung: ");
        NewFullName = sc.nextLine();
        return NewFullName;
    }

    public String updateNum(){
        System.out.println("Nhap ten moi cua nguoi dung: ");
        NewPhoneNum = sc.nextLine();
        return NewPhoneNum;
    }
    
    public String removeUserName(){
        FullName = "0";
        return FullName;
    }

    public String removeUserNum(){
        PhoneNum = "0";
        return PhoneNum;
    }
}
