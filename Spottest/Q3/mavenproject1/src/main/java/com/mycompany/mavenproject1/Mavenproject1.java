/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Mavenproject1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class  Mavenproject1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int length = 5;

        // Initialize arrays
        int[] array1 = new int[length];
        int[] array2 = new int[length];

        
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

       
        int[] combinedArray = new int[length * 2];
        System.arraycopy(array1, 0, combinedArray, 0, length);
        System.arraycopy(array2, 0, combinedArray, length, length);

        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int value : combinedArray) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        System.out.println("Combined Array:");
        for (int value : combinedArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nMinimum Value: " + min);
        System.out.println("Maximum Value: " + max);
    }
}