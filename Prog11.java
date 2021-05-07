import java.util.*;
class Prog11
{
 public static void main(String args[])
 { 
    double r;
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter radius=");
	r=sc.nextDouble();
	 
	 double perimeter=2*3.14d*r;
	 double area=3.14d*r*r;
	 
	 System.out.println("Perimeter of circle is:"+perimeter);
	 System.out.println("Area="+area);
 }
}
		