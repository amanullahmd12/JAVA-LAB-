import java.util.Scanner;

public class RemoveVowelsfromAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a String : ");
        String s = sc.nextLine();
        String s1 = "";
        s1 = s.replaceAll("[aeiou]", ""); 
        System.out.println("String after removing vowel : "+s1); 
	}

}