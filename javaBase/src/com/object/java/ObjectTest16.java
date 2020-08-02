package com.object.java;
/*
* 方法的重写
* 1、子类重写的方法的方法名和形参列表与父类被重写的方法名与形参相同
* 2、子类重写的方法的权限修饰符不小于父类被重写的方法的权限修饰符
*      > 特殊情况：子类不能重写父类中声明为private权限的方法
* 3、返回值类型
*      > 父类无返回值，子类重写的方法也不能有
*      > 父类被重写的方法有返回值，子类重写的方法的返回值类型要与父类保持一致或者是其返回值类型的子类
* 4、抛出异常
*   子类重写的方法不大于父类被重写方法的异常类型
*
* 5、static修饰的方法不能重写
*
* */
public class ObjectTest16 {
    public static void main(String[] args) {
        ObjectTest17 obj = new ObjectTest17();
    }
}
