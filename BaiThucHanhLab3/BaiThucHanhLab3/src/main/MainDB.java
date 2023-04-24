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

        createDB(FullName, PhoneNum);
        while(true){

            System.out.println("Nhap lua chon: ");
            System.out.println("1 - Them nguoi dung");
            System.out.println("2 - Cap nhat thong tin nguoi dung");
            System.out.println("3 - Xoa thong tin nguoi dung");
            System.out.println("4 - Tim thong tin nguoi dung");
            System.out.println("5 - Danh sach nguoi dung");
            
            switch(sc.nextInt()){
                case 1 :InsertUser(FullName, PhoneNum, SearchName);
                        break;
                case 2 :UpdateUser(SearchName, NewFullName, NewPhoneNum);
                        break;
                case 3 :DeleteUser(SearchName, FullName, PhoneNum);
                        break;
                case 4 :SearchUser(SearchName, FullName, PhoneNum);
                        break;
                case 5 :viewAllUsers( FullName, PhoneNum);
                        break;
               }

            
            
            }
    }

    private static void InsertUser(String FullName, String PhoneNum, String SearchName){
        ct.Insert(SearchName, FullName, PhoneNum);
    }

    private static void UpdateUser(String SearchName, String NewFullName, String NewPhoneNum ){
        ct.Update(NewFullName, SearchName, NewPhoneNum);
    }

    private static void DeleteUser(String SearchName, String FullName, String PhoneNum){
        ct.Delete(SearchName, FullName, PhoneNum);
    }

    private static void SearchUser(String SearchName, String FullName, String PhoneNum){
        ct.Search(SearchName, FullName, PhoneNum);
    }

    private static void viewAllUsers(String FullName, String PhoneNum){
        ct.viewUsers(FullName, PhoneNum);
    }

    private static void createDB(String FullName, String PhoneNum){
        ct.GenerateDB(FullName, PhoneNum);
    }

   


}
