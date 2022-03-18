/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Programs;

import java.util.Scanner;

/**
 *
 * @author Rahul Sharma
 */
public class Leap_year {
    public static void main(String[] args) {
        
        
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year");
        int year=sc.nextInt();
        if (((year%4==0)&&(year%100!=0)||(year%400==0))) 
        {
            System.out.println(year +" is a Leap Year"); 
        } 
        else 
        {
            System.out.println(year +" is not a leap year");
        }
        
        
    }
    
}
