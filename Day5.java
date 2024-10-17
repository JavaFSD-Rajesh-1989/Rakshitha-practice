// till given y numers print common multiples;
package TapAcademy;

import java.util.Scanner;

public class Day5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int y = scan.nextInt();
		printCommonMultiples(n1,n2,y);

	}

	private static void printCommonMultiples(int n1, int n2,int y) {
		int count=0;
		for(int i=1;count<y;i++)
		{
			if(i%n1==0 && i%n2==0)
			{
				System.out.println(i);
				count++;
			}
		}
		
	}

}




