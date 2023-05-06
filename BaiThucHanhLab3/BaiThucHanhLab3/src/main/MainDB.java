package main;
import java.util.Scanner;
import contacts.ContactAB;
import contacts.DanhBa;

public class MainDB {
        static Scanner sc = new Scanner(System.in);
        static public  String SearchName, FullName, PhoneNum, NewFullName, NewPhoneNum;
        static ContactAB ct = new ContactAB();
        static DanhBa db = new DanhBa();
        static int n = 0;
        
    
    public static void main(String[] args) {

        ct.GenerateDB(FullName, PhoneNum);
        while(true){

            System.out.println("Nhap lua chon: ");
            System.out.println("1 - Them nguoi dung");
            System.out.println("2 - Cap nhat thong tin nguoi dung");
            System.out.println("3 - Xoa thong tin nguoi dung");
            System.out.println("4 - Tim thong tin nguoi dung");
            System.out.println("5 - Danh sach nguoi dung");
            
            switch(sc.nextInt()){
                case 1 :ct.Insert(FullName, PhoneNum);
                        break;
                case 2 :db.searchUser();
                        ct.Update(NewFullName, SearchName, NewPhoneNum);
                        break;
                case 3 :db.searchUser();
                        ct.Delete(SearchName, FullName, PhoneNum);
                        break;
                case 4 :db.searchUser();
                        ct.Search(SearchName, FullName, PhoneNum);
                        break;
                case 5 :ct.viewUsers(FullName, PhoneNum);
                        break;
               }
            }
    }

    
   


}
