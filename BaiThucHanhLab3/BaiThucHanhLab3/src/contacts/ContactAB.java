package contacts;
import java.util.Scanner;

public class ContactAB extends Contact{
    Scanner sc = new Scanner(System.in);
    DanhBa db = new DanhBa(); 
    int size = 0;

    String arrDB[] = new String [10];

    public void GenerateDB(String FullName,String PhoneNum){
        for(int i = 0; i < arrDB.length; i++){
            FullName = "0";
            PhoneNum = "0";
            arrDB[i] = FullName + " - " + PhoneNum;

        }
    }

    public void Insert(String FullName,String SearchName, String PhoneNum){
        
        boolean kt = false;

        for(int i = 0; i < arrDB.length; i++){
            if(arrDB[i].contains(SearchName)){
               
                kt = true;
                System.out.println("Da co thong tin cua nguoi dung!");
                    FullName = SearchName;

                if(!arrDB[i].contains(PhoneNum)){
                    System.out.println("Nguoi dung khong co so dien thoai!");
                    db.updateNum();
                } 
                    
                if( kt = false ){
                    db.addDataName();
                    db.addDataNum();
                    System.out.println("Da luu thong tin: " + arrDB[i]);
                }
            } 
        }
        
    }

    public void Update(String NewFullName, String SearchName, String NewPhoneNum){
        boolean kt = false;

        for(int i = 0; i < arrDB.length; i++){
            if(arrDB[i].contains(SearchName)){
               
                kt = true;
                System.out.println("Da tim thay nguoi dung: " + arrDB[i]);

                System.out.println("Thay doi thong tin:");
                db.updateName();
                db.updateNum();
                arrDB[i] = NewFullName + " - " + NewPhoneNum;  
            }

            if(kt = false){
                System.out.println("Khong tim thay nguoi dung!");
            }
        }
    }

    public void Delete(String SearchName, String FullName, String PhoneNum) {
        boolean kt = false;

        for(int i = 0; i < arrDB.length; i++){
            if(arrDB[i].contains(SearchName)){
               
                kt = true;
                System.out.println("Da tim thay nguoi dung: " + arrDB[i]);

                db.removeUserName();
                db.removeUserNum();
                arrDB[i] = FullName + " - " + PhoneNum;
                System.out.println("Da xoa nguoi dung! ");
            }
            
            if(kt = false){
                System.out.println("Khong tim thay nguoi dung!");
            }
        }
        
    }

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

    public void viewUsers(String FullName, String PhoneNum){
        for(int i = 0; i < arrDB.length; i++){
            System.out.println("=========================");
            System.out.println("\n");
            System.out.printf(" %d: %s", i, arrDB[i]);
            System.out.println("\n");
        }
        
    }
}  
