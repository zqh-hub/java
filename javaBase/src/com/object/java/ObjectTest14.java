package com.object.java;

public class ObjectTest14 {
    public static void main(String[] args) {
        Bank bank = new Bank(10);
        bank.addCus("jojo");
        bank.getCuss(0).setAcc(new Acc(300));
        double balance = bank.getCuss(0).getAcc().getBalance();
        System.out.println(balance);
    }
}

class Bank {
    private Cus[] cuss;
    private int numOfCus;

    public Bank(int len) {
        cuss = new Cus[len];
    }

    public void addCus(String name) {
        Cus newCus = new Cus(name);
        cuss[numOfCus] = newCus;
        numOfCus++;
    }

    public int getNumOfCus() {
        return numOfCus;
    }

    public Cus getCuss(int index) {
        if (index >= 0 && index < numOfCus) {
            return cuss[index];
        }
        return null;
    }
}