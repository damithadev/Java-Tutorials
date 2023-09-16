/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q3;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Q3 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter 1st No: ");
        int num1 = myObj.nextInt();
        
        System.out.println("Enter 2nd No: ");
        int num2 = myObj.nextInt();
        
        if (num1>num2) {
             System.out.println("Maximum No is : " + num1);
        } else {
            System.out.println("Maximum No is : " + num2);
        }
        
    }
}
