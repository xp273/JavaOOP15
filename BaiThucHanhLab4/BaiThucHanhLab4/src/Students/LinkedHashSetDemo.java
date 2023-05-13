package Students;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Student> LHSStd = new LinkedHashSet<>();

        LHSStd.AddSet();
        LHSStd.HienThiSet();
        LHSStd.AddTTinSet();
        LHSStd.UpdateSet();
        LHSStd.RemoveSet();

        sc.close();
    }
    
}
