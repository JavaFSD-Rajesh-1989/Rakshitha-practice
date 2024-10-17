package TapAcademy;

import java.util.Scanner;

public class Day20 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String res=isPalindrome(s);
		System.out.println(res);
	}

	private static String isPalindrome(String s) {
		int i=0,j=s.length()-1;
			if(s.charAt(i)==s.charAt(j))
			{
				i++;
				j--;
			}
			else
			{
				return "Not Palindrome";
			}
		return "Palindrome";
	}
}
