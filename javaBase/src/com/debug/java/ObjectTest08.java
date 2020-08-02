package com.debug.java;

import com.object.java.ObjectTest06;
import com.object.java.ObjectTest17;

public class ObjectTest08 extends ObjectTest17{
    public static void main(String[] args) {
        ObjectTest06 obj = new ObjectTest06();
        obj.gender = "nan";
        obj.sayFk();

        ObjectTest08 obj08 = new ObjectTest08();
        obj08.protectedMath();
        obj08.publicMath();
    }
}
