package contacts;
import java.util.Scanner;

public class ContactAB extends Contact{
    Scanner sc = new Scanner(System.in);
    DanhBa db = new DanhBa(); 
    int size = 0;

    String arrDB[] = new String [10];

    @Override
    public void Insert(String FullName,String SearchName, String PhoneNum){
        
        boolean kt = false;

        for(int i = 0; i < arrDB.length; i++){
            if(arrDB[i].contains(SearchName)){
               
                kt = true;
                System.out.println("Da co thong tin cua nguoi dung!");

                if(!arrDB[i].contains(PhoneNum)){
                    System.out.println("Nguoi dung khong co so dien thoai, nhap so dien thoai cua nguoi dung: ");
                    PhoneNum = sc.nextLine();
                } 
                    
                if( kt = false ){
                    System.out.println("Nhap ten nguoi dung can them:");
                    FullName = sc.nextLine();
                    System.out.println("Nhap SDT:");
                    PhoneNum = sc.nextLine();
                    arrDB[i] = FullName + " - " + PhoneNum;
                    System.out.println("Da luu thong tin: " + arrDB[i]);
                }
            } 
        }
        
    }

    @Override
    public void Update(String NewFullName, String SearchName, String NewPhoneNum){
        boolean kt = false;

        for(int i = 0; i < arrDB.length; i++){
            if(arrDB[i].contains(SearchName)){
               
                kt = true;
                System.out.println("Da tim thay nguoi dung: " + arrDB[i]);

                System.out.println("Thay doi thong tin:");
                System.out.println("Thay doi ten: ");
                NewFullName = sc.nextLine();
                System.out.println("Thay doi SDT: ");
                NewPhoneNum = sc.nextLine();
                arrDB[i] = NewFullName + " - " + NewPhoneNum;  
            }

            if(kt = false){
                System.out.println("Khong tim thay nguoi dung!");
            }
        }
    }

    @Override
    public void Delete(String SearchName, String FullName, String PhoneNum) {
        boolean kt = false;

        for(int i = 0; i < arrDB.length; i++){
            if(arrDB[i].contains(SearchName)){
               
                kt = true;
                System.out.println("Da tim thay nguoi dung: " + arrDB[i]);

                FullName = null;
                PhoneNum = null;
                arrDB[i] = FullName + " - " + PhoneNum;
                System.out.println("Da xoa nguoi dung! ");
            }
            
            if(kt = false){
                System.out.println("Khong tim thay nguoi dung!");
            }
        }
        
    }

    @Override
    public void Search(String SearchName, String FullName, String PhoneNum) {
        boolean kt = false;
        
        for(int i = 0; i < arrDB.length; i++){
            if(arrDB[i].contains(SearchName)){
               
                kt = true;
                System.out.println("Da tim thay nguoi dung: " + arrDB[i]);
            }
            
            if(kt = false){
                System.out.println("Khong tim thay nguoi dung!");
            }
        }
        
        
    } 
}  
