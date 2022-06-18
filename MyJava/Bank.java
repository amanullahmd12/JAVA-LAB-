

import java.util.*;
import java.lang.*;

class Bank
{
 public static void main (String []args)
{
Scanner sc =new Scanner(System.in);
 double t=0.0;
 double p=0.0;
 double r=0.0;


int choice;

System.out.println("Enter 1.Term Deposit  " + "2.Reccurring Deposit ");
choice=sc.nextInt();

double amount;

switch(choice)
{ 
 case 1:
 System.out.println("Enter Principal amount ");
 p=sc.nextInt();
 System.out.println("Enter rate at ");
 r=sc.nextInt();
 System.out.println("Enter time  ");
 t=sc.nextInt();
 amount =p*(Math.pow(1+(r/100),t));
 System.out.println("TERM DEPOSIT "+amount); 
 break;

 case 2:
 System.out.println("Enter Principal amount ");
 p=sc.nextInt();
 System.out.println("Enter rate at ");
 r=sc.nextInt();
 System.out.println("Enter time  ");
 t=sc.nextInt();
 amount = (p*t)+p*(t*(t+1)/2)+ r/100+ 1/12;
 System.out.println("Reccuring DEPOSIT "+amount);
 break;
}
}
}