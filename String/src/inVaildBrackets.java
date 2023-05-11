import java.util.Scanner;

public class inVaildBrackets 
{
      public static void main(String[] args) 
      {
    	  Scanner sc = new Scanner(System.in);
    	  String str = sc.next();
    	  boolean res = isVaild(str);
    	  System.out.println(res);
		
	}

	private static boolean isVaild(String str)
	{
		int count = 0; int brac=0;  int brack=0;
		
		for (int i = 0; i < str.length(); i++)
		{
               char c = str.charAt(i);
               if(c=='(')
               {
            	   brac++;
               }
               else if(c==')'&&brac<=0)
               {
            	   count++;
               }
               else if(c ==')'&&brac>=1)
               {
            	brac--;   
               }
               
               
               if(c=='[')
               {
            	   brack++;
               }
               else if(c==')'&&brack<=0)
               {
            	   count++;
               }
               else if(c ==')'&&brack>=1)
               {
            	brack--;   
               }
		}
		
		if(brac==0&&brack==0)
		{
			return true;
		}
		
		
		return false;
	}
}
