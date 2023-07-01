package org.fasttrack.tema8;

public class BRDbank implements Bank{
    private double balance;

    public BRDbank() {
        this.balance = 0.0;
    }

    public void withdraw(double amount) {
        if(amount > balance) {
            System.out.println("Insufficient funds in BRD Bank account.");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount + " from BRD Bank account.");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Successfully deposited $" + amount + " into BRD Bank account.");
    }
}
