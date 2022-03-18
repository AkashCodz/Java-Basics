package Class_object;

class Animal{
                                                                    // Instance Variables
    String name;                  //x
    String speciality;            //m
    int weight;                   //y
    
    void sound(String x,String m)                                     // Called "Methods"
    {                                          
        System.out.println(x+" sounds "+m);
    }
    void run(String x,String m){
System.out.println(x+" run "+m);
}
    void weight(String x,int y){
        System.out.println(x+" has weight "+y +"kg");
    }
}
   

public class Animal_content {
    public static void main(String[] args) {
        Animal Lion=new Animal();
        Animal Cheetah=new Animal();
        
        Lion.sound("Lion","Roaring");
        Lion.run("Lion","Fast");
        Lion.weight("Lion",145);
        System.out.println("");
        Cheetah.sound("Cheetah","Purr");
        Cheetah.run("Cheetah","Faster");
        Cheetah.weight("Cheetah",65);
        
    }
}
