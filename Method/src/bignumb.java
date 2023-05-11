
public class bignumb 
{
   static	void biggestnumb(int x, int y,int z)
	{ 
		int big =x;
		if( y>big)
		{
			big = y;
		}
		if( z>big)
		{
			big=z;
		}
		
		System.out.println(big);
	}
	public static void main(String[] args)
	{
		
		biggestnumb(25,35,45);
	}

}
