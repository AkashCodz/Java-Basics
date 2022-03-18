package Private;

public class Private_method {
   private void print() {
      System.out.println("in parent print");
   }
   public static void main(String[] args) {

      Private_method obj = new Private_method_Child();
      obj.print();
      Private_method_Child obj1 = new Private_method_Child();
      obj1.print();
   }
}
class Private_method_Child extends Private_method {
   public void print(){
      System.out.println("in child print method");
   }
}