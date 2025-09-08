package com.vineeth.java.javahandson;

public class Multithreading extends Thread{
    public static void main(String[] args){
        // Thread implementation-1 by extending the thread class
        Multithreading multithreading= new Multithreading();
        multithreading.start();
        // Thread implementation-1 by implementing the thread class
        Multithreading1 multithreading1 = new Multithreading1();
        multithreading1.run();

    }
    @Override
    public void run(){
        System.out.println("Thread1 is created using the thread class");
    }

    static class Multithreading1 implements Runnable {

        @Override
        public void run() {
            System.out.println("Thread2 is created using the runnable class");
        }
    }
}
