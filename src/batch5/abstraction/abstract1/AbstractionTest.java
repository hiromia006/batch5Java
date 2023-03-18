package batch5.abstraction.abstract1;

public class AbstractionTest {
    public static void main(String[] args) {
        BracBank bank = new BracBank();
        System.out.println(bank.getInterestRate());
        bank.printCircular();
        bank.printSomething();
        System.out.println(bank.getLoanAmount(20000));

        Bank bracBank = new BracBank();
    }
}
