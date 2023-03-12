//Mang 1 chieu lon hon 10

import  java.util.Scanner;

public class B2{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, tong = 0;
    
    do{
    System.out.print("Nhap so phan tu: ");
    n = sc.nextInt();
    } while (n < 0);
    int arrA[] = new int[n];

    for (int i = 0; i < arrA.length; i++)
    {
        System.out.print("Nhap so nguyen duong:");
        arrA[i] = sc.nextInt();
        if (arrA[i] > 10) tong += arrA[i];
    }
    
    System.out.printf("Tong cua cac phan tu lon hon 2 = %d ", tong);
    sc.close();
    }
    
}


