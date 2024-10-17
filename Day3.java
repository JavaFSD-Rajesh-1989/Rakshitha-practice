
//prime
//package TapAcademy;
//
//import java.util.Scanner;
//
//public class Day3 {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n=scan.nextInt();
//		String result=isPrime(n);
//		System.out.println(result);
//	}
//
//	private static String isPrime(int n) {
//		for(int i=2;i*i<=n;i++)
//		{
//			if(n%i==0)
//			{
//				return "Not Prime";
//			}
//		}
//		return "Prime";
//	}
//
//}



//or


package TapAcademy;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		if(isPrime(n))
		{
		System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}

	private static boolean isPrime(int n) {
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

}