import java.util.Scanner;

public class isAnagram 
{
	
	
	public static boolean isAnagram(String s1,String s2)
	{
		String temp="";
		for(int i = 0 ;i<s1.length();i++)
		{
			char c = s1.charAt(i);
			if(c!=' ')
			{
			    temp=temp+c;
			}
		}
		
		System.out.println(temp);
		s1=temp;
		
		temp="";
		
		for(int i = 0 ;i<s2.length();i++)
		{
			char c = s2.charAt(i);
			if(c!=' ')
			{
			    temp=temp+c;
			}
		}
		System.out.println(temp);
		s2=temp;
		
		s1.toLowerCase();
		s2.toLowerCase();
		char [] arr1 =  s1.toCharArray();
		char [] arr2 =  s2.toCharArray();
		
		
		
		for(int i =0;i<arr1.length;i++)
		{
			
			for(int j = 1;j<arr1.length;j++)
			{
				
				
				if(arr1[i]>arr1[j])
				{
					char c =arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=c;
						
				}
			}
		}
		
		s1= new String(arr1);
		System.out.println(s1);
		
		for(int i =0;i<arr2.length;i++)
		{
			for(int j = 1;j<arr2.length;j++)
			{
				
				
				if(arr2[i]>arr2[j])
				{
					char c =arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=c;
						
				}
			}
		}
		s2= new String(arr2);
		System.out.println(s2);
		
		
	
		
		for(int i =1;i<arr1.length;i++)
		{
			
			
				if(arr1[i]!=arr2[i])
				{
					return false;
				}
			
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		
	boolean	res =isAnagram(str1, str2);
	
	if(res)
	{
		System.out.println("YES");
		
	}
	else {
		System.out.println("NO");
	}
		
	}

}
