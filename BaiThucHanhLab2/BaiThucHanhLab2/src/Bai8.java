import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0; int tong = 0; int a = 0; int tbc = 0;

        do
        {
        System.out.print("Nhap so luong so nguyen duong: ");
        n = sc.nextInt();
        } while (n < 0);

        for(int i = 0; i < n; i++)
        {
            System.out.print("Nhap so nguyen duong : ");
            a = sc.nextInt();
            tong = tong + a;
        }

        tbc = tong / n;

        System.out.printf("TBC = %d", tbc);

        sc.close();
    }
}
