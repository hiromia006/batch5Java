package batch5.abstraction.abstract1;


//  Alt + Enter
public class BracBank extends Bank {

    @Override
    double getInterestRate() {

        return 8.5;
    }

    @Override
    void printSomething() {
        System.out.println("Print Something");
    }


    public double getLoanAmount(int amount) {
        return (((getInterestRate() / 100) / 365) * amount * 120) + amount;
    }
}
