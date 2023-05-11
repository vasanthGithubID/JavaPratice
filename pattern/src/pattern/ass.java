package pattern;


import java.util.Scanner;

public class ass
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int ar[] = new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int count=1;
//		3 3 4 4 4 5 6 6 6 6
	
		int big =0;
		for(int i=0;i<ar.length-1;i++)
		{
			
			if(ar[i]==ar[i+1])
			{
				count++;
			}
			else
			{
				if(count>big)
				{
					big=count;
					count=1;
				}
				
				
			}
		}
		
		
		if(count>big)
		{
			big=count;
		}
		System.out.println(big);
	}

}

