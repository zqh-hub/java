package com.object.java;

public class ObjectTest04 {
    public static void main(String[] args) {
        PassObject obj = new PassObject();
        obj.printArea(new Circle(), 5);
    }
}

class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int findArea() {
        return (int) (Math.PI * Math.pow(getRadius(), 2));
    }
}

class PassObject {
    public void printArea(Circle c, int time) {
        for (int i = 1; i <= time; i++) {
            c.setRadius(i);
            System.out.println(i + "=====" + c.findArea());
        }
    }
}