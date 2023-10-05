package com.mycompany.mavenproject1;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class student1 {
    Scanner obj = new Scanner(System.in);
    public void func(){
               System.out.println("Enter name: ");
               String name = obj.next();
               
               System.out.println("Enter Degree: ");
               String deg = obj.next();
               
               System.out.println("Name :" + name);
               System.out.println("Degree :" + deg);
           }
}
