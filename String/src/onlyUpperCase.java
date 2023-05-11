import java.util.Scanner;

public class onlyUpperCase
{
	
	public static void main(String[] args) 
	{
		
	Scanner sc = new Scanner(System.in);
	String str  = sc.next();
	String res = isupperCase(str);	
	System.out.println(res);
	
	}

	private static String isupperCase(String s) 
	{
		String temp="";
		 for(int i = 0;i<s.length();i++)
		 {
			 char c = s.charAt(i);
			 if(c>='A'&&c<='Z')
			 {
				 temp=temp+c;
			 }
		 }
           s=temp;
		return  s ;
	}

}
