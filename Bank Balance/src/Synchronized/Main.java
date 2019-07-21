package Synchronized;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();

        Customer c1 = new Customer(bank, 1000);
        Customer c2 = new Customer(bank, 300);
        Customer c3 = new Customer(bank, 200);
        Customer c4 = new Customer(bank, 700);

        c1.start();
        c2.start();
        c3.start();
        c4.start();

    }

}
