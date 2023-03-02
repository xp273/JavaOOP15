import  java.util.Scanner;

class TongCacChuSo{
    public static void main(String[] args) {
        int Tong= 0;
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Nhap so n");
            int n = myObj.nextInt();
            while (n>0){
                Tong = Tong + (n % 10);
                n = n / 10;
            }
        }
        System.out.println("Tong cac chu so la:" + Tong);
    }
}