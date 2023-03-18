package batch5.abstraction.abstract1;

public abstract class Bank {
    abstract double getInterestRate();

    abstract void printSomething();

    public void printCircular() {
        System.out.println("Please follow Bank rules");
    }
}
