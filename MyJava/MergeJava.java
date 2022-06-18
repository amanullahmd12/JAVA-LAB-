import java.util.*;
import java.lang.*;

class MergeJava
{
 void arrayFunc(int A[],int p,int B[],int q)
{
int  i,j,k,h;
 i =j=k=h=0;
 int C[]=new int[k];
 int R[]=new int[h];
 
 while(i<p && j<q)
{
 if(A[i]<B[j])
{
 C[k]=A[i];
  k++;
  i++;
}
else
{
 C[k]=B[j];
  k++;
  j++;
}
}

for(;i<p;i++)

{ 
 R[h]=A[i];
}

for(;j<q;j++)
{
R[h]=B[j];
}

for(i=0;i<k;i++)
{
 C[k]=A[i];
}

for (j=0;j<h;j++)
{
 R[h]=B[j];
}

for(i=0;i<k;i++)
{
 System.out.println("A "+A[i]);
}
for(j=0;j<h;j++)
{
 System.out.println("B "+B[j]);
}
}
public static void main(String[]args)
{
 int A[]={2,6,9,10,12,23};
 int B[]={1,4,8,9,11,25,28,32};
 MergeJava ob = new MergeJava();
 ob.arrayFunc(A,6,B,8);

}
}
 