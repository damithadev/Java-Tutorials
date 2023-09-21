/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = obj.next();
        
        System.out.println("Enter your age: ");
        int age = obj.nextInt();
        
        if (age>18) {
            System.out.println("Eligible for voting  ");
        }
        else {
            System.out.println("Not eligible for voting  ");
        }
    }
}
