package pattern;

import java.util.Scanner;

public class Ptr1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=1;
		for(int i = 1;i<=n;i++)
		{
			for(int k =1;k<=n-i;k++)
			{
				System.out.print(" ");
				
			}
			for(int j = 1;j<=i;j++)
			{
				
				if(count%2==0)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
				count++;
				
			}
			System.out.println();
		}
		
	}

}
