package Constructor;

public class Constructor_parameter {
  int modelYear;
  String modelName;

  public Constructor_parameter(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Constructor_parameter myCar = new Constructor_parameter(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}