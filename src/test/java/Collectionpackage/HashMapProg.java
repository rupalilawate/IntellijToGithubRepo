package Collectionpackage;

import java.util.HashMap;
import java.util.Map;

public class HashMapProg {

    public static void main(String[] args) {

        Map<String, Integer> m1 = new HashMap<String, Integer>();
        m1.put("apple",5);
        m1.put("banana",3);
        System.out.println(m1.get("apple"));
        m1.remove("banana");
        System.out.println(m1.containsKey("banana"));
    }
}
