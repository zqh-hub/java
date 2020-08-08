package com.object.java;

public class ObjectTest35 {
}

interface CompareObj {
    int compareTo(Object o);
}

class Circlee {
    private double redius;

    public Circlee() {

    }

    public Circlee(double redius) {
        this.redius = redius;
    }

    public double getRedius() {
        return redius;
    }

    public void setRedius(double redius) {
        this.redius = redius;
    }
}

class CompareCircl extends Circlee implements CompareObj {

    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }
        if (o instanceof CompareCircl) {
            CompareCircl c = (CompareCircl) o;
            if (this.getRedius() > c.getRedius()) {
                return 1;
            } else if (this.getRedius() < c.getRedius()) {
                return -1;
            } else {
                return 0;
            }
        } else {
            return -2;
        }
    }
}