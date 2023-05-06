import java.util.ArrayList;
import java.util.Scanner;

public class Slide24 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInterger = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int number;

        System.out.println("Nhap so phan tu cua Array List: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Nhap phan tu thu " + i + ": ");
            number = sc.nextInt();
            arrListInterger.add(number);
        }

        int max = arrListInterger.get(0);

        for(int i =0; i < arrListInterger.size(); i++){
            if (arrListInterger.get(i).compareTo(max) > 0){
                max = arrListInterger.get(i);
            }
        }

        System.out.println("Phan tu lon nhat trong arrListInteger = " + max);
        sc.close();
    }
    
}
