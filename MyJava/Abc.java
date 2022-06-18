import java.util.*;
import java.lang.*;
public class Abc{        
 public static void main(String[] args) 
	{
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
 		str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if(str[i]=='0')
			{
				str=str.replace('0','1');
			}
		}
		System.out.println(str);
	
	}
}
