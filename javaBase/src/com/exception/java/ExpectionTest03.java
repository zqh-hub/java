package com.exception.java;

import org.junit.Test;

/*
* 自定义异常
* */
public class ExpectionTest03 {
    @Test
    public void testMyExpection () throws MyException{
        int i = 0;
        if (i < 1){
            throw new MyException("错");
        }
    }
}

class MyException extends RuntimeException{
    static final long serialVersionUID = -7034897190745766939L;

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}