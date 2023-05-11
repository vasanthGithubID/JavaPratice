package tejuChintu;
public class Family{
char Gender ;
String Name;
int age;
boolean married;
public static void main(String[] args)

{	Family p1 = new Family();
	p1.Gender='M';
	p1.Name="vasanth kumar";
	p1.age=24;
	p1.married=false;
		
	   Family p2 = new Family();
	   p2.Gender='F';
	   p2.Name="Teju";
	   p2.age=22;
	   p2.married=false;
		
	   
	   System.out.println(p1.Gender+" "+p1.Name+" "+p1.age+" "+p1.married);
	   System.out.println(p2.Gender+" "+p2.Name+" "+p2.age+" "+p2.married);
	}
}
