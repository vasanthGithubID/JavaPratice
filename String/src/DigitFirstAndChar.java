import java.util.Scanner;

public class DigitFirstAndChar 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String res = isDigitChar(str);
		System.out.println(res);
		
	}

	private static String isDigitChar(String str) 
	{
		int dcount =0,wcount=0;
		String digitChar="";
       for (int i = 0; i <str.length(); i++)
       {
    	   
    	   char c = str.charAt(i);
    	   if(c>='0'&&c<='9')
    	   {
    		   dcount++;
    		   digitChar=digitChar+c;
    	   }
    	   
		
	   }
       System.out.println(dcount);
       
       for (int i = 0; i <str.length(); i++)
       {
    	   
    	   char c = str.charAt(i);
    	   if(c>='A'&&c<='Z'||c>='a'&&c<='z')
    	   {
    		   wcount++;
    		   digitChar=digitChar+c;
    	   }
    	   

	   }
       System.out.println(wcount);
       str=new String(digitChar);
		return str;
	}

}
