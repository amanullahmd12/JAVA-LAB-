import java.util.*;
import java.lang.*;
class Cheack
{
 public static void main (String args[])
{
 String n,a,h,g;

 if(args.length >= 0)
{
 n=args[0];
 a=args[1];
 h=args[2];
 g=args[3];
 System.out.println("Arguments are :");
 System.out.println("name"+n); 
 System.out.println("age:"+a); 
 System.out.println("roll"+h); 
 System.out.println("cours e"+g);
}
 else
{
 System.out.println("Arguments not found:");
}
}
}