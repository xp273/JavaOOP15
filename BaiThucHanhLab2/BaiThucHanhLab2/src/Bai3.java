import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String ten;
    int tuoi = 0;

    System.out.print("Nhap ten cua ban: ");
    ten = sc.nextLine();

    System.out.print("Nhap tuoi cua ban: ");
    tuoi = sc.nextInt();

    if ( tuoi < 16)
        {
            System.out.println("Ban " + ten + " o do tuoi vi thanh nien");
        } else if ( ( tuoi >= 16 ) && (tuoi < 18))
        {
            System.out.println("Ban " + ten + " o do tuoi truong thanh");
        } else
        {
            System.out.println("Ban " + ten + " da gia");
        }
         
    sc.close();
    }    
}
