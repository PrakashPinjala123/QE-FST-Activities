package com.example;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Activity13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Random indexGen = new Random();
        System.out.println("Enter integer values (non-integer to stop):");
        while (scan.hasNextInt()) {
            list.add(scan.nextInt());
        }
        Integer nums[] = list.toArray(new Integer[list.size()]);
        int randomIndex = indexGen.nextInt(nums.length);
        System.out.println("Generated Index: " + randomIndex);
        System.out.println("Value at Index: " + nums[randomIndex]);
        scan.close();
    }
}