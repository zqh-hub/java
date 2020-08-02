package com.object.java;
/*
* instanceof
* */
public class ObjectTest21 {
    public static void main(String[] args) {
        Person person = new Man();
        System.out.println(person);
        Man man = (Man)person;
        man.say();
        System.out.println(man);

        if (person instanceof Man){
            Man man2 = (Man)person;
            man2.say();
        }
    }
}
