package com.vineeth.java.javahandson;

public class DeadLock {
    static final Object resource1 = new Object();
    static final Object resource2 = new Object();
    public static void main(String[] args){
        DeadLock.MultiThread1 mul = new DeadLock.MultiThread1();
        DeadLock.MultiThread2 mul2 = new DeadLock.MultiThread2();
        mul.start();
        mul2.start();

    }

    static class MultiThread1 extends Thread {
        @Override
        public void run(){
            synchronized (resource1) {
                System.out.println("Thread One: Locked resource X");

                try {
                    Thread.sleep(100); // Sleep to allow Thread Two to run
                } catch (InterruptedException e) {}

                System.out.println("Thread One: Trying to lock resource Y...");
                synchronized (resource2) {
                    System.out.println("Thread One: Locked resource Y"); // This will not be reached
                }
                System.out.println("Thread One is finished");
            }
        }
    }

    static class MultiThread2 extends Thread {
        @Override
        public void run(){
            synchronized (resource2) {
                System.out.println("Thread Two: Locked resource X");

                try {
                    Thread.sleep(100); // Sleep to allow Thread Two to run
                } catch (InterruptedException e) {}

                System.out.println("Thread Two: Trying to lock resource Y...");
                synchronized (resource1) {
                    System.out.println("Thread Two: Locked resource Y"); // This will not be reached
                }
                System.out.println("Thread Two is finished");
            }
        }
    }
}
