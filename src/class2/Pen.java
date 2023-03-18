package class2;

public class Pen {
    public String name;
    public String color;

    public Pen() {

    }

    public Pen(String color) {
        this.color = color;
    }

    public Pen(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void write() {
        System.out.println("Please write with " + name + " Pen which color is " + color);

    }

    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.name = "Reynolds";
        pen.color = "white";
        pen.write();

        Pen pen1 = new Pen();
        pen1.name = "Econo";
        pen1.color = "Black";
        pen1.write();

        Pen pen2 = new Pen("Medador", "Pink");
        pen2.write();
    }

}
