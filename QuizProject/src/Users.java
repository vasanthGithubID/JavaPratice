import java.util.ArrayList;

public class Users 
{
     String name;
     String password;
     
     @Override
   public String toString() {
    	  
  	  if(this.name=="vasanth"&&this.password=="Vasanth@12345")
	  {
    		  return "yes";
  	  }
  	  
 	return "no";
   }
     
      public static void main(String[] args) 
      {
    	  ArrayList quiz = new ArrayList();
    	  Users u1 = new Users("vasanth","Vasanth@12345");
    	  Users u2 = new Users("teju","teju.0@12345");
    	
    	  quiz.add(u1);
    	  quiz.add(u2);
    	  
    
    
    	
		
	}

	public Users(String name, String password) 
	{
		super();
		this.name = name;
		this.password = password;
	}
	
	
	public void vasanth()
	{
		System.out.println("hello vasanth");
	}
	
}
