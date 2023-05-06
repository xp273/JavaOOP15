package Demo;
import Students.Student;
import java.util.LinkedList;
import java.util.Scanner;



public class LinkedListDemo {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    LinkedList<Student> StdLList = new LinkedList<Student>();

    System.out.println("So phan tu can nhap: ");
        int size = sc.nextInt();

            for(int i = 0; i< size; i++){
                Student std = new Student();
                std.NhapTTin();
                StdLList.add(i, std);
                }

            StdLList.HienThiList();
    sc.close();
    }
}
