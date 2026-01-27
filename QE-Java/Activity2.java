package com.example;

public class Activity2 {
public static void main(String [] args){
    int sum=0;
    int [] integers = {10,77,10,54,-11,10};
    for(int i=0;i<integers.length;i++){
        if (integers[i]==10){
            sum+=integers[i];
        }
    }
    if(sum==30){
        System.out.println(true);
    }
    else{
        System.out.println(false);
    }
}
}
