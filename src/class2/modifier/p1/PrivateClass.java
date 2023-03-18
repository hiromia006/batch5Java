package class2.modifier.p1;

public class PrivateClass {
    private String name;
    public String subject;

    public PrivateClass() {

    }

    private void privateM1() {
        System.out.println("Private Method" + name);
    }

    public void publicMethod() {
        System.out.println("Public Method " + subject);
    }

    public static void main(String[] args) {
        PrivateClass privateClass = new PrivateClass();
        privateClass.name = "SQA";
        privateClass.subject = "QA";

        privateClass.privateM1();
        privateClass.publicMethod();


    }
}
