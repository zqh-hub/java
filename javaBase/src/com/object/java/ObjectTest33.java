package com.object.java;
/*
* 接口interface
* 1、jdk1.7及之前：
*       > 全局常量：public static final
*       > 抽象方法：public abstract
* 2、jdk8：还可以定义静态方法、默认方法
* 3、接口中不能定义构造器
* 4、接口通过让类去实现（implements）的方式来使用
* 8、接口与接口之间可以继承，并且可以多继承
* */
public class ObjectTest33 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Flash flash = new Flash();
        computer.work(flash);
    }
}
interface USB{
    void start();
    void stop();
}

class Flash implements USB{

    @Override
    public void start() {
        System.out.println("flash开始工作");
    }

    @Override
    public void stop() {
        System.out.println("flash结束工作");
    }
}

class Computer{
    public void work(USB usb){
        usb.start();
        System.out.println("工作中");
        usb.stop();
    }
}