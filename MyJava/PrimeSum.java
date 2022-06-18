import java.util.*;
import java.lang.*;

class PrimeSum
{
public static void main(String []args)
{
 int n=100 , sum =0;
 for(int i=2;i<=n;i++)
{
 int flag=0;
for(int j=2;j<=Math.sqrt(i);j++)
{
 if(i%j==0)
 flag=1;
}
if(flag==0)
{
System.out.println(i+" ");
sum=sum+i;
}
}
System.out.println("\nPrime Sum "+sum);
}
}