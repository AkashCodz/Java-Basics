package Protected;


public class Protected_Method {
    protected void display()
    {
        System.out.println("Akash Sharma");
    }
}

class B extends Protected_Method {
    public static void main(String args[])
    {
        B obj = new B();
        obj.display();
    }
}