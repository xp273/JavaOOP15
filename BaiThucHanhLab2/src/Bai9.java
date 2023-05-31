import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Nhap chuoi ky tu: ");
    String chuoi = sc.nextLine();
    char kytu;
    int ChuHoa = 0; int ChuThuong = 0;

    for ( int i = 0; i < chuoi.length(); i++)
        {   kytu = chuoi.charAt(i);
            if ( Character.isUpperCase(kytu))
                {
                  ChuHoa = ChuHoa + 1;  
                }
            else if (Character.isLowerCase(kytu))
                {
                    ChuThuong = ChuThuong + 1;
                }
                
        }

    System.out.printf("So luong chu thuong la: %d \n", ChuThuong);
    System.out.printf("So luong chu hoa la: %d", ChuHoa);

    sc.close();
    }
}
