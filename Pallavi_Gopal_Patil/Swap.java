import java.util.*;
import java.lang.*;

class Swap
{
     public static void main(String args[])
	  {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers");
		int i=sc.nextInt();
		int j=sc.nextInt();
		int temp;

        System.out.println("i:"+i);
		System.out.println("j:"+j);
		
		temp=i;
		i=j;
		j=temp;
		
		System.out.println("After swpping");
       System.out.println("i:"+i);		
		System.out.println("j:"+j);
      }
}