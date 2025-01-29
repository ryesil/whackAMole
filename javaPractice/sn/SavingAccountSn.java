package javaPractice.sn;

import javaPractice.sn.BankAccountSn;

public class SavingAccountSn extends BankAccountSn {
    private double interestRate;

    // Constructor
    public SavingAccountSn(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Calculate interest
    public double calculateInterest() {
        return getBalance() * interestRate;
    }
}

