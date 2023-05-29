 package bai1;

public class TestThrow2 {
    static void validate(int age){
        try{
            if (age < 18) throw new ArithmeticException("Not vaild");
                else System.out.println("Welcome");
            } catch (ArithmeticException ex){
                System.out.println(ex.getMessage());
            }
        }

    public static void main(String[] args) {
        validate(13);
        System.out.println("Rest of the code");
    }
}
