package com.compare.java;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/*
 * comparator(定制排序)
 *
 * */
public class CompareTest02 {
    @Test
    public void test01() {
        Stu[] stus = new Stu[3];
        stus[0] = new Stu("jojo", 12);
        stus[1] = new Stu("jojo", 9);
        stus[2] = new Stu("jojo", 15);
        Arrays.sort(stus, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Stu && o2 instanceof Stu) {
                    Stu s1 = (Stu) o1;
                    Stu s2 = (Stu) o2;

                    if (s1.getAge() < s2.getAge()) {
                        return -1;
                    } else if (s1.getAge() > s2.getAge()) {
                        return 1;
                    } else {
                        return 0;
                    }
                }

                throw new RuntimeException("类型错误");
            }
        });

        System.out.println(Arrays.toString(stus));
    }
}

class Stu {
    private String name;
    private int age;

    public Stu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}