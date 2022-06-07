import java.util.*;

public class ArrayDemo
{
 static void arrayfunc(int a[],int key,int l)
{


 for(int i=0;i<l;i++)
{
 int j=0;
 j=j+i;

 while(j<l)
{
 if(a[i]+a[j]==key)
{ 
 System.out.println(a[i]);
 System.out.println(a[j]);
}
  j=++j;
}

}
}




static void arrayfunc(int a[],int p,int b[],int q)
{
 int i=0;
 int j=0;
 int k=0;
 int[] c = new int[p+q];

 while(i<p && j<q)
{
 if(a[i] < b[j])
{  
 c[k]=a[i];
 k++;
 i++;
}
else
{
 c[k]=b[j];
 k++;
 j++;

}
}
 for(;i<p;i++)
{
 c[k]=a[i];
 k++;
}
for(;j<q;j++)
{
 c[k]=b[j];
 k++;
}
for(int l=0;l<k;l++)
{
 System.out.println(c[l]);
}
}





public static void main(String args[])
{

 Scanner sc=new Scanner(System.in);

 int n;
 int  k;
 System.out.println("Enter size of First Array");
 n=sc.nextInt();

 int[] A=new int[n];

 System.out.println("Enter Element of array ");

 for(int i=0;i<n;i++)
{
 A[i]=sc.nextInt();
}


 System.out.println("Enter Key");
 k=sc.nextInt();

 arrayfunc(A,k,n);

 int b;
  System.out.println("Enter size of Second Array");
  b=sc.nextInt();

 int[] B=new int[b];

 System.out.println("Enter Element of array ");

for(int i=0;i<b;i++)
{
 B[i]=sc.nextInt();
}


 arrayfunc(A,n,B,b);

}
}
