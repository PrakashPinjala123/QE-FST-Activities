package com.example;

import java.util.ArrayList;

public class Activity9 {
public static void main(String[] args) {
ArrayList<String> myList = new ArrayList<String>();
myList.add("Prem");
myList.add("Ram");
myList.add("Syam");
myList.add("Bheem");
myList.add("Kamal");
for(String names:myList){
    System.out.println(names);
}
System.out.println(myList.get(2));
System.out.println(myList.contains("Ram"));
System.out.println(myList.size());
myList.remove("Syam");
System.out.println(myList.size());
}
}