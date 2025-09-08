package com.vineeth.java.javahandson;

import java.util.LinkedList;
import java.util.List;

public class RvrLinkedList {
    public static void main(String[] args){
        LinkedList<Integer> lst = new LinkedList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        for(int i = lst.size()-1; i>=0; i--){
            System.out.println("Numbers are: "+ lst.get(i));
            l1.add(lst.get(i));
        }
        System.out.println(l1);
        System.out.println("*********** Second Method ***********");
        lst.descendingIterator().forEachRemaining(l2::add);
        System.out.println(l2);
    }

}
