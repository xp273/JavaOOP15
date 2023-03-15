import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;

        do
        {
        System.out.print("Nhap so nguyen duong: ");
        a = sc.nextInt();
        } while (a < 0);
        long gt = 1;
        int i = 1;

        do
        {
          gt = gt*i;
          i++;
        } while (i <= a);

        System.out.printf("Giai thua cua so %d la: ", a);
        System.out.print(gt);
        sc.close();
    }
}
