package obj;
public class Biker
{
	String name;
	int age;
	String place ;
	
	
	 public static void main(String[] args) 
	 {
		 Biker salam =  new Biker();
		 salam.name="salamkhan";
		 salam.age=34;
		 salam.place="sri lanka ";
		 
		 Biker vasanth = new Biker();
		 vasanth.name="vasanth kumar S";
		 vasanth.age=23;
		 vasanth.place="usa";
		 
		 Biker navya = new Biker();
		 navya.age=24;
		 navya.name="rrr";
		 navya.place="bangalore";
		 
		 
		 System.out.println(salam.age+salam.name+salam.place);
		 System.out.println(vasanth.age+vasanth.name+vasanth.place);
		 System.out.println(navya.age+navya.name+navya.place);
	}

}
