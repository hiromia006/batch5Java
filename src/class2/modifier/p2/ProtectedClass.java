package class2.modifier.p2;

public class ProtectedClass {
    public String name;
    public String subject;

    public ProtectedClass() {

    }

    public void protectedM1() {
        System.out.println("protected Method" + name);
    }

    public void publicMethod() {
        System.out.println("Public Method " + subject);
    }

    public static void main(String[] args) {
        ProtectedClass protectedClass = new ProtectedClass();
        protectedClass.name = "SQA";
        protectedClass.subject = "QA";

        protectedClass.protectedM1();
        protectedClass.publicMethod();


    }
}
