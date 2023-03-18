package batch5.abstraction.interface1;

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Drawable.message);
        System.out.println(Drawable.drawCube(12));

        Circle circle = new Circle();
        circle.draw();
        circle.drawSomeThings();

        // Parent parentVariable=new Child();
        Drawable drawable = new Circle();
        drawable.draw();


    }
}
