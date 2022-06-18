import java.util.*;
public class Main {
static int replace(int number) {
    if (number == 0)
        return 0;
    int digit = number % 10;
    if (digit == 0)
        digit = 1;
     return replace(number/10) * 10 + digit;
    }
    static int Convert(int number) {
        if (number == 0)
	        return 1;
        else
        	return replace(number);
    } 

    public static void main(String[] args) 
	{
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
 		number = sc.nextInt();
		System.out.print("Number after replacement : ");
		System.out.print(replace(number));
	}
}