
package com.example;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(4);
        hs.add(8);
        hs.add(12);
        hs.add(16);
        hs.add(20);
        hs.add(24);

        System.out.println(hs.size());      
        System.out.println(hs.remove(16));  
        System.out.println(hs.remove(11));  
        System.out.println(hs.contains(16)); 
        System.out.println(hs);            
    }
}

