package collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Key1", 30);
        hashMap.put("Key2", 31);
        hashMap.put("Key3", 29);
        hashMap.put("Key4", 29);

        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1, "Value 1");
        hashMap1.put(2, "Value 2");
        hashMap1.put(3, "Value 3");
        hashMap1.put(4, "Value 4");

        System.out.println("Display entries in HashMap1");
        System.out.println(hashMap1 + "\n");



    }
}
