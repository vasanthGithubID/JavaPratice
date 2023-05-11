import java.util.Scanner;

public class FristChar 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		isFirstChar(str);
	}

	private static void isFirstChar(String str)
	{
		       str=" "+str;
		       char ch[]=str.toCharArray();
		       
               for(int i = 0;i<ch.length-1;i++)
               {
            	  
                    if(ch[i]==' '&&ch[i+1]!=' ')
            	   {
            		   	System.out.println(ch[i+1]+" "+ch[i+2]);
            		   	
            	   }
               }
            		   
            		   
	}

}