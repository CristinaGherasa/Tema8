package org.fasttrack.tema8;

public class BTbank implements Bank{
    private double balance;

    public BTbank() {
        this.balance = 0.0;
    }

    public void withdraw(double amount) {
        if(amount > balance) {
            System.out.println("Insufficient funds in BT Bank account.");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount + " from BT Bank account.");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Successfully deposited $" + amount + " into BT Bank account.");
    }
}
