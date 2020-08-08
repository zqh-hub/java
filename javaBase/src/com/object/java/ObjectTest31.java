package com.object.java;
/*
* abstract
* 1、可以用来修饰类、方法；不能修饰属性，构造器，私有方法、静态方法（静态方法不能被重写）、final方法
* 2、修饰类：
*       > 不能再实例化，
*       > 抽象类虽然不能实例化，但一定要有构造器，因为子类要调用
* 3、修饰方法：
*       > 只有声明，没有方法体
*       > 包含抽象方法的类，一定是抽象类，反之不一定
*       > 子类重写所有的抽象方法，
* */
public class ObjectTest31 {
    public static void main(String[] args) {
        Employee manager = new Manager("管理者", 1002, 40000, 3000);
        manager.work();
        Employee commonEmploy = new CommonEmploy();
        commonEmploy.work();
    }
}

abstract class Employee{
    private String name;
    private int id;
    private double salary;

    public Employee(){

    }

    public Employee(String name,int id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
}

class Manager extends Employee{
    private double bonus;

    public Manager(){

    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void work() {
        System.out.println("管理");
    }
}

class CommonEmploy extends Employee{

    @Override
    public void work() {
        System.out.println("普通员工");
    }
}