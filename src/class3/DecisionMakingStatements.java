package class3;

public class DecisionMakingStatements {
    public static void main(String[] args) {
        int mark = 65;

        //Simple if statement
        if (mark >= 80) {
            System.out.println("Pass");
        }

        //if-else statement

        if (mark >= 40) {
            System.out.println("pass");
        } else {
            System.out.println("Fail");
        }

        //if-else-if ladder
        if (mark >= 80 && mark <= 100) {
            System.out.println("Grad A++");
        } else if (mark >= 60 && mark < 80) {
            System.out.println("Grad A");
        } else if (mark >= 50 && mark < 60) {
            System.out.println("Grad B");

        } else if (mark >= 40 && mark < 50) {
            System.out.println("Grad C");
        } else {
            System.out.println("Fail");
        }

        //Nested if-statement

        if (mark > 60) {
            if (mark > 60 && mark < 65) {
                System.out.println("Grad B+");
            } else {
                System.out.println("Grad A-");
            }

        } else {
            System.out.println(mark);
        }

    }
}
