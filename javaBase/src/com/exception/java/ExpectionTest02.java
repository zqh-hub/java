package com.exception.java;

public class ExpectionTest02 {

}

class Student{
    private int id;

    public void setId(int id) throws Exception {
        if (id > 0){
            this.id = id;
        }else {
            throw new RuntimeException("id < 0");
        }
    }
}

