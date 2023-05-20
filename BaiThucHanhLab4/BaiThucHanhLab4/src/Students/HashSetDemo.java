package Students;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Student> StdHashSet = new HashSet<Student>();

        StdHashSet.AddSet();
        StdHashSet.HienThiSet();
        StdHashSet.AddTTinSet();
        StdHashSet.UpdateSet();
        StdHashSet.RemoveSet();

       
        sc.close();
    }
    
}
