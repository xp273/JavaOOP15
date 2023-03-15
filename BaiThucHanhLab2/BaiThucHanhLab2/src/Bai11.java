import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[], b[];
        int size = 0;

        do
        {
            System.out.print("Nhap so luong phan tu can sap xep: ");
            size = sc.nextInt();
        } while (size>0);

        a = b = new int [size];

        for(int i = 0; i < a.length; i++)
        {
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
            b[i] = a[i];
        }

        for(int i = 0; i < size-1; i++) {
            for (int j = i+1; j<b.length; j++) {
               if(b[i] > b[j]) {
                  int tg = b[i];
                  b[i] = b[j];
                  b[j] = tg;
                }
            }
        }

        System.out.print("Mang truoc khi sap xep: ");
        System.out.print("Mang sau khi sap xep: ");



    }
    
}
