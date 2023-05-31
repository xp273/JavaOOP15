package contacts;

public abstract class Contact{

    abstract void GenerateDB(String FullName, String PhoneNum);
<<<<<<< HEAD
    abstract void Insert(String FullName, String PhoneNum);
=======
    abstract void Insert(String FullName, String SearchName, String PhoneNum);
>>>>>>> 6ebc0e1b7a4739c8920dead9d33bb241436aac2e
    abstract void Update(String NewFullName, String SearchName, String NewPhoneNum);
    abstract void Delete(String SearchName, String FullName, String PhoneNum);
    abstract void Search(String SearchName, String FullName, String PhoneNum);
    abstract void viewUsers(String FullName, String PhoneNum);
    
}
