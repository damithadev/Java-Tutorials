/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q4;
import java.util.Scanner; 
/**
 *
 * @author HP
 */
public class Q4 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter number : ");
        int num = obj.nextInt();
        
        if (num == 0) {
            System.out.println("Number shouldn't be zero");
        } else {
            for (int i = num; i >= 0 ; i--) {
            System.out.println(i);
        } 
        }
        
    }
}
