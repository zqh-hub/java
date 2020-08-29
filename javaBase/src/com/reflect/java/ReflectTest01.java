package com.reflect.java;
/*
* 类加载器：
* ClassLoader:负责加载类的对象
* 两个方法：
*      > static ClassLoader getSystemClassLoader():返回用于委派的系统类加载器
*      > ClassLader getParent():返回父类加载器进行委派
* */
public class ReflectTest01 {
    public static void main(String[] args) {
        // static ClassLoader getSystemClassLoader()
        ClassLoader c = ClassLoader.getSystemClassLoader();
        System.out.println(c);

        // final ClassLoader getParent()
        ClassLoader parent = c.getParent();
        System.out.println(parent);
        ClassLoader p2 = parent.getParent();
        System.out.println(p2);
    }

}
