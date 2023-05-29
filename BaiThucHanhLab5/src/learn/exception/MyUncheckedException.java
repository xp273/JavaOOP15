package learn.exception;

class MyUncheckedException extends Exception {
    public MyUncheckedException(String msg){
        super(msg);
    }   
}
public class UncheckedExceptionDemo{
    public static void main(String[] args) {
        UncheckedExceptionDemo.testUncheckException();
    }

    public static void testUncheckException() throws MyUncheckedException {
        System.out.println("Unchecked exception demo");        
    }
}

