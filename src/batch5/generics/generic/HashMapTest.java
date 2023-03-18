package batch5.generics.generic;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, String> objectMap = new HashMap<>();
        objectMap.put("name", "Faria");
        objectMap.put("Department", "SQA");
        objectMap.put("City", "Dhaka");
//        System.out.println(objectMap);

        Map<String, Object> objectMap1 = new HashMap<>();
        objectMap1.put("name", "John");
        objectMap1.put("age", 23);
        objectMap1.put("gender", "male");
        objectMap1.put("objectMap", objectMap);

        System.out.println(objectMap1);
        System.out.println(objectMap1.get("age"));
    }
}
