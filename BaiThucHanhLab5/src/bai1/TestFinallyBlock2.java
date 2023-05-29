package bai1;

public class TestFinallyBlock2 {
    public static void main(String[] args) {
        try{
            int data = 25/0;
            System.out.println(data);
        } catch (ArithmeticException e){
            System.out.println(e);
        } finally {
            System.out.println("Finally block is always excuted");
        }
        System.out.println("Rest of the code...");
    }
}
