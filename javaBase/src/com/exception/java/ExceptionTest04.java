package com.exception.java;

import org.junit.Test;

import java.util.Scanner;

public class ExceptionTest04 {
    public static void main(String[] args) {
        EcmDef ecmDef = new EcmDef();
        try{
            ecmDef.ecm();
        }catch (EcDef e){
            System.out.println("小于o");
        }

    }
}

class EcmDef {
    public void ecm() throws EcDef,ArithmeticException{
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入参数1：");
        double num1 = scan.nextDouble();
        System.out.println("请输入参数2：");
        double num2 = scan.nextDouble();
        if (num1 < 0 || num2 < 0) {
            throw new EcDef("小于0了");
        }

        System.out.println(num1 / num2);

    }
}

class EcDef extends RuntimeException {
    static final long serialVersionUID = -7034897190745766939L;

    public EcDef() {
    }

    public EcDef(String message) {
        super(message);
    }
}