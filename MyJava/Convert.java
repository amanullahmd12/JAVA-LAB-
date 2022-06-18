import java.util.*;
import java.lang.*;

public class Convert
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int a;
 a=sc.nextInt();
 String str=Integer.toString(a);
 int len =str.length();
 
 String str1= "";
 for(int i=0;i<len;i++)
{
 if(str.charAt(i)=='0')
{
 str1=str1+ '1'; 
}
else
{
 str1=str + str.charAt(i);
}
}
System.out.println("New integet "+str1);
}
}
 