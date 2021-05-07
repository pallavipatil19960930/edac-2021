import java.util.*;
class Prog13
{
  public static void main(String args[])
  {
       float w,h;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter width");
	   w=sc.nextFloat();
	   
	   System.out.println("Enter height");
	   h=sc.nextFloat();
	   
	   float area=w*h;
	   float perimeter=2*(w+h);
	   
	   System.out.println("Area:"+area);
	   System.out.println("Perimeter:"+perimeter);
	 }
}