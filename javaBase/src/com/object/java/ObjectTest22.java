package com.object.java;

public class ObjectTest22 {
    public static void main(String[] args) {
        ObjectTest22 obj = new ObjectTest22();

        Cir c1 = new Cir("red", 1.0, 3);
        obj.displayGenometricObject(c1);
        Cir c2 = new Cir("green", 1.0, 4);
        obj.displayGenometricObject(c2);
        obj.equalsArea(c1, c2);
    }

    public void equalsArea(GenometricObject obj1, GenometricObject obj2) {
        if (obj1.findArea() == obj2.findArea()) {
            System.out.println("相等");
        }else {
            System.out.println("不等");
        }
    }

    public void displayGenometricObject(GenometricObject obj) {
        System.out.println("面积是：" + obj.findArea());
    }
}

class GenometricObject {
    private String color;
    private double weight;

    public GenometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea() {
        return 0.0;
    }
}

class Cir extends GenometricObject {
    private double radius;

    public Cir(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double findArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class MyRectangle extends GenometricObject {
    private double width;
    private double height;

    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    @Override
    public double findArea() {
        return width * height;
    }
}