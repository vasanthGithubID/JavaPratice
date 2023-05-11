import java.util.Scanner;

public class SpaceBetweenWord 
{
	
	static int count(String str)
	{ 
		int co =0;
		for(int i =0;i<str.length();i++)
		{   
			
			char c = str.charAt(i);
		    if(c==' ')
		    {
		    	
		    	co++;
		    }
		}
		return  co;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int res = count(str);
		
		System.out.println(res);
		
		
	}

}
