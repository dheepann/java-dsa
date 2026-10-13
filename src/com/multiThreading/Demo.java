package com.multiThreading;

public class Demo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        MyRunnable r1 = new MyRunnable();
        Thread t2 = new Thread(r1);
        t2.start();

    }
}

// extend from thread class
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

/*
t1.start() --> JVM asks OS to create a new thread --> Thread gets stack/PC space --> Thread executes run()
*/

// thread using Runnable interface
// preferred method because a class can implement multiple interfaces but can extend only single class
// also Runnable interface is at the top of hierarchy. Thread class implements Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running via runnable interface");
    }
}