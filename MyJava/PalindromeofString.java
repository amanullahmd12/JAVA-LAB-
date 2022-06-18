import java.util.*;
public class PalindromeofString{

	//Function to check whether given string is palindrome or not.
	static boolean palindrome(String s, int low, int high) {

		int len = (high + low) / 2;

		for (int i = 0; i <= len; i++) {
			if (((low + i) <= high) && s.charAt(low + i) != s.charAt(high - i))return false;
		}
		return true;
	}

	public static void main(String [] args) {
		Scanner inp = new Scanner(System.in);

		String str;
		String answer = new String();

		System.out.println("ENTER THE STRING");

		str = inp.nextLine();
		int n = str.length();
		int max_length = 0;

		//Check for each substring whether it's palindromic or not
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {

				//if a substring in palindromic then
				if (palindrome(str, i, j)) {
					if (max_length < (j - i + 1)) {
						max_length = j - i + 1;
						answer = str.substring(i, j + 1);
						//storing the palindromic string in answer.
					}
				}

			}
		}

		System.out.println(" Longest Palindromic Substring is: " + answer + " of LENGTH: " +max_length);

	}
}