import  java.util.Scanner;

public class Slide47{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap so luong phan tu can tinh");
        int soluong = sc.nextInt();
        int phantu[] = new int [soluong];
        int tong = 0; int i = 0;
        while( tong < 100)
        {
         System.out.print("Nhap phan tu thu" + i );
         phantu[i] = sc.nextInt();
         tong = tong + phantu[i];
         i++;
        }
        sc.close();
        }
    }

