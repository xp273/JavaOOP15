package Students;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Student{

        String FullName;
        int Age;
        Scanner sc = new Scanner(System.in);

        public void NhapTTin(){    
            System.out.println("Nhap ten SV: ");
            FullName =  sc.nextLine();
            System.out.println("Nhap tuoi SV: ");
            Age = sc.nextInt();
        }

//===========================================================================
    
        public static void AddList(List<Student> StdList, int size){
            Scanner sc = new Scanner(System.in);
            System.out.println("So phan tu can nhap: ");
            size = sc.nextInt();

            for(int i = 0; i< size; i++){
                Student std = new Student();
                std.NhapTTin();
                StdList.add(std);
                }
            sc.close();
        }

        public static void HienThiList(List<Student> Stdlist){
            for(Student std : Stdlist){
            System.out.printf("Ten: %s, Tuoi: %d", std.FullName, std.Age);
            System.out.println("\n");
            System.out.println("===================================");
            }
        }

        public static void AddTTinList(List<Student> StdList){
            Student std = new Student();
            std.NhapTTin();
            StdList.add(std);
        }

        public static void UpdateList(List<Student> Stdlist){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ten can tim: ");
            String name = sc.nextLine();
            for(Student std : Stdlist){
                if(std.FullName.equals(name)){
                    System.out.println("Chon cach sua doi: ");
                    System.out.println("1 - Doi ten");
                    System.out.println("2 - Doi tuoi");
                    System.out.println("3 - Doi ten va tuoi");
                    switch(sc.nextInt()){
                        case 1: System.out.println("Nhap ten moi");
                                std.FullName = sc.nextLine();
                                break;
                        case 2: System.out.println("Nhap tuoi moi");
                                std.Age = sc.nextInt();
                                break;
                        case 3: std.NhapTTin();              
                                break;
                    }
                }
            }
        sc.close();
        }

        public static void RemoveList(List<Student> Stdlist){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ten can tim: ");
            String name = sc.nextLine();
            for(Student std : Stdlist){
                if(std.FullName.equals(name)){
                Stdlist.remove(std);
                sc.close(); 
                }
            } 
        }


//===========================================================================


        public static void AddSet(Set<Student> StdSet, int size){
            Scanner sc = new Scanner(System.in);
            System.out.println("So phan tu can nhap: ");
            size = sc.nextInt();

            for(int i = 0; i< size; i++){
                Student std = new Student();
                std.NhapTTin();
                StdSet.add(std);
                }
            sc.close();
        }

        public static void HienThiSet(Set<Student> StdSet){
            System.out.println("Thong tin StdSet: " + "\n");
            for(Student std : StdSet){
                System.out.println(std.FullName);
                System.out.println(std.Age);
                System.out.println("\n");
                System.out.println("==================================");
                }
        }  

        public static void AddTTinSet(Set<Student> StdSet){
            Student std = new Student();
            std.NhapTTin();
            StdSet.add(std);
        }

        public static void UpdateSet(Set<Student> StdSet){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ten can tim: ");
            String name = sc.nextLine();
            for(Student std : StdSet){
                if(std.FullName.equals(name)){
                    System.out.println("Chon cach sua doi: ");
                    System.out.println("1 - Doi ten");
                    System.out.println("2 - Doi tuoi");
                    System.out.println("3 - Doi ten va tuoi");
                    switch(sc.nextInt()){
                        case 1: System.out.println("Nhap ten moi");
                                std.FullName = sc.nextLine();
                                break;
                        case 2: System.out.println("Nhap tuoi moi");
                                std.Age = sc.nextInt();
                                break;
                        case 3: System.out.println("Nhap ten moi");
                                std.FullName = sc.nextLine();
                                System.out.println("Nhap tuoi moi");
                                std.Age = sc.nextInt();
                                break;
                    }

                }
            }
            sc.close();
        }

        public static void RemoveSet(Set<Student> StdSet){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ten can tim: ");
            String name = sc.nextLine();
            for(Student std : StdSet){
                if(std.FullName.equals(name)){
                StdSet.remove(std);
                sc.close(); 
                }
            } 
        } 
}    
    

