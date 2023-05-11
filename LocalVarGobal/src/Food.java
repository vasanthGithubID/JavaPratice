
public class Food 
{
	String food = "briyani";
	String food1 = "kabab";  //gobal variable
	
	void ablock()
	{
		
		System.out.println("cse block");
		String food ="veg briyani";
		String food1=" veg kabab";   //local variable
		
		System.out.println(food);
		System.out.println(food1);
		System.out.println(this.food);
	}
	void cblock()
	{
		System.out.println(" mech block ");
		System.out.println(food);
		System.out.println(food1);
	}
	public static void main(String[] args) 
	{
		Food f = new Food();
		f.ablock();
		f.cblock();
		
	}

}
