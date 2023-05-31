import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cot = 0; int hang = 0; int max = 0;

        do
        {
            System.out.println("Nhap so cot: ");
            cot = sc.nextInt();
        } while (cot < 0);

        do
        {
            System.out.println("Nhap so hang: ");
            hang = sc.nextInt();
        } while (hang < 0);

        int A[][] = new int [hang][cot];

        for(int i = 0; i < hang; i++)
        {
            for(int j = 0; j < cot; j++)
            {
                System.out.printf("A[%d][%d] = ",i,j);
                A[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < hang; i++)
        {
            for(int j = 0; j < cot; j++)
            {
                if( A[i][j] > max) max = A[i][j];
            }
        }

        System.out.print("Gia tri cao nhat la: " + max);
        sc.close();
    }
    
}
