package com.mycompany.mavenproject1;
import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
       
        System.out.println("Enter Radius: ");
        int r = obj.nextInt();
        
        EncapData obj1 = new EncapData();
        obj1.SetRadius(r);
        
        System.out.println("Area: " + obj1.GetArea()); 
        System.out.println("Circumference: " + obj1.GetCircumference()); 
    }
}
