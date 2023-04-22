package contacts;
import java.util.Scanner;

public class DanhBa {
    public String FullName;
    public String PhoneNum;

    Scanner sc = new Scanner(System.in);
;
    public void nhapTTin(){
        System.out.println("Ten: ");
        FullName = sc.nextLine();
        System.out.println("SDT: ");
        PhoneNum = sc.nextLine();

    }

    public void  inTTin(){
        System.out.println("Ten: " + FullName);
        System.out.println("SDT: " + PhoneNum);
    }
    
}
