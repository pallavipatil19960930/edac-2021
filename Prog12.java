import java.util.*;
class Prog12
{
  public static void main(String args[])
   {
     int a,b,c;
	 Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the numbers:");
	  a= sc.nextInt();
	   b= sc.nextInt();
	    c= sc.nextInt();
		int avg = (a+b+c)/3;
		System.out.println("Average"+avg);
	}
}