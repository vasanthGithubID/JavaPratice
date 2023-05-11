import java.util.Scanner;

public class countNumber 
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	     iscountofNumber(str);	
	}

	private static void iscountofNumber(String str)
	{ 
		String temp=""; int count=0;int big=1;String bigw="";
		for(int i = 0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c!=' ')
			{
				temp=temp+c;
				count++;
				
			}
			else 
			{
				if(big<count)
				{
					bigw=temp;
				}
				
					temp="";
				    count=0;
                 
							
			}

		}
		System.out.println(bigw);
		
	}
}
