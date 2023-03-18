package class1;

import class2.modifier.p1.PrivateClass;

public class FirstJavaProject extends PrivateClass {
    public static void main(String[] args) {
        System.out.println("Welcome to SQA Learning Academy");

        SubClass subClass = new SubClass();
        subClass.subject = "QA";

        subClass.publicMethod();

        subClass.name = "SQA";
        subClass.subject = "QA";

        subClass.protectedM1();
        subClass.publicMethod();
    }
}
