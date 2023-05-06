package contacts;
import java.util.Scanner;


public class DanhBa {
    Scanner sc = new Scanner(System.in);
    public String SearchName, FullName, PhoneNum, NewFullName, NewPhoneNum;


<<<<<<< HEAD
    public String searchUser(){
        System.out.println("Nhap ten nguoi dung: ");
        SearchName = sc.nextLine();
        return SearchName;
    }

    public String addDataName(){
        System.out.println("Nhap ten nguoi dung: ");
        FullName = sc.nextLine();
        return FullName;
    }

    public String addDataNum(){
        System.out.println("Nhap SDT nguoi dung: ");
        PhoneNum = sc.nextLine();
        return PhoneNum;
    }

    public String updateName(){
        System.out.println("Nhap ten moi cua nguoi dung: ");
        NewFullName = sc.nextLine();
        return NewFullName;
    }

    public String updateNum(){
        System.out.println("Nhap ten moi cua nguoi dung: ");
        NewPhoneNum = sc.nextLine();
        return NewPhoneNum;
    }
    
    public String removeUserName(){
        FullName = "0";
        return FullName;
    }

    public String removeUserNum(){
        PhoneNum = "0";
        return PhoneNum;
=======
    public void searchUser(){
        System.out.println("Nhap ten nguoi dung: ");
        SearchName = sc.nextLine();
    }

    public void addDataName(){
        System.out.println("Nhap ten nguoi dung: ");
        FullName = sc.nextLine();
    }

    public void addDataNum(){
        System.out.println("Nhap SDT nguoi dung: ");
        PhoneNum = sc.nextLine();
    }

    public void updateName(){
        System.out.println("Nhap ten moi cua nguoi dung: ");
        NewFullName = sc.nextLine();
    }

    public void updateNum(){
        System.out.println("Nhap ten moi cua nguoi dung: ");
        NewPhoneNum = sc.nextLine();
    }
    
    public void removeUserName(){
        FullName = null;
    }

    public void removeUserNum(){
        PhoneNum = null;
>>>>>>> 6ebc0e1b7a4739c8920dead9d33bb241436aac2e
    }
}
