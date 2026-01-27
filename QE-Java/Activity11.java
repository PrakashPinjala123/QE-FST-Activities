package com.example;
import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer,String> colours = new HashMap<>();
        colours.put(1,"Red");
        colours.put(2,"Blue");
        colours.put(3,"Green");
        colours.put(4,"Yellow");
        colours.put(5,"Orange");
        System.out.println(colours);
        colours.remove(5);
        System.out.println(colours.containsValue("Green"));
        System.out.println(colours.size());
    }
    
}
