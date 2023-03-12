//Sap xep mang 1 chieu

import  java.util.Scanner;

public class B5{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, tg = 0;
    
    do{
    System.out.print("Nhap so phan tu: ");
    n = sc.nextInt();
    } while (n < 0);
    int arrA[] = new int[n];

    for (int i = 0; i < arrA.length; i++)
    {
        System.out.print("Nhap so nguyen duong: ");
        arrA[i] = sc.nextInt();
    }

    for(int i = 0; i < arrA.length - 1; i++)
    {
        for (int j = i + 1; j < arrA.length; j++)
        {
            if (arrA[i] < arrA[j])
                tg = arrA[i];
                arrA[i] = arrA[j];
                arrA[j] = tg;
        }
    }

    for(int i = 0; i < arrA.length; i++)
    {
        System.out.printf("A[%d] = %d \t", i, arrA[i]);
    }
    sc.close();
    }
}