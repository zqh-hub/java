package com.object.java;

public class ObjectTest10 {
}

class Account {
    private int id;
    private double balance;
    private double annualRate;

    public Account() {

    }

    public Account(int id, double balance, double annualRate) {
        this.annualRate = annualRate;
        this.id = id;
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualRate(double annualRate) {
        this.annualRate = annualRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualRate() {
        return annualRate;
    }

    public void withDraw(double amount) {
        if (amount >= 0){
            if (balance > 0) {
                if (balance >= amount) {
                    balance -= amount;
                    System.out.println("成功取出" + amount);
                } else {
                    System.out.println("余额不足");
                }
            } else {
                System.out.println("余额不足");
            }
        }else{
            System.out.println("amount 输入有误");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}