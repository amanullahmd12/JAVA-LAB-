import java.util.Scanner;

class Q9javalah {

public static void main(String args[])
{
Scanner c= new Scanner(System.in);

System.out.print("Enter a string");

String str= sc.nextLine();

StringBuffer sb = new StringBuffer(str);

String s="";

for(int i=0;i<sb.length();i++)
{

if(sb.charAt(i)='a' || sb.charAt(i)=='c' || sb.charAt(i)=='i' || sb.charAt(i)=='o'|| sb.charAt(i)=='u' ||sb.charAt(i)=='A' || sb.charAt(i)=='E' ||sb.charAt(i)=='T' ||sb.charAt(i)=='O'||sb.charAt(i) == 'U')
{
sb.replace(i,i+1, "");
}
}

System.out.print(sb);
}
}