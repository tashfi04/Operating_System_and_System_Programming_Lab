package Synchronized;

public class Bank {

    private int TotalMoney = 100000000;

    synchronized public void withdrawMoney(int amount) {

        TotalMoney = TotalMoney - amount;

        System.out.println("Current amount after withdraw: " + TotalMoney);
    }
}
