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
        
        System.out.println("Enter Age: ");
        int age = obj.nextInt();
        
        user obj1 = new user();
        obj1.func(age);
        
    }
}
