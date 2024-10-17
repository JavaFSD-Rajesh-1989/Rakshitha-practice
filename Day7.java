//Plindrome
package TapAcademy;

import java.util.Scanner;

public class Day7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int result=isPalindrome(n);
		System.out.println((n==result) ? "Palindrome" : "Not Palindrome");
	}

	private static int isPalindrome(int n) {
		int rev=0;
		while(n>0)
		{
			int temp=n%10;
			rev=rev*10+temp;
			n=n/10;
		}
		return rev;
	}
}
