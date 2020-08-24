package com.method.java;

public class MethodTest02 {
    public static void main(String[] args) {
        useStudentBuilder((String name, int age) -> {
            return new Student(name, age);
        });

        useStudentBuilder((name, age) -> new Student(name, age));

        // 引用构造器
        useStudentBuilder(Student::new);
    }

    public static void useStudentBuilder(StudentBuilder s) {
        Student jojo = s.build("jojo", 12);
        System.out.println(jojo.toString());

    }
}

interface StudentBuilder {
    Student build(String name, int age);
}

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}