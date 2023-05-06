package Students;
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListDemo{
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    ArrayList<Student> StdList = new ArrayList<Student>();
    
    System.out.println("So phan tu can nhap: ");
    int size = sc.nextInt();

    for(int i = 0; i < size; i++){
        Student std = new Student();
        std.NhapTTin();
        StdList.add(i, std);
    }

    StdList.HienThiList();
    sc.close();
    }
}

