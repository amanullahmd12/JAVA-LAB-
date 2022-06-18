import java.lang.*;
import java.util.*;

class Student{

 String name[]=new String[3];
 int roll[]=new int[3];
 int age[]=new int[3];

void setInfo()
{
 for (int i=0;i<3;i++)
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
 for (int i=0;i<3;i++)
{
System.out.println("Name of student "+name[i]);
System.out.println("Roll of student "+roll[i]);
System.out.println("Age of student "+age[i]);
}
} 
}

class Inheritance extends Student
{
  int m1[]=new int[3];
  int m2[]=new int[3];
  int m3[]=new int[3];

void setMarks()
{
for(int i=0;i<3;i++)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter marks of student");
 m1[i]=sc.nextInt();
 m2[i]=sc.nextInt();
 m3[i]=sc.nextInt();
}
}


void getMarks()
{
for(int i=0;i<3;i++)
{
 System.out.println("Marks of student are: ");
 System.out.println(m1[i]);
 System.out.println(m2[i]);
 System.out.println(m3[i]);
}
}
public static void main (String args[])
{
 Inheritance ob =new Inheritance ();
 ob.setInfo();
 ob.getInfo();
 ob.setMarks();
 ob.getMarks();

}  
}