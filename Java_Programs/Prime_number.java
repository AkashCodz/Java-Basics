package Java_Programs;

import java.util.Scanner;

public class Prime_number {
    
    public static void main(String[] args) {
        int num,temp;
        boolean value=true;
        System.out.println("Enter your number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for (int i = 2; i <=num/2; i++) 
        {
            temp=num%i;
            if(temp==0)
            {
                value=false;
                break;     
        }
            
        }
        
        if (value) 
        {
            System.out.println("Entered number is Prime number = "+num);   
        } 
        else 
        {
            System.out.println("Entered number is not a Prime number "); 
        }
    }
    
}