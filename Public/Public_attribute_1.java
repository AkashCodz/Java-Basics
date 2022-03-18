package Public;

//     If don't want package name       -->import Public.Main;

class Public_attribute_1 {
  public static void main(String[] args) {
    Public_attribute myObj = new Public_attribute(); 
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}