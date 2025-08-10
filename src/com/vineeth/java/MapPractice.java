package com.vineeth.java;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    /*
    Map:
        The Map interface in Java is a part of the Java Collections Framework,
        designed for storing and managing key-value pairs. It represents a collection
        where each key is mapped to exactly one value. The keys in a Map must be unique,
        while the values can be duplicated. Map is not a child interface of collection.

    Types:

        1.HashMap, LinkedHashMap
        2.IdentityHashMap
        3.WeakHashMap
        4.SortedMap
        5.NavigableMap
        6.TreeMap
        7.HashTable, Properties, Dictionary

     HashMap:


     */

    public static void main(String[] args){

        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> map1 = new HashMap<>();
        map.put(1,"Vineeth");
        map.put(2,"Kumar");
        //If you want to append the duplicate key, it will update value of that old Value
        map.put(2,"Vasu");
        map1.put(3,"Kumar");
        map1.put(4,"Sekhar");
        map.putAll(map1);
        System.out.println(map);
        System.out.println(map.get(3));
        System.out.println(map.remove(3));
        System.out.println(map.containsValue("Vineeth"));
        System.out.println(map.containsValue("vineeth"));
    }
}
