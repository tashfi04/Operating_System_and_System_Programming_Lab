package NonSynchronized;

public class Bank {

    private int TotalMoney = 100000000;

    private boolean isFree = true;

    synchronized public void withdrawMoney(int amount) {

        while (!isFree) {

            System.out.println("Busy");
        }

        isFree = false;

        TotalMoney = TotalMoney - amount;

        System.out.println("Current amount after withdraw: " + TotalMoney);

        isFree = true;
    }
}
