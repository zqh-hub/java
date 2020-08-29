package com.reflect.java;

import org.junit.Test;

/*
 * 获取Class类的对象
 * 三种方式：
 *   > 使用类的class属性
 *   > 调用getClass()方法
 *   > 使用Class类的静态方法forName(String className)
 * */
public class ReflectTest02 {
    @Test
    public void test01() {
        //使用类的class属性
        Class<Student> sc = Student.class;
        System.out.println(sc);
    }

    @Test
    public void test02() {
        Student student = new Student();
        Class<? extends Student> sc = student.getClass();
        System.out.println(sc);
    }
    
    @Test
    public void test03() throws ClassNotFoundException {
        Class<?> sc = Class.forName("com.reflect.java.Student");
        System.out.println(sc);
    }
}

class Student {
    private String name;
    int age;
    public String gender;

    public Student() {
    }

    private Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    private void fun() {
        System.out.println("fun");
    }

    public void m01() {
        System.out.println("m01");
    }

    public void m02() {
        System.out.println("m01");
    }

    public String m03(String s, int i) {
        return s + "," + i;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}