import java.util.Scanner;
import java.util.TreeSet;

public class Slide69 {

        public static void main(String[] args) {
            TreeSet<Integer> treesetInteger = new TreeSet<>();
            Scanner sc = new Scanner(System.in);

            treesetInteger.add(0);
            treesetInteger.add(3);
            treesetInteger.add(1);
            treesetInteger.add(4);
            treesetInteger.add(2);
            treesetInteger.add(8);

            System.out.println("Cac phan tu trong treesetInteger: ");
            System.out.println(treesetInteger);
            System.out.println("Nhap phan tu can them: ");
            int number = sc.nextInt();

            if(!treesetInteger.contains(number)){
                treesetInteger.add(number);
                System.out.println("Them thanh cong!");
                System.out.println("Cac phan tu trong treesetInterger sau khi them: ");
                System.out.println(treesetInteger);
            } else {
                System.out.println("Phan tu " + number + " da ton tai! ");
            }

            sc.close();
        }
    }
    
    
