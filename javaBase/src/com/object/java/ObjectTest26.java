package com.object.java;

/*
 * static
 * 1、可用来修饰：属性、方法、代码块、内部类
 * 2、说明：
 *       ① 静态变量随着类的加载而加载
 *       ② 静态变量的加载要早于对象的创建
 *       ③ 由于类只会加载一次，则静态变量在内存中也只会加载一份，存在方法区的静态类中
 * 3、静态方法中，只能调用静态的方法和属性
 * 4、非静态方法可调用静态方法和属性
 *
 * 5、注意：
 *   在静态方法中，不能使用this、super,因为静态加载的早
 * */
public class ObjectTest26 {
    public static void main(String[] args) {
        Circ circ = new Circ();
        System.out.println(circ.getId());
        Circ circ02 = new Circ();
        System.out.println(circ02.getId());

        System.out.println(Circ.getTotal());
    }
}

class Circ {
    private double radius;
    private int id;

    private static int total;
    private static int init = 1001;

    public Circ(){
        id = init++;
        total++;
    }
    public Circ(double radius) {
        this();
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public int getId() {
        return id;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getTotal() {
        return total;
    }

    public double findArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}