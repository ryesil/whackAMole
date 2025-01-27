package javaPractice.sn;

import javaPractice.sn.BankAccountSn;

public class CurrentAccountSn extends BankAccountSn {
    private double overdraftLimit;

    public CurrentAccountSn(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
    // Override withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= -overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit or invalid amount.");
        }
    }
}
