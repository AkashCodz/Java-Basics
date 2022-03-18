package Protected;

public class Protected_Constructor {
    int x;
    
    protected Protected_Constructor()
    {
        x=4;
    }
    
     public static void main(String args[])
    {
        Protected_Constructor obj = new Protected_Constructor();
        System.out.println(obj.x);    }
}
