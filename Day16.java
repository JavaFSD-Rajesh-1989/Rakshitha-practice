//package TapAcademy;
//
//import java.util.Scanner;
//
//public class Day16 {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n=scan.nextInt();
//		int[] ar = new int[n];
//		for(int i=0;i<ar.length;i++)
//		{
//			ar[i]=scan.nextInt();
//		}
//		subArrays(ar);
//	}
//
//	private static void subArrays(int[] ar) {
//	for(int size=0;size<ar.length;size++)
//	{
//		for(int i=size;i<ar.length;i++)
//		{
//			for(int j=size;j<=i;j++)
//			{
//				System.out.print(ar[j]+" ");
//			}
//			System.out.println();
//		}
//	}
//		
//	}
//
//}
////o/p
//5
//1 2 3 4 5
//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5 
//2 
//2 3 
//2 3 4 
//2 3 4 5 
//3 
//3 4 
//3 4 5 
//4 
//4 5 
//5 


//longest sub array with sum
package TapAcademy;

import java.util.Scanner;

public class Day16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int k=scan.nextInt();
		subArrays(ar,k);
	}

	private static void subArrays(int[] ar,int k) {
		for(int size=ar.length-1;size>=1;size--) {
		for(int i=0;i<=ar.length-size;i++)
		{
			int sum=0;
			for(int j=i;j<i+size;j++)
			{
				sum=sum+ar[j];
			}
			if(sum==k) {
			
			for(int j=i;j<i+size;j++)
			{
				System.out.print(ar[j]+" ");
			}
			System.out.println();
			return;
			}
		}
		}
	}
}