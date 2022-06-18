package q8javalab;

import java.util.*;

class Q8javalab {
public static void main(String args[] ){

String stri;

Scanner sc = new Scanner(System.in); 
System.out.print("Enter a string:");

stri = sc.nextLine(); 
char[] str = stri.toCharArray();

char last = str[0];

int i=1, counter=0;

while(i<str.length) {

if(str[i]=='1'&&last=='0'){

while(str[i]=='1')
i++;

if(str[i]=='0')

counter++;
}

last=str[i];
i++;
}

System.out.print("Patter Count:" +counter);
}
}