<<<<<<< HEAD

=======
>>>>>>> 468eda2e97f1558720347f34ca9bd60059ff9ded
import java.util.Scanner;

public class HinhTru {

    Scanner sc = new Scanner(System.in);

  float r, cv, dt, tt, h;
  final float  pi = (float) 3.14;

    public void nhapDuLieuHinhTru()
        {
          System.out.print("Nhap ban kinh hinh tru: ");
          r = sc.nextFloat();     
          System.out.print("Nhap chieu cao hinh tru: ");
          h = sc.nextFloat();
        } 
  

    public void TinhCVDTTT()
    {
      cv = 2 * pi * r;
      dt = pi * r * r;
      tt = dt * h;
    }
      
  public void inDuLieuHinhTru()
    {
      System.out.printf("Chu vi day hinh tru: %f", cv);
      System.out.println();
      System.out.printf("Dien tich day hinh tru: %f", dt);
      System.out.println();
      System.out.printf("The tich hinh tru: %f", tt);
      System.out.println();
      System.out.println("-------------------------------");
    }
}
    

