package com.vineeth.java;


import java.util.ArrayList;

public class ArrayListDemo{
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();
        al.add("Vineeth");
        al.add("Kumar");
        al.add(2,"Vasu");
        String s = al.get(1);
        al.remove(2);
        al.addFirst("Sekhar");
        al.addLast("Suma");
        boolean b = al.contains("Vineeth");
        al.removeLast();
        System.out.print(al);
    }
}
