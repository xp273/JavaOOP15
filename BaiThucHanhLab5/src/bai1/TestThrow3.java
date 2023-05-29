package bai1;

import java.io.IOException;

public class TestThrow3 {
    void m() throws IOException{
        throw new IOException("Loi thiet bi");
    }

    void n() throws IOException{
        m();
    }
    
    void p() {
        try{
            n();
        } catch (Exception e) {
            System.out.println("Ngoai le duoc xu ly");
        }
    }

    public static void main(String[] args) {
        TestThrow3 obj = new TestThrow3();
        obj.p();
        System.out.println("Luong binh thuong...");
    }
}
