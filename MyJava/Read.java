import java.lang.*;
import java.util.*;

class Read
{
 public static void main(String []args) 
{
    Scanner sc = new Scanner (System.in) ;
    int a,b, c;
    System.out.println("Enter First VALUE ");
    a=sc.nextInt();
    System.out.println("Enter Second  VALUE ");
    b=sc.nextInt();

    c=a+b;
    System.out.println("VALUE "+c);
    
    String Name ;
    System.out.println("Name ");
    Name=sc.nextLine();
    System.out.println("Name ="+Name);  
}
}
    