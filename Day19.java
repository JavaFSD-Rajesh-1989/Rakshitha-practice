package TapAcademy;

import java.util.Scanner;

public class Day19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
		String res=reverseString(s);
		System.out.println(res);
	}

	private static String reverseString(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		return rev;
	}
}
