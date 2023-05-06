import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = 0; int b = 0;

    do
    {
    System.out.print("Nhap so nguyen a: ");
     a = sc.nextInt();
    } while (a < 0);

    do
    {
    System.out.print("Nhap so nguyen b: ");
     b = sc.nextInt();
    } while (b < 0);

    //Tinh tong
    int Tong = 0;
    Tong = a + b;
    System.out.printf("Tong cua hai so a va b: %d \n", Tong);

    //Tinh hieu
    int Hieu = 0;
    Hieu = a - b;
    System.out.printf("Hieu cua hai so a va b: %d \n", Hieu);
    
    //Tinh tich
    int Tich = 0;
    Tich = a*b;
    System.out.printf("Tich cua hai so a va b: %d \n", Tich);

    //Tinh thuong
    int Thuong = 0;
    Thuong = a/b;
    System.out.printf("Thuong cua hai so a va b: %d \n", Thuong);

    //Chia lay du

    int Du = 0;
    Du = a%b;
    System.out.printf("Ket qua cua phep chia lay du a va b: %d \n", Du);

    //So sanh

    if (a>b)
    {
        System.out.println("So a lon hon so b \n");
    }else if (a<b)
        {
            System.out.println("So a be hon so b \n");
        } else 
            {
                System.out.println("Hai so bang nhau \n");
            }
    sc.close();  
    }

}
