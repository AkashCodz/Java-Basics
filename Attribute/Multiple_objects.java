package Attribute;

public class Multiple_objects {
  int x = 5;

  public static void main(String[] args) {
    Multiple_objects myObj1 = new Multiple_objects();  // Object 1
    Multiple_objects myObj2 = new Multiple_objects();  // Object 2
    myObj2.x = 25;
    System.out.println(myObj1.x);  // Outputs 5
    System.out.println(myObj2.x);  // Outputs 25
  }
}