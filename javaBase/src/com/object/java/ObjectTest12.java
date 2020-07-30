package com.object.java;

public class ObjectTest12 {
}
class Acc{
    private double balance;

    public Acc(){

    }

    public Acc(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amt){
        if(amt >= 0){
            balance += amt;
            System.out.println("存了"+ amt);
        }else{
            System.out.println("amt输入有误");
        }
    }

    public void withdraw(double amt){
        if(balance >= amt){
            balance -= amt;
            System.out.println("取走 "+ amt);
        }else{
            System.out.println("balance 不足");
        }
    }
}