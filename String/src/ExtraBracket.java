import java.util.Scanner;

public class ExtraBracket 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String str = isBracketVaild(s);
		System.out.println(str);
		
	}

	private static String isBracketVaild(String s) 
	{
		char ch[]=s.toCharArray();
		int open=0,close=0;
		char c =' ';
		for(int i =0 ;i<ch.length;i++)
		{
			if(ch[i]=='(')
			{
				open++;
			}
			else if(ch[i]==')'&&open>=1)
			{
			    open--;	
			}
			else if(ch[i]==')'&&open<=0)
			{
			    ch[i]=c;	
			}
				
		}
		
		
		for(int i =ch.length-1 ;i>=0;i--)
		{
			if(ch[i]==')')
			{
				close++;
			}
			else if(ch[i]=='('&&close>=1)
			{
			    close--;	
			}
			else if(ch[i]=='('&&close<=0)
			{
			    ch[i]=c;	
			}
				
		}
	         s = new String(ch);
		return s;
	}

}
