package main;
import java.util.Scanner;
import contacts.ContactAB;
import contacts.DanhBa;

public class MainDB {
    Scanner sc = new Scanner(System.in);
        String SearchName, FullName, PhoneNum, NewFullName, NewPhoneNum;
        ContactAB ct = new ContactAB();
        DanhBa db = new DanhBa();
    public static void main(String[] args) {
        ;

        System.out.println("Nhap lua chon: ");
        System.out.println("1 - Them nguoi dung");
        System.out.println("2 - Cap nhat thong tin nguoi dung");
        System.out.println("3 - Xoa thong tin nguoi dung");
        System.out.println("4 - Tim thong tin nguoi dung");

        switch(sc.nextInt()){
            case 1: ct.Insert();
                    break;
            case 2: ct.Update();
                    break;
            case 3: ct.Delete();
                    break;
            case 4: ct.Search();
                    break;
        }           
    }

    public void Insert() {
        db.SearchUser();
        ct.Insert(SearchName, FullName, PhoneNum);      
    }

    public void Update() {
        db.SearchUser();
        ct.Insert(SearchName, NewFullName, NewPhoneNum);      
    }

    public void Delete() {
        db.SearchUser();
        ct.Insert(SearchName, FullName, PhoneNum);      
    }

    public void Search() {
        db.SearchUser();
        ct.Insert(SearchName, FullName, PhoneNum);      
    }


}
