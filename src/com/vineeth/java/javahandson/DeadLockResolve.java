package com.vineeth.java.javahandson;

public class DeadLockResolve {
    static final Object resource1 = new Object();
    static final Object resource2 = new Object();
    public static void main(String[] args){
        DeadLockResolve.MultiThread1 mul1 = new DeadLockResolve.MultiThread1();
        DeadLockResolve.MultiThread2 mul2 = new DeadLockResolve.MultiThread2();
        mul1.start();
        mul2.start();
    }
    static class MultiThread1 extends Thread {
        @Override
        public void run(){
            synchronized (resource1){
                System.out.println("Thread one: Locked resource1");
                try{
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Thread One: Trying to lock resource Y...");
                    throw new RuntimeException(e);
                }
                synchronized (resource2){
                    System.out.println("Thread one: Locked resource2");
                }
            }
            System.out.println("Thread successfully executed");
        }
    }

    static class MultiThread2 extends Thread {
        @Override
        public void run(){
            synchronized (resource1){
                System.out.println("Thread Two: Locked resource1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Thread one: Locked resource2");
                    throw new RuntimeException(e);
                }
                synchronized (resource2){
                    System.out.println("Thread Two: Locked resource2");
                }
            }
            System.out.println("Threads successfully executed");
        }
    }
}
