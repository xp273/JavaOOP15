package Slide;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Slide110 {
    public static void main(String[] args) {
        ArrayList<Float>  Num = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        float max = 0;
        float num;

        System.out.println("Nhap so phan tu can nhap: ");
        int size = sc.nextInt();

        for(int i = 0; i < size; i++){
            System.out.println("Nhap phan tu thu " + i+1);
            num = sc.nextFloat();
            Num.add(i, num);
            }
        
        for(int i = 0; i < Num.size(); i++){
            if (max < Num.get(i)) max = Num.get(i);
            }
        System.out.println("Max = " + max);

        System.out.println("Nhap gia tri can xoa: ");
        float search = sc.nextFloat();
        for(int i = 0; i < Num.size(); i++){
            if (search == Num.get(i)) Num.remove(i);
            }

        System.out.println("Day so sau khi xoa: ");
        System.out.println(Num);

        System.out.println("Day so sau khi sap xep: ");
        Collections.sort(Num);
        System.out.println(Num);


    }
    
}
