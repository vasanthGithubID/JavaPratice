import java.util.Scanner;

public class QuizProject 
{


	public static void main(String[] args)
	{
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter your user name");
          String name = sc.nextLine();
        
          System.out.println("Enter the password");
         String pw = sc.next();
         String password ="vasanth@12345";
         int corretAnswers=0;
          if(pw.equalsIgnoreCase(password))
          {
        	  System.out.println("here is your question ");
        	  System.out.println("Q 1 - Which of the following is not a keyword in java?");
        	  System.out.println("\r\n"
        	  		+ "A - static\r\n"
        	  		+ "\r\n"
        	  		+ "B - Boolean\r\n"
        	  		+ "\r\n"
        	  		+ "C - void\r\n"
        	  		+ "\r\n"
        	  		+ "d - private");
        	  char q1 = sc.next().charAt(0);
        	  if(q1=='b'||q1=='B')
        	  {
        		  System.out.println("correct");
        		  corretAnswers=corretAnswers+5;
        	  }
        	  else
        	  {
        		  System.out.println("wrong");
        	  }
        	  
        	  
        	  System.out.println("Q 2 - What is the size of float variable?\r\n"
        	  		+ "\r\n"
        	  		+ "A - 8 bit\r\n"
        	  		+ "\r\n"
        	  		+ "B - 16 bit\r\n"
        	  		+ "\r\n"
        	  		+ "C - 32 bit\r\n"
        	  		+ "\r\n"
        	  		+ "D - 64 bit");
        	  char q2 = sc.next().charAt(0);
        	  if(q2=='c'||q2=='C')
        	  {
        		  System.out.println("correct");
        		  corretAnswers=corretAnswers+5;
        	  }
        	  else
        	  {
        		  System.out.println("wrong");
        	  }
        	  
        	  
        	  System.out.println("Q 3 - What is the default value of float variable?\r\n"
        	  		+ "\r\n"
        	  		+ "A - 0.0d\r\n"
        	  		+ "\r\n"
        	  		+ "B - 0.0f\r\n"
        	  		+ "\r\n"
        	  		+ "C - 0\r\n"
        	  		+ "\r\n"
        	  		+ "D - not defined\r\n"
        	  		+ "\r\n"
        	  		+ "");
        	  char q3 = sc.next().charAt(0);
        	  if(q3=='a'||q3=='A')
        	  {
        		  System.out.println("correct");
        		  corretAnswers=corretAnswers+5;
        	  }
        	  else
        	  {
        		  System.out.println("wrong");
        	  }
        	  
        	  System.out.println("Q 4 - What is polymorphism?\r\n"
        	  		+ "\r\n"
        	  		+ "A - Polymorphism is a technique to define different objects of same type.\r\n"
        	  		+ "\r\n"
        	  		+ "B - Polymorphism is the ability of an object to take on many forms.\r\n"
        	  		+ "\r\n"
        	  		+ "C - Polymorphism is a technique to define different methods of same type.\r\n"
        	  		+ "\r\n"
        	  		+ "D - None of the above.\r\n"
        	  		+ "\r\n"
        	  		+ "");
        	  char q4 = sc.next().charAt(0);
        	  if(q4=='c'||q4=='C')
        	  {
        		  System.out.println("correct");
        		  corretAnswers=corretAnswers+5;
        	  }
        	  else
        	  {
        		  System.out.println("wrong");
        	  }
        	  System.out.println("Q 5 - What is class variable?\r\n"
        	  		+ "\r\n"
        	  		+ "A - class variables are static variables within a class but outside any method.\r\n"
        	  		+ "\r\n"
        	  		+ "B - class variables are variables defined inside methods, constructors or blocks.\r\n"
        	  		+ "\r\n"
        	  		+ "C - class variables are variables within a class but outside any method.\r\n"
        	  		+ "\r\n"
        	  		+ "D - None of the above.");
        	  char q5 = sc.next().charAt(0);
        	  if(q5=='a'||q4=='A')
        	  {
        		  System.out.println("correct");
        		  corretAnswers=corretAnswers+5;
        	  }
        	  else
        	  {
        		  System.out.println("wrong");
        	  }
        	  
        	  System.out.println("__________________________Resuts________________________-");
        	  System.out.println("Your Scored  "+ corretAnswers );
        	  if(corretAnswers>=15)
        	  {
        		  System.out.println("your passed");
        		  System.out.println( (corretAnswers/25)*100);
        	  }
        	  else
        	  {
        		  System.out.println("your failed");
        		  System.out.println( (corretAnswers/25)*100);
        	  }
          }
		
	}
	
}
