//Program for number is even or odd
import java.util.*;
class Evenodd
{
   public static void main(String arg[])
     { 
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Take interger");
		int n=sc.nextInt();
	
		if(n%2==0)
		{
		System.out.println("number is even");
		}else
		{
		System.out.println("number is odd");
		}
	}
}