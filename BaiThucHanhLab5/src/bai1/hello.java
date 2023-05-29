package bai1;

public class hello {
    public static void main(String[] args) {
        try {
                String s = null;
                System.out.println(s.length());
                System.out.println("trong khoi try");
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
