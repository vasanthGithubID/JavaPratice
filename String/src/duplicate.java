import java.util.Scanner;

public class duplicate 
{
	public static void main(String[] args)
	{
           Scanner sc= new Scanner(System.in);
           String str = sc.next();
           int Co[] =new int[128];
           isDupilcate(str,Co);
           
         
		
	}

	private static void isDupilcate(String str,int[] Co) 
	{
		 for (int i = 0; i < str.length(); i++) 
		 {
			char c = str.charAt(i);
//           System.out.println(c);
			Co[c]++;
			
		}
		 
		 
		 for (int i = 0;i<Co.length;i++) 
		 {
			 if(Co[i]!=0&&Co[i]>=2)
			 {
				 System.out.println((char)i);
			 }
			
		}
		
	}

}
