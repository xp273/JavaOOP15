import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide86 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("CSLT", "Co so lap trinh");
        hashMap.put("C++", "C++");
        hashMap.put("C#", "C Sharp");
        hashMap.put("Java", "Java");

        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();

        System.out.println("Cac entry co tr");



    }
    
}
