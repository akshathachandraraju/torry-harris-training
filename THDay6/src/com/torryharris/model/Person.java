package com.torryharris.model;
import com.torryharris.exception.InsufficientFundsException;
import com.torryharris.exception.WithDrawLimitExceedException;

public class Person {
    private String name;
    private int accountNumber;
    private int balance;
    private int totalAmountWithdrawn;
    private final int DAILY_WITHDRAW_LIMIT=40000;

    public Person() {
    }

    public Person(String name, int accountNumber, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setTotalAmountWithdrawn(int totalAmountWithdrawn) {
        this.totalAmountWithdrawn = totalAmountWithdrawn;
    }
    public void withdrawAmount(int amount) throws WithDrawLimitExceedException, InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient Funds!");
        }
        if(totalAmountWithdrawn+amount>DAILY_WITHDRAW_LIMIT){
            throw new WithDrawLimitExceedException("Withdraw amount Exceeds:\n"+"Total amount withdraw todat is: "+totalAmountWithdrawn);
        }
        balance-=amount;
        totalAmountWithdrawn+=amount;
        System.out.println("Amount Withdrawal for Rs:"+amount+" is successful");
        System.out.println("Balance is:Rs"+balance);
        System.out.println("Total amount withdrawn is:Rs"+totalAmountWithdrawn);
        System.out.println();
    }

    public int getTotalAmountWithdrawn() {
        return totalAmountWithdrawn;
    }



}
