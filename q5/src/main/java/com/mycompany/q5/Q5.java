/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q5;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Q5 {

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter number : ");
        int num1 = obj.nextInt();
        
        System.out.println("Enter number : ");
        int num2 = obj.nextInt();
        
        if (num1 % num2 == 0) {
            System.out.println("Devisible");
        } else {
            System.out.println("Not Devisible");
            
        } 
        
    }
}
