package Students;
import java.util.ArrayList;
import java.util.Scanner;
import Students.Student;

public class ArrayListDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> StdList = new ArrayList<Student>();
        
        StdList.AddList(StdList);
        StdList.HienThiList(StdList);
        StdList.AddTTinList(StdList);
        StdList.UpdateList(StdList);
        StdList.RemoveList(StdList);

        sc.close();
        }
    }

