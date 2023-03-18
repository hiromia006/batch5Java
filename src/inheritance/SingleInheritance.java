package inheritance;

public class SingleInheritance extends Animal {
    public static void main(String[] args) {
        SingleInheritance inheritance = new SingleInheritance();
        System.out.println(inheritance.name);
        inheritance.eat();
        inheritance.sleep();
    }
}
