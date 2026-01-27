package com.example;

public class Activity1 {
String color;
String transmission;
int make;
int tyres;
int doors;
public void Characteristics(){
    System.out.println("The car has "+doors+" doors and "+tyres+" tyres and it was made in the year. "+make+"It is in "+color+ "and mode is"+transmission);
}
public void accelerate(){
    System.out.println("car is moving");
}
public void brake(){
    System.out.println("car has stopped");
}
}
class Activity{
public static void main(String [] args){
    Activity1 newCar = new Activity1();
    newCar.tyres=4;
    newCar.doors=4;
    newCar.make=2014;
    newCar.color="Black";
    newCar.transmission="Manual";
    newCar.Characteristics();

}
}