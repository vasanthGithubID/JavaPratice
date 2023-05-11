import java.util.Scanner;

public class startsWithPAR 
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char parChar = sc.next().charAt(0);
		isStartWithPar(str,parChar);
	}

	private static void isStartWithPar(String str,char c) 
	{      String temp="";
	       
	       for(int i =0;i<str.length();i++)
	       {
	    	   char ch = str.charAt(i);
	    	   if(ch!=' ')
	    	   {
	    		   temp=temp+ch;
	    	   }
	    	   else {
	    		   char q=temp.charAt(0);
	    		   if(q==c)
	    		   {
	    			   System.out.println(temp);
	    		   }
	    		  
	    		   temp="";
	    	   }
	    		   
	       }
	       
	       
	       
	}

}
