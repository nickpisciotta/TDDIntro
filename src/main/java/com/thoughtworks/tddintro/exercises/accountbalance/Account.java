package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {

    private int totalFunds;

    public Account (int totalFunds) {
        this.totalFunds = totalFunds;
    }

    public int getTotalFunds() {
        return totalFunds;
    }

    public void deposit(int amount) {
        totalFunds += amount;
    }


    public void withdraw(int amount) {
        if (totalFunds < amount) {return;}
        totalFunds -= amount;
    }
}
