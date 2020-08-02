package com.object.java;

public class ObjectTest19 {
    public static void main(String[] args) {
        CheckAc checkAc = new CheckAc(1122, 20000, 0.045, 5000);
        checkAc.withdraw(5000);
        System.out.println("可透支：" + checkAc.getOverdraft());

        checkAc.withdraw(18000);
        System.out.println("可透支：" + checkAc.getOverdraft());

        checkAc.withdraw(3000);
        System.out.println("可透支：" + checkAc.getOverdraft());
    }
}

class CheckAc extends Ac{
    private double overdraft;

    public CheckAc(){

    }

    public CheckAc(int id, double balance, double annualRate, double overdraft) {
        super(id, balance, annualRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()){
           super.withdraw(amount);
        }else if (overdraft >= amount-getBalance()){
            overdraft -= (amount-getBalance());
            super.withdraw(getBalance());
        }else {
            System.out.println("amount > overdraft");
        }
    }
}
