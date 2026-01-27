package com.example;
 interface  Addable {
    int add(int num1,int num2);
    
}
public class Activity12 {
    public static void main(String[] args) {
        Addable a1 = (a,b)-> (a+b);
        Addable a2= (int a,int b)->{
            return a+b;
        };
        System.out.println("Sum of a1 "+ a1.add(100,200));
        System.out.println("Sum of a2 "+a2.add(1000,2000));
    }
}
