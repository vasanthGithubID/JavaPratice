public class DupciateOFLocalVar 
{
	String s = "vasanth";
//	
	
	void teju()
	{
		String s = "teju";
		System.out.println("teju loves "+s);
		
	}
	
	void navya()
	{
		
		System.out.println("navya loves "+s);
		/// without giving gobal variable we cant use this variable s here 
		
	}
	DupciateOFLocalVar()
	{
		System.out.println("objected is created");
		System.out.println(s);
	}
	
            public static void main(String[] args)
            {
				DupciateOFLocalVar v = new DupciateOFLocalVar();
				v.teju();
				v.navya();
				
			}
}
