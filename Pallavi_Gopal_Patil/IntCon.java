class IntCon
{
  public static void main(String args[])
{
  long l=30;
  int i=50;
   short s=60;
   byte b=70;
   
   i =(int)l;
   s=(short)i;
   b=(byte)s;
   
     System.out.println("l = "+l);
	  System.out.println("i = "+i);
	   System.out.println("s = "+s);
	    System.out.println("b = "+b);
	}
}