package contacts;

public abstract class Contact{
    
    abstract void Insert(String name, String number);
    abstract void Search(String name);
    abstract void Update(String newName, String newNumber);
    abstract void Delete(String name);   
}

 