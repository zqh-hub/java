package com.process.java;

public class ProcessTest06 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket, "窗口1");
        Thread t2 = new Thread(ticket, "窗口2");
        Thread t3 = new Thread(ticket, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Ticket implements Runnable {
    private int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            syn();
        }
    }

    public synchronized void syn() {
        if (ticketNum > 0) {
            System.out.println(Thread.currentThread().getName() + "====" + ticketNum);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticketNum--;
        }
    }
}