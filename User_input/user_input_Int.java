package User_input;

import java.util.Scanner;

public class user_input_Int {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer:");
	      int number = input.nextInt();
	        System.out.println("You entered " + number);

	        // closing the scanner object
	        input.close();
    }
    
}
