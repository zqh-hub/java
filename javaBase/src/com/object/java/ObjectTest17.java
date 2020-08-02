package com.object.java;

public class ObjectTest17 {
    private String privateName;
    int defaultAge;
    protected String protectedGender;
    public String publicHeight;

    private void privateMath() {
        System.out.println("private method");
    }

    void defaultMath() {
        System.out.println("default method");
    }

    protected void protectedMath() {
        System.out.println("protected method");
    }

    public void publicMath() {
        System.out.println("public method");
    }

}
