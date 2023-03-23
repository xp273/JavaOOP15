import java.util.Scanner;


class HinhTron {
  Scanner sc = new Scanner(System.in);

  float r, cv, dt;
  final float  pi = (float) 3.14;

  public void nhapDuLieuHinhTron()
  {
      System.out.print("Nhap ban kinh hinh tron: ");
      r = sc.nextInt();        
  }

  public void TinhCVDT()
  {
      cv = 2 * pi * r;
      dt = pi * r * r;
  }
      
  public void inDuLieuHinhTron()
  {
      System.out.printf("Chu vi hinh tron: %f", cv);
      System.out.println();
      System.out.printf("Dien tich hinh tron: %f", dt);
      System.out.println();
      System.out.println("-------------------------------");
  }
}