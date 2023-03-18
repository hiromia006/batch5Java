package batch5.generics.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
{
  "name": "John",
  "age": 22,
  "hobby": {
    "reading": true,
    "gaming": false,
    "sport": "football"
  },
  "class": [
    "JavaScript",
    "HTML",
    "CSS"
  ]
}
 */
public class NestedJsonHashMap {
    public static void main(String[] args) {
        List<String> classList=new ArrayList<>();
        classList.add("JavaScript");
        classList.add("HTML");
        classList.add("CSS");

        Map<String, Object> hobby = new HashMap<>();
        hobby.put("reading", true);
        hobby.put("gaming", false);
        hobby.put("sport", "football");



        Map<String, Object> objectMap = new HashMap<>();
        objectMap.put("name", "John");
        objectMap.put("age", 22);
        objectMap.put("hobby", hobby);
        objectMap.put("class", classList);
        System.out.println(objectMap);

    }
}
