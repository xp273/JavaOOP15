import  java.util.Scanner;

class SoNhoNhat{
    public static void main(String[] args) {
            try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Nhap so a, b");
            float a = myObj.nextFloat();
            float b = myObj.nextFloat();
            if ( a > b){
                System.out.println( a + " la so lon nhat");
            } else {
                System.out.println( b + " la so lon nhat");}
            }
        }
} 
