package com.object.java;

/*
 * 封装性
 * */
public class ObjectTest05 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("大黄");
        animal.setAge(4);
        animal.setGender("男");
        System.out.print(animal.toString());
    }
}

class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal() {

    }

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", gender='" + this.getGender() + '\'' +
                '}';
    }
}
