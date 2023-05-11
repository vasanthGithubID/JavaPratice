import java.util.Scanner;

public class PasswordId 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str =  sc.next();
		  isPassword(str);
		                                     
	}
	

	public  static void isPassword(String str)
	{
		 int numb=0,small=0,big=0,sym=0;
		 
		for(int i = 0 ;i<str.length();i++)
		{
			char c =str.charAt(i);
			if(c>='0'  && c<='9')
			{
				numb++;
			}
			if(c>='A' &&  c<='Z')
			{
				big++;
			}
			if(c>='a' && c <='b')
			{
				small++;
			}
		  if(c=='!' || c =='@'||c=='#' || c =='$'||c=='%' 
					|| c =='%'||c =='^' || c =='&'
					||c=='*' || c =='('|| c==')')
			{
				sym++;
			}
		}
		
		
		if(numb!=0 && big!=0 && small !=0 && sym!=0)
		{
			int length = numb+big+small+sym;
			
			if(length >=6 )
			{
				System.out.println(" password is created");
			}
			else {
				int lengc = 6-length;
				System.out.println(lengc +" should be added ");
			}
		}
		
	    if(numb==0)
		{
			System.out.println("atleas 1 number should be added ");
		}
	    
	 if(big==0)
		{
			System.out.println("atleas 1 big alphabet should be added ");
		}
	    if(small==0)
		{
			System.out.println("atleas 1 small alphabet should be added ");
		}
	   if(sym==0)
		{
			System.out.println("atleas 1 symbol  should be added ");
		}
	}

	
}
