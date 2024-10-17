package TapAcademy;

import java.util.Scanner;

public class Day4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		printCommonFactors(n1,n2);

	}

	private static void printCommonFactors(int n1, int n2) {
		for(int i=1;i<=n1;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				System.out.println(i);
			}
		}	
	}
}
