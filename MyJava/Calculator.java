import java.util.Scanner;

public class Calculator {


public static void main(String[] args) {

for(int i=0;i<5;i++)
{
Scanner sc=new Scanner(System.in);


System.out.println("Enter n :");
int n=sc.nextInt();
System.out.println("Enter p :");
int p=sc.nextInt();

try{
if(n==0 && p==0)
throw new ArithmeticException("Both n and b are Zero");
}
catch(Exception e)
        {
      	 System.out.println(e);
        }
try{ 
if(n<0||p<0)
throw new ArithmeticException("Either n or b is negative");
}
 catch(Exception e)
        {
      	 System.out.println(e);
        }

System.out.println(Math.pow(n,p));

}
}
}