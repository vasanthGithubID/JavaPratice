package tejuChintu;
public class Pen
{
  String   brand;
   int  price;
   String  color="black";
   
   
   void results()
   {
	   System.out.println(this.brand+" "+this.price+ " "+this.color);
   }
  
   
   public static void main(String [] args)
    {
     Pen p1 = new Pen();
      p1.brand="123";
      p1.price=130;
      Pen p2 = new Pen();
      p2.brand= "reyonds";
      p2.price = 150;
      Pen p3 = new Pen();
      p3.brand= "natraja";
      p3.price = 180;
      p1.results();
      p2.results();
      p3.results();


    }
}

