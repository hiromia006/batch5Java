package class2.method;

public class TestClass {
    public static void main(String[] args) {
        MethodClass methodClass2 = new MethodClass("QA", 30, "SQA");
        methodClass2.printSomeThings();
        methodClass2.sum(50, 70);
        System.out.println("Age " + methodClass2.getAge());
        System.out.println("Name " + methodClass2.getName());
        System.out.println("Subtraction " + methodClass2.subtraction(90, 40));

    }
}
