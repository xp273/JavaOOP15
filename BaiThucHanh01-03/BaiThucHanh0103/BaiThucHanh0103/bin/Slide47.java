import java.util.Arrays;
import java.util.Scanner;

public class Slide47{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int phantu[];
        phantu = new int [100];
        int tong = 0;
        for( int i = 0; tong < 100; i++)
        {
            System.out.print("Nhap phan tu thu " + i + " : ");
            phantu[i] = sc.nextInt();
            tong = tong + phantu[i];
        
        }
        System.out.print("Tong cac so la:" +tong);
        System.out.println("");
        System.out.print("Danh sach so nguyen: " +Arrays.toString(phantu));
        sc.close();
        }
    }

