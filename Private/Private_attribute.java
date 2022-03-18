package Private;

public class Private_attribute {
  private String fname = "Akash";
  private String lname = "Sharma";
  private String email = "Ak@gmail.com";
  private int age = 20;

  public static void main(String[] args) {
    Private_attribute myObj = new Private_attribute();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}