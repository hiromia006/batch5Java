package class2.modifier;

import class2.modifier.p1.PrivateClass;
import class2.modifier.p2.ProtectedClass;

public class TestMain {

    public static void main(String[] args) {
        PrivateClass privateClass = new PrivateClass();
//        privateClass.name = "SQA";
        privateClass.subject = "QA";

//        privateClass.privateM1();
        privateClass.publicMethod();


        ProtectedClass protectedClass = new ProtectedClass();
        protectedClass.name = "SQA";
        protectedClass.subject = "QA";

        protectedClass.protectedM1();
        protectedClass.publicMethod();


    }
}
