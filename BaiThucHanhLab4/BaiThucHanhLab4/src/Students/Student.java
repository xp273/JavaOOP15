package Students;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;


public class Student{

        String FullName;
        int Age;
        Scanner sc = new Scanner(System.in);

        public void NhapTTin(){    
        System.out.println("Nhap ten SV: ");
        FullName =  sc.nextLine();
 
        System.out.println("Nhap tuoi SV: ");
        Age = sc.nextInt();
        }

        public void HienThiList(List<Student> Stdlist){
            for(int i = 0; i < Stdlist.size(); i++){
            System.out.printf("Hoc sinh thu %d", i);
            System.out.printf("Ten: %s, Tuoi: %d", Stdlist.get(i).FullName, Stdlist.get(i).Age);
            System.out.println("===================================");
            }
        }

        public void HienThiSet(Set<Student> StdSet){
            System.out.println("Thong tin StdList: " + "\n");
            Iterator<Student> ite = StdSet.iterator();
            while(ite.hasNext()){
                Student value = ite.next();
                System.out.println(value.FullName);
                System.out.println(value.Age);
                System.out.println("==================================");
                }
    }   
}    
    

