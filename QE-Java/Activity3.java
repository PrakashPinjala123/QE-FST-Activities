
package com.example;

public class Activity3 {
    public static void main(String[] args) {
        double seconds = 1000000000;
        double earthSeconds = 31557600;
        double mercury = 0.2408467;
        double venus = 0.61519726;
        double mars = 1.8808158;
        double jupiter = 11.862615;
        double saturn = 29.447498;
        double uranus = 84.016846;
        double neptune = 164.79132;

        System.out.println("Your Earth age is " + (seconds / earthSeconds));
        System.out.println("Your Mercury age is " + (seconds / (earthSeconds * mercury)));
        System.out.println("Your Venus age is " + (seconds / (earthSeconds * venus)));
        System.out.println("Your Mars age is " + (seconds / (earthSeconds * mars)));
        System.out.println("Your Jupiter age is " + (seconds / (earthSeconds * jupiter)));
        System.out.println("Your Saturn age is " + (seconds / (earthSeconds * saturn)));
        System.out.println("Your Uranus age is " + (seconds / (earthSeconds * uranus)));
        System.out.println("Your Neptune age is " + (seconds / (earthSeconds * neptune)));
    }
}
