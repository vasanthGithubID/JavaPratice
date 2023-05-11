import java.util.Scanner;

public class rEVERSEsTRING
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String res = isReverseByCharArray(str);
		String res1= isReverse(str);
		System.out.println(res1);
		
		}

	private static String isReverse(String str) 
	{
		
		char ch[]=str.toCharArray();
		int i=0,j=ch.length-1;
		while(i<=j)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		str= new String(ch);
		return str;
	}

	private static String isReverseByCharArray(String str) 
{
		String temp="";
		for(int i = str.length()/2;i>=0;i--)
		{
			char c = str.charAt(i);
			temp=temp+c;
		}
		return temp;
	}

}
