package Array;

import java.util.Scanner;

public class Array_input_output {
public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=s.nextInt();
        int arr[]=new int[n];
        int temp, size,max=arr[0];
        
        System.out.println("Enter elements");

        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }       

        System.out.println("Array elements are");
        for(int i = 0; i<n; i++)
        {
            System.out.println(arr[i]);
        }
}
}
