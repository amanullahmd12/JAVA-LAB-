
import java.util.*;
import java.lang.*;

class Friendly
{

 public static void main (String agrs[])
{
 Scanner sc = new Scanner(System.in);

 int a;
 a=sc.nextInt();



 int b;
 b=sc.nextInt();

int s1=0;
int s2=0; 

for(int i=1;i<a;i++)
{
 if(a%i==0)
{
 s1=s1+i;
}
}

for(int i=1;i<b;i++)
{
 if(b%i==0)
{
 s2=s2+i;
}
}

if(s1/a == s2/b)
{
System.out.println("Friendly Pair");
}

else
{
System.out.println("Not Friendly Pair");
}

}
}