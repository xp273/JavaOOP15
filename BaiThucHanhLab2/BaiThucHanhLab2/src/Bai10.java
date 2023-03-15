import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Chuoi;
        char Kytu; char a;
        int b = 0;

        System.out.println("Nhap chuoi ki tu (Gioi han it hon 80 ki tu)");
        Chuoi = sc.nextLine();

        System.out.print("Nhap ky tu: ");
        Kytu = sc.next().charAt(0);
        
        for ( int i = 0; i < Chuoi.length(); i++)
        {   a = Chuoi.charAt(i);
            if ( Kytu == a) b = b + 1;       
        }

        System.out.print("So lan ky tu " + Kytu + "da xuat hien la: " + b);
        sc.close();
        }

        
    }
    
