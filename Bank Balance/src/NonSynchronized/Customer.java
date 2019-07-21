package NonSynchronized;

public class Customer extends Thread {

    int withdrawAmount;
    Bank bank;

    public Customer(Bank bank, int withdrawAmount) {

        this.bank = bank;
        this.withdrawAmount = withdrawAmount;
    }

    public void run() {

        bank.withdrawMoney(withdrawAmount);
    }
}
