package batch5.generics.generic;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        // Parent variable=new Child();
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Shovashis");
        stringSet.add("Shovashis");
        stringSet.add("fahmida");
        stringSet.add("asjkdh");
        stringSet.add("null");
        stringSet.add("null");

        stringSet.remove("Shovashis");
        stringSet.add("SQA");

        for (String s : stringSet) {
            System.out.println(s);
        }
        System.out.println("============================");
        for (String s : stringSet) {
            System.out.println(s);
        }

    }
}
