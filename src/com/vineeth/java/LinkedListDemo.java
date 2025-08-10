package com.vineeth.java;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(3);
        ll.add(4);
        System.out.println(ll);
        ll.add(1,2);
        System.out.println(ll);
        System.out.println(ll.get(0));
    }
}
