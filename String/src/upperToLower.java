import java.util.Scanner;

public class upperToLower {

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String res = isUpperToLower(str);
		System.out.println(res);
		
	}

	private static String isUpperToLower(String str)
	{
		String temp = "";
		for (int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			
			if(c>='A'&&c<='Z')
			{
				c=(char)(c+32);
			     temp=temp+c;
			}
			else if(c>='a'&&c<='z')
			{
				c=(char)(c-32);
			     temp=temp+c;
			}
			else {
				temp=temp+c;
			}
			
		}
		return temp;
	}
}
