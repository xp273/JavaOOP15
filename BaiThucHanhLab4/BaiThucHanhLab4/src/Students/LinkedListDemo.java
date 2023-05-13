package Students;
import java.util.LinkedList;
import java.util.Scanner;



public class LinkedListDemo {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    LinkedList<Student> StdLList = new LinkedList<Student>();

    StdLList.AddList();
    StdLList.HienThiList();
    StdLList.AddTTinList();
    StdLList.UpdateList();
    StdLList.RemoveList();
            
    sc.close();
    }
}
