package Switch_case;

import java.util.Scanner;

public class Switch_case_shortcut {
    public static void main(String[] args) {
        
        
        System.out.println("Enter the day number -:");
        Scanner input=new Scanner(System.in);
       int day=input.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thrusday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid");
        }
    }
    
}