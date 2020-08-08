package com.object.java;

public class ObjectTest27 {
    public static void main(String[] args) {
        Account02 acc01 = new Account02();
        Account02 acc02 = new Account02();
        System.out.println(acc01.getId());
        System.out.println(acc02.getId());
    }
}

class Account02 {
    private int id;
    private int pwd;
    private double blance;
    private static double rate;
    private static double minBlance;

    private static int init = 1001;

    public Account02() {
        id = (int) (Math.random() * (100 - 1) + 1);
    }

    public int getId() {
        return id;
    }

    public int getPwd() {
        return pwd;
    }

    public double getBlance() {
        return blance;
    }

    public static double getRate() {
        return rate;
    }

    public static double getMinBlance() {
        return minBlance;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    public static void setRate(double rate) {
        Account02.rate = rate;
    }

    public static void setMinBlance(double minBlance) {
        Account02.minBlance = minBlance;
    }
}
