package com.object.java;

public class ObjectTest11 {
    public static void main(String[] args) {
        Customer smith = new Customer("Smith");
        Account account = new Account(1000, 2000, 0.0123);
        smith.setAccount(account);
        smith.getAccount().withDraw(200);
        System.out.println(smith.toString());
    }
}

class Customer {
    private String name;
    private Account account;

    public Customer() {

    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", account=" + this.getAccount().toString()+
                '}';
    }
}