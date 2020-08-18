package com.io.java;

import org.junit.Test;

import java.io.*;

/*
 * 自定义可序列化的类:
 *   1、实现接口：
 *   2、提供UID
 * 注意：static 和transient修饰的不能被序列化
 * */
public class IOTest13 {
    @Test
    public void test() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src\\com\\io\\java\\files\\test07.per");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        Person jojo = new Person("jojo", 23);
        objectOutputStream.writeObject(jojo);
        objectOutputStream.flush();

        objectOutputStream.close();

    }

    @Test
    public void test02() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("src\\com\\io\\java\\files\\test07.per");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Object o = objectInputStream.readObject();
        Person per = (Person) o;
        System.out.println(per);

        objectInputStream.close();
    }
}

class Person implements Serializable {
    private static final long serialVersionUID = 94470754667710L;

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
