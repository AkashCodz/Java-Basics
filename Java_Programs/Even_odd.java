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
public class Even_odd {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter your number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for (int i = 0; i <=num; i++) 
        {
              if (i%2==0) 
        {
            System.out.println("Even number =" +i);
            
        } 
        else 
        {
              System.out.println("Odd number ="+i);
        }
            
        }
        
        
    }
    
}
