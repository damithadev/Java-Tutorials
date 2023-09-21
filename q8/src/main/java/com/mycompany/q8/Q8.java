/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q8;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q8 {

    public static void main(String[] args) {
        int [] Numbers = new int [10];
        Scanner obj = new Scanner(System.in) ;
        
        int max = Numbers[0];  

        for (int i=0; i<9; i++) {
            
            System.out.println("Enter a number: ");
            int num = obj.nextInt();
            Numbers[i] = num;
        }
        
        for (int i=0; i<9; i++){
            if (max<Numbers[i]){
                max = Numbers[i];
            }
        }
        System.out.println("Maximum: " + max);
    }
}
