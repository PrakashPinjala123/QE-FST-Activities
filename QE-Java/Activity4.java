package com.example;

public class Activity4 {
public static void main(String [] args){
    int [] integers = {4,3,2,10,12,1,5,6};
    for(int i=1;i<integers.length;i++){
        int key = integers[i];
        int j =i-1;
        while(j>=0 && integers[j]>key){
            integers[j+1]=integers[j];
            j--;
        }
        integers[j+1]=key;
    }    
        for(int num:integers){
            System.out.println(num+" ");
        }

}
}
