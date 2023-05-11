import java.util.Iterator;
import java.util.Scanner;

public class CountLowerCase 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count = isCount(str);
		System.out.println(count);
	}

	private static int isCount(String str)
	{
		int count =0;
		for (int i = 0; i < str.length(); i++) 
		{
			char c= str.charAt(i);
		   if(c>='a'&&c<='z')
		   {
			   count++;
		   }
			
		}
	
		return count;
	}

}
