package Demo;
import Students.Student;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Student> StdHashSet = new HashSet<Student>();

        System.out.println("Nhap so phan tu can nhap");
        int size = sc.nextInt();

        for(int i = 0; i< size; i++){
            Student std = new Student();
            std.NhapTTin();
            StdHashSet.add(std);
            }
        
        StdHashSet.HienThiSet();
        sc.close();
    }
    
}
