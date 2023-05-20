package Slide;
import java.util.LinkedList;
import java.util.Scanner;

public class Slide111{
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    LinkedList<Integer> SoNguyen = new LinkedList<>();
    System.out.print("Nhap so phan tu can nhap: ");
    int size = sc.nextInt();
    for(int i = 0; i < size; i++){
        System.out.printf("Nhap so nguyen thu %d: ", i);
        int number = sc.nextInt();
        SoNguyen.add(i, number);
    }
    
    System.out.println("Danh sach day du:");
    for(int i = 0; i < SoNguyen.size(); i++){
        System.out.printf("Phan tu thu %d: ", i + 1);
        System.out.println(SoNguyen.get(i));
        System.out.println("-------------------------------------------");
    }

    int sum = 0;
    int count = 0;

    for(int i = 0; i < SoNguyen.size(); i++){
        if(SoNguyen.get(i)%2 == 0){
            sum = sum + SoNguyen.get(i);
            count++;
        }
    }

    System.out.println("TBC cac so chan: " + sum/count);
    sc.close();
    }
}


