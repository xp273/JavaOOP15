public class Slide55 {
    public static void main(String[] args) {
        System.out.println("So chia het cho 5:");
        for(int i = 0; i <= 200; i++)
        {
            if ( i % 5 != 0)
                { 
                    continue;
                }
            System.out.print("[" + i + "]");
        }
    }
}
