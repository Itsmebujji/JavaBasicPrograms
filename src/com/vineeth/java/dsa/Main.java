package com.vineeth.java.dsa;

public class Main {
    public static void main(String[] args){
        LinkedList ll = new LinkedList(1);
        ll.add(2);
        System.out.println(ll.getTail().value);
        System.out.println(ll.getHead().value);
    }
}
