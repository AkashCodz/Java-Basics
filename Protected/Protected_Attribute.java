package Protected;
public class Protected_Attribute{}



class Person {
  protected String name = "Akash Sharma";
  protected int age = 20;
}

class Student extends Person {
  public static void main(String[] args) {
    Student myObj = new Student();
    System.out.println("Name: " + myObj.name);
    System.out.println("Age: " + myObj.age);
  }
}

