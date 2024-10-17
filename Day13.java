//largest repeating element

package TapAcademy;

import java.util.Scanner;

public class Day13 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int res=repeatingElement(ar);
		System.out.println(res);
	}

	private static int repeatingElement(int[] ar) {
		int maxRepeatingElement=-1;
		int maxRepeatingCount=0;
		
		int currentElement=ar[0];
		int count=1;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==currentElement)
			{
				count++;
			}
			else
			{
				if(count>=maxRepeatingElement)
				{
					maxRepeatingElement=currentElement;
					maxRepeatingCount=count;
				}
				currentElement=ar[i];
				count=1;
			}
		}
		if(count>=maxRepeatingCount)
		{
			maxRepeatingElement=currentElement;
		}
		return maxRepeatingElement;
	}
}
