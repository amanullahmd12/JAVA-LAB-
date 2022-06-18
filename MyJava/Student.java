import java.lang.*;
import java.util.*;

class Student {
 String name[]=new String[10];
 int roll[]=new int[10];
 int age[]=new int[10];

void setInfo()
{
 for (int i=0;i<10;i++)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Name of student");
 name[i]=sc.nextLine();
System.out.println("Enter roll of student");
 roll[i]=sc.nextInt();
System.out.println("Enter age of student");
 age[i]=sc.nextInt(); 
}
}
void getInfo()
{
 for (int i=0;i<10;i++)
{
System.out.println("Name of student "+name[i]);
System.out.println("Roll of student "+roll[i]);
System.out.println("Age of student "+age[i]);
}
}
public static void main(String args[])
{
 Student ob =new Student ();
 ob.setInfo();
 ob.getInfo();
}  
}