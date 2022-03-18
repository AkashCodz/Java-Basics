package Private;

public class Private_Constructor {
    
private int day ;
private int month ;
private int year ;

private Private_Constructor(int x,int y,int z){
    
    day=x;
    month=y;
    year=z;
    }

public static void main(String[] args) {
    Private_Constructor date1 = new Private_Constructor(20, 06, 2000);
    System.out.println(date1.year+"/"+date1.month+"/"+date1.day);

}
    
}
