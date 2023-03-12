//Mang 2 chieu lon hon 10

import  java.util.Scanner;

public class B4 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hang, cot, tong = 0;
        
        do{
        System.out.print("Nhap so hang: ");
        hang = sc.nextInt();
        } while (hang < 0);
    
        do{
            System.out.print("Nhap so cot: ");
            cot = sc.nextInt();
            } while (cot < 0);
    
        int arrA[][] = new int[hang][cot];
    
        for (int i = 0; i < hang; i++)
        {
            for (int j = 0; j < cot; j++)
            {
            System.out.printf("Nhap so nguyen duong A[%d][%d]: ", i,j);
            arrA[i][j] = sc.nextInt();
            if (arrA[i][j] > 10) tong += arrA[i][j];
            }
        }
        
        System.out.printf("Tong cua cac phan tu lon hon 10 = %d ", tong);
        sc.close();
        }
        
    }
    
    

