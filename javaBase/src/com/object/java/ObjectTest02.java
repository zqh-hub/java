package com.object.java;

public class ObjectTest02 {
    public static void main(String[] args) {
        Student[] stus = new Student[20];
        for (int i = 0; i < stus.length; i++) {
            stus[i] = new Student();
            stus[i].setNumber(i + 1);
            stus[i].setState((int) (Math.random() * (6 - 1 + 1) + 1));
            stus[i].setScore((int) (Math.random() * (100 - 60 + 1) + 60));
        }
        for (int i = 0; i < stus.length - 1; i++) {
            for (int j = 0; j < stus.length - i - 1; j++) {
                if (stus[j].getScore() > stus[j + 1].getScore()) {
                    Student temp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].toString());
        }

    }
}

class Student {
    private int number;
    private int state;
    private int score;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return this.score;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", state=" + state +
                ", score=" + score +
                '}';
    }
}