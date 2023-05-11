import java.util.Scanner;

public class FristWorldcAP 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		 iscaptial(str);
		
	}

	private static void iscaptial(String str)
	{
		String temp=""; String rt="i love yu";
		for(int i = 0 ;i<str.length();i++)
		{
			char c = str.charAt(i);
			char s = str.charAt(i+1);
			if(c==' '&&s>='a'&&s<='z')
			{
				temp=temp+c;
			}
			else if(c!=' ')
			{
			      	   temp=temp+c;
			
		}
		
					
	}
		System.out.println(temp);	
}
}
