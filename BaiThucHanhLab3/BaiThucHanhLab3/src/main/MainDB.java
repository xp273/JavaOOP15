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

        createDB(FullName, NewPhoneNum);
        while(true){

            System.out.println("Nhap lua chon: ");
            System.out.println("1 - Them nguoi dung");
            System.out.println("2 - Cap nhat thong tin nguoi dung");
            System.out.println("3 - Xoa thong tin nguoi dung");
            System.out.println("4 - Tim thong tin nguoi dung");
            System.out.println("5 - Danh sach nguoi dung");
            
            switch(sc.nextInt()){
                case 1 :InsertUser();
                        break;
                case 2 :UpdateUser();
                        break;
                case 3 :DeleteUser();
                        break;
                case 4 :SearchUser();
                        break;
                case 5 :viewUsers();
                        break;
               }

            
            
            }
    }

    private static void InsertUser(){
        db.addData();
        ct.Insert(SearchName, FullName, PhoneNum);
    }

    private static void UpdateUser(){
        db.searchUser();
        ct.Update(NewFullName, SearchName, NewPhoneNum);
    }

    private static void DeleteUser(){
        db.searchUser();
        ct.Delete(SearchName, FullName, PhoneNum);
    }

    private static void SearchUser(){
        db.searchUser();
        ct.Search(SearchName, FullName, PhoneNum);
    }

    private static void viewUsers(){
        ct.viewUsers(FullName, PhoneNum);
    }

    private static void createDB(String FullName, String PhoneNum){
        ct.GenerateDB( FullName, PhoneNum);
    }

   


}
