package com.process.java;

/*
 * 生产者，消费者模式
 *
 * wait()
 *
 * */
public class ProcessTest07 {
    public static void main(String[] args) {
        Box box = new Box();
        Producer producer = new Producer(box);
        Customer customer = new Customer(box);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(customer);

        t1.start();
        t2.start();
    }
}

class Box {
    private int milkNum;
    private boolean state = false;

    public synchronized void addMilk(int milkNum) {
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            this.milkNum = milkNum;
            System.out.println("送奶工将" + this.milkNum + "瓶奶放入奶箱");
        }
        state = true;
        notifyAll();
    }

    public synchronized void getMilk() {
        if (!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("用户拿了" + this.milkNum);
        state = false;
        notifyAll();
    }
}

class Producer implements Runnable {
    private Box b;

    public Producer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            b.addMilk(i);
        }
    }
}

class Customer implements Runnable {
    private Box b;

    public Customer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        while (true) {
            b.getMilk();
        }
    }
}