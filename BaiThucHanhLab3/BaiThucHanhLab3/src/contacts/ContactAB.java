package contacts;
import java.util.Scanner;
    
    public class ContactAB extends Contact{ 
    
        Scanner sc = new Scanner(System.in);
       
        
        @Override
        public void CreateDB(){
        int size;
        System.out.println("So luong SDT: ");
        size = sc.nextInt();
        Object arrDB[] = new  Object [0];
        size = arrDB.length;
        }
        
    
        @Override
        public void Insert(arrDB[]){
            for(int i = 0; i < arrDB.length; i++){
                Danhba db = new Danhba();
                db.nhapTTin();
            }
    
            System.out.println("Danh sach lien he:");
            for(int i = 0; i < arrDB.length; i++){
               System.out.printf("Ten: %s, SDT: %s", arrDB[i].FullName, arrDB[i].PhoneNum);
            }
    
        }
        
        @Override
        public void Search(String name){
            for(int i = 0; i < arrDB.length; i++){
                boolean kt = true;
                if(arrDB[i].FullName.equals(name)){
                    kt = true;
                    System.out.printf("Ten: %s, SDT: %s", arrDB[i].FullName, arrDB[i].PhoneNum);
                }if(kt == false){
                    System.out.println("Khong tim thay thong tin");
                }
            }   
        }
    
    
        @Override
        public void Update(String name){
            for(int i = 0; i < arrDB.length; i++){
                boolean kt = true;
                if(arrDB[i].FullName.equals(name)){
                    kt = true;
                    System.out.printf("Ten: %s, SDT: %s", arrDB[i].FullName, arrDB[i].PhoneNum);
                    System.out.println("Ten moi:");
                    arrDB[i].FullName = sc.nextLine();
                    System.out.println("SDT moi:");
                    arrDB[i].PhoneNum = sc.nextLine();
                }if(kt == false){
    
                    System.out.println("Khong tim thay thong tin");
                }
            }   
        }
    
    
        @Override
        public void Delete(String name){
            for(int i = 0; i < arrDB.length; i++){
                boolean kt = true;
                if(arrDB[i].FullName.equals(name)){
                    kt = true;
                    System.out.printf("Ten: %s, SDT: %s", arrDB[i].FullName, arrDB[i].PhoneNum);
                    System.out.println("Ten moi:");
                    arrDB[i].FullName = null;
                    arrDB[i].PhoneNum = null;
                }if(kt == false){
                    System.out.println("Khong tim thay thong tin");
                }
            }   
        }
    
    }
    
    
    
    
    