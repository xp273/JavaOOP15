import java.util.ArrayList;

public class App2 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arrListInterger = new ArrayList<>();

        arrListInterger.add(0);
        arrListInterger.add(7);
        arrListInterger.add(1);
        arrListInterger.add(9);

        System.out.println("Cac phan tu trong arrListString la:");
        for(int number :arrListInterger ){
            System.out.print(number + "\t");
            }
        }
}
