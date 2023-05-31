import java.util.Scanner;

public class Bai5{
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
        System.out.print("Tong cac so la: " +tong);
        System.out.println("");

        System.out.println("Danh sach so nguyen: ");
        for( int j = 0; j<phantu.length; j++)
        {
            if (phantu[j] != 0)
            {
                System.out.println(phantu[j]);
            }
        }
        sc.close();
        }
    }

