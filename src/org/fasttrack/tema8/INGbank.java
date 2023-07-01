package org.fasttrack.tema8;

public class INGbank implements Bank{
    private double balance;

    public INGbank() {
        this.balance = 0.0;
    }

    public void withdraw(double amount) {
        if(amount > balance) {
            System.out.println("Insufficient funds in ING Bank account.");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount + " from ING Bank account.");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Successfully deposited $" + amount + " into ING Bank account.");
    }
}
