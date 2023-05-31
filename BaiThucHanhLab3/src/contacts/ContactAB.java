package contacts;
import java.util.Scanner;

public class ContactAB extends Contact{
    Scanner sc = new Scanner(System.in);
    DanhBa db = new DanhBa(); 
    int size = 0;

    String arrDB[] = new String [10];

<<<<<<< HEAD
    @Override
=======
>>>>>>> 6ebc0e1b7a4739c8920dead9d33bb241436aac2e
    public void GenerateDB(String FullName,String PhoneNum){
        for(int i = 0; i < arrDB.length; i++){
            FullName = "0";
            PhoneNum = "0";
            arrDB[i] = FullName + " - " + PhoneNum;

        }
    }

<<<<<<< HEAD
    @Override
    public void Insert(String FullName, String PhoneNum){
        
        for(int i = 0; i < arrDB.length; i++){
                    if(!arrDB[i].contains("0")){
                        System.out.println("Da co thong tin nguoi dung!");
                        i++;
                    }else{                         
                        db.addDataName();
                        db.addDataNum();
                        System.out.println("Da luu thong tin: " + arrDB[i]);
                        }
                    }
                } 
            
        
    @Override
    public void Update(String NewFullName, String SearchName, String NewPhoneNum){
        
=======
    public void Insert(String FullName,String SearchName, String PhoneNum){
        
        System.out.println("Nhap ten nguoi dung: ");
        SearchName = sc.nextLine();
        boolean kt = false;

        for(int i = 0; i < arrDB.length; i++){
            if(arrDB[i].contains(SearchName)){
               
                kt = true;
                System.out.println("Da co thong tin cua nguoi dung!");
                    FullName = SearchName;
                    if(!arrDB[i].contains(PhoneNum)){
                        System.out.println("Nguoi dung khong co so dien thoai!");
                        System.out.println("Nhap SDT nguoi dung: ");
                        PhoneNum = sc.nextLine();
                    }      
                    if( kt = false ){
                        System.out.println("Nhap ten nguoi dung: ");
                        FullName = sc.nextLine();
                        System.out.println("Nhap SDT nguoi dung: ");
                        PhoneNum = sc.nextLine();
                        System.out.println("Da luu thong tin: " + arrDB[i]);
                    }
                } 
            }
        
        }

    public void Update(String NewFullName, String SearchName, String NewPhoneNum){
        
        System.out.println("Nhap ten nguoi dung: ");
        SearchName = sc.nextLine();
>>>>>>> 6ebc0e1b7a4739c8920dead9d33bb241436aac2e
        boolean kt = false;

        for(int i = 0; i < arrDB.length; i++){
            if(arrDB[i].contains(SearchName)){
               
                kt = true;
                System.out.println("Da tim thay nguoi dung: " + arrDB[i]);

                System.out.println("Thay doi thong tin:");
                System.out.println("Nhap ten moi cua nguoi dung: ");
<<<<<<< HEAD
                db.updateName();
                db.updateNum();
=======
                NewFullName = sc.nextLine();
                System.out.println("Nhap ten moi cua nguoi dung: ");
                NewPhoneNum = sc.nextLine();
>>>>>>> 6ebc0e1b7a4739c8920dead9d33bb241436aac2e
                arrDB[i] = NewFullName + " - " + NewPhoneNum;  
            }

            if(kt = false){
                System.out.println("Khong tim thay nguoi dung!");
            }
        }
    }

<<<<<<< HEAD
    @Override
=======
>>>>>>> 6ebc0e1b7a4739c8920dead9d33bb241436aac2e
    public void Delete(String SearchName, String FullName, String PhoneNum) {
        boolean kt = false;

        for(int i = 0; i < arrDB.length; i++){
            if(arrDB[i].contains(SearchName)){
               
                kt = true;
                System.out.println("Da tim thay nguoi dung: " + arrDB[i]);

<<<<<<< HEAD
                db.removeUserName();
                db.removeUserNum();
=======
                FullName = null;
                PhoneNum = null;
>>>>>>> 6ebc0e1b7a4739c8920dead9d33bb241436aac2e
                arrDB[i] = FullName + " - " + PhoneNum;
                System.out.println("Da xoa nguoi dung! ");
            }
            
            if(kt = false){
                System.out.println("Khong tim thay nguoi dung!");
            }
        }
        
    }

<<<<<<< HEAD
    @Override
    public void Search(String SearchName, String FullName, String PhoneNum) {
        
=======
    public void Search(String SearchName, String FullName, String PhoneNum) {
        
        System.out.println("Nhap ten nguoi dung: ");
        SearchName = sc.nextLine();
>>>>>>> 6ebc0e1b7a4739c8920dead9d33bb241436aac2e
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

<<<<<<< HEAD
    @Override
=======
>>>>>>> 6ebc0e1b7a4739c8920dead9d33bb241436aac2e
    public void viewUsers(String FullName, String PhoneNum){
        for(int i = 0; i < arrDB.length; i++){
            System.out.println("=========================");
            System.out.println("\n");
<<<<<<< HEAD
            System.out.printf(" %d: %s", i+1, arrDB[i]);
=======
            System.out.printf(" %d: %s", i, arrDB[i]);
>>>>>>> 6ebc0e1b7a4739c8920dead9d33bb241436aac2e
            System.out.println("\n");
        }
        
    }
}  
