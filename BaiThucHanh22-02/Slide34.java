import java.util.Scanner;

class GTPTB2{
    public static void main(String[] args) {
        double delta = 0, x1 = 0, x2 = 0;
            try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Nhap so a, b, c");
            int a = myObj.nextInt();
            int b = myObj.nextInt();
            int c = myObj.nextInt();
            delta = Math.pow(b ,2) - 4*a*c;
    if (delta > 0){
            x1 = (-b - Math.sqrt(delta))/ (2*a);
            x2 = (-b + Math.sqrt(delta))/ (2*a);
            System.out.println("Phuong trnh co hai nghiem x1 va x2");
            System.out.println("x1:" + x1);
            System.out.println("x2:" + x2);}         
                else if (delta < 0){
                System.out.println("Phuong trinh vo nghiem");}
                    else{ 
                    x1 = x2 = -b / (2 / a);
                    System.out.println("Phuong trinh co nghiem x1 = x2 =" + x1);}
        }             
    }
}