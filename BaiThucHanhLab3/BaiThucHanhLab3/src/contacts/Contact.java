package contacts;

public abstract class Contact{
    abstract void Insert(String FullName, String SearchName, String PhoneNum);
    abstract void Update(String NewFullName, String SearchName, String NewPhoneNum);
    abstract void Delete(String SearchName, String FullName, String PhoneNum);
    abstract void Search(String SearchName, String FullName, String PhoneNum);
    
}
