package TapAcademy;

import java.util.Scanner;

public class Day12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int k=scan.nextInt();
		pairs(ar,k);
	}

	private static void pairs(int[] ar, int k) {
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				int diff1=ar[i]-ar[j];
				int diff2=ar[j]-ar[i];
				if(diff1==k || diff2==k)
				{
					System.out.println(ar[i]+","+ar[j]);
				}
			}
		}
	}
}
