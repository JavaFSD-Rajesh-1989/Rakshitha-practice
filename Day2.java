//factors

package TapAcademy;

import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		printFactors(n);

	}

	private static void printFactors(int n) {
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}

}
