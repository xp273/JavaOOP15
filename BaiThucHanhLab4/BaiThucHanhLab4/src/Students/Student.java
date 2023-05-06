package Students;
import java.util.List;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;



public class Student{


        String FullName;
        int Age;
        Scanner sc = new Scanner(System.in);

        public void NhapTTin()
        {    
        System.out.println("Nhap ten SV: ");
        FullName =  sc.nextLine();
 
        System.out.println("Nhap tuoi SV: ");
        Age = sc.nextInt();
        }

        public static void HienThiList(List<Student> Stdlist){
            for(int i = 0; i < Stdlist.size(); i++){
            System.out.printf("Ten: %s, Tuoi: %d", Stdlist.get(i).FullName, Stdlist.get(i).Age);
            }
        }

        public static void HienThiSet(HashSet<Student> StdSet){
                Iterator<Student> iterator = StdSet.iterator();
                while (iterator.hasNext()){
                    System.out.println(iterator.next());
                    }
                }
}
    

