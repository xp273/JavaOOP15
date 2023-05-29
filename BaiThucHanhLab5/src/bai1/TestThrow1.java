package bai1;

public class TestThrow1 {
    static void validate(int age){
        if (age < 18) throw new ArithmeticException("Not vaild");
            else System.out.println("Welcome");
    }

    public static void main(String[] args) {
        validate(13);
        System.out.println("Rest of the code");
    }
}
