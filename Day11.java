package TapAcademy;

import java.util.Scanner;

public class Day11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		allPairs(ar);
	}

	private static void allPairs(int[] ar) {
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				System.out.println(ar[i]+","+ar[j]);
			}
		}
		
	}

}
