//hcf
//package TapAcademy;
//
//import java.util.Scanner;
//
//public class Day6 {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n1=scan.nextInt();
//		int n2=scan.nextInt();
//		printHighestCommonFactor(n1,n2);
//
//	}
//
//	private static void printHighestCommonFactor(int n1, int n2) {
//		for(int i=n1;i>=1;i--)
//		{
//			if(n1%i==0 && n2%i==0)
//			{
//				System.out.println(i);
//				break;
//			}
//		}
//		
//	}
//}


//or  this is correct code for finding hcf

package TapAcademy;

import java.util.Scanner;

public class Day6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int res=printHighestCommonFactor(n1,n2);
		System.out.println(res);
	}

	private static int printHighestCommonFactor(int n1, int n2) {
		int hcf=1;
		for(int i=1;i<=n1 && i<=n2;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				hcf=i;
			}
		}
		return hcf;
	}
}
