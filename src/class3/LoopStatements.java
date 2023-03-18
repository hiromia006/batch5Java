package class3;

public class LoopStatements {
    public static void main(String[] args) {
        // Java for loop: for(initialization, condition, increment/decrement)
        // increment
        for (int i = 0; i < 10; i++) {
            System.out.println("Welcome to SQA Learning Academy " + i);
        }

        //decrement
        for (int i = 10; i > 0; i--) {
            System.out.println("Welcome to SQA Learning Academy " + i);
            // 1 st i value 10
            // 1 st i value 8
        }

        //while loop; int i = 0; i < 10; i++
        int i = 9;
        while (i < 10) {
            System.out.println("Welcome to Batch 5 I");
            i++;
        }

        // do while
        int j = 9;
        do {
            System.out.println("Welcome to Batch 5 J " + j);
            j++;
        } while (j < 10);

//Java for loop: for(initialization, condition, increment/decrement)
// Java for-each loop: for(data_type var : array_name/collection_name)
        String[] names = {"name1", "name2", "name3"};
        for (String variable : names) {
            System.out.println(variable);
        }
        System.out.println("===============================================");
        int numbers[] = {10, 25, 35, 68, 40};
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("===============================================");
        Double doubles[] = {87.5, 98.1, 354.0, 145.9, 987.5};
        for (Double aDouble : doubles) {
            System.out.println(aDouble);
        }
    }
}
