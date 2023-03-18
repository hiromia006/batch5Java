package class3;

public class JumpStatements {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Welcome i " + i);
            if (i == 5) break; // hard break

        }

        System.out.println("=============================");
        for (int i = 0; i < 10; i++) {
            if (i == 5) continue;  //skip
            System.out.println("Welcome i " + i);
        }

    }
}
