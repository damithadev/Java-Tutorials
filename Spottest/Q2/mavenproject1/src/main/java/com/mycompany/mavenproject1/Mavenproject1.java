/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Mavenproject1;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);

        // Get the length of the arrays from the user
        System.out.print("Enter the length of the arrays: ");
        int length = scanner.nextInt();

        // Initialize arrays
        int[] array1 = new int[length];
        int[] array2 = new int[length];

        // Input elements for the first array
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        // Input elements for the second array
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Calculate the scalar product
        int scalarProduct = 0;
        for (int i = 0; i < length; i++) {
            scalarProduct += array1[i] * array2[i];
        }

        // Display the result
        System.out.println("Scalar Product: " + scalarProduct);

    }
}