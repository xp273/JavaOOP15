package Slide;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Slide113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> Fruit = new HashSet<String>();

        System.out.println("So phan tu can nhap: ");
        int size = sc.nextInt();

        for(int i = 0; i < size; i++){
            System.out.println("Nhap ten trai cay");
            Fruit.add(sc.nextLine());
        }

        System.out.println("Cac phan tu trong HashSet Fruit: " + Fruit);

        String searchName;
        System.out.println("Nhap ten can tim: ");
        searchName = sc.nextLine();
        if(Fruit.contains(searchName)){
            System.out.println("HashSet Fruit chua phan tu "+ searchName + " !");
            Fruit.remove(searchName);
            System.out.println("Da xoa phan tu" + searchName + " ! ");

        } else System.out.println("HashSet Fruit khong chua phan tu "+ searchName + " !");

        System.out.println("Phan tu co trong HashSet Fruit sau khi xoa: ");
        System.out.println(Fruit);

        Iterator<String> ite = Fruit.iterator();

        ArrayList<String> NewListFruit = new ArrayList<>();
        for(


        


    }
}
