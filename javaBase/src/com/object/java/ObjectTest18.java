package com.object.java;
/*
 * super
 *  1、在构造器中，this(形参)和super(形参)只能存在一个
 *  2、在构造器首行，没有写this(形参)或者super(形参),则默认调用父类中的空参构造器
 *  3、在类的构造器中，至少有一个调用super(形参类别)
 *
 *  注意：虽然调用了父类的构造器，但是并没有创建父类的对象
 *
 * */

public class ObjectTest18 {
    public static void main(String[] args) {
        ObjectTest18 obj = new ObjectTest18();
        Ac account = new Ac(1122, 20000, 0.045);
        account.withdraw(30000);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println(account.getMonthlyInterest());
    }
}

class Ac {
    private int id;
    private double balance;
    private double annualRate;

    public Ac(){

    }

    public Ac(int id, double balance, double annualRate) {
        this.id = id;
        this.balance = balance;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualRate(double annualRate) {
        this.annualRate = annualRate;
    }

    public double getMonthlyInterest() {
        return annualRate / 12;
    }

    public void withdraw(double amount) {
        if (amount >= 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("取走：" + amount + ",余额为：" + balance);
            }
        } else {
            System.out.println("amount < 0");
        }
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
            System.out.println("存进：" + amount + ",余额为：" + balance);
        } else {
            System.out.println("amount < 0");
        }
    }
}
