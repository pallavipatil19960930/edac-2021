import java.util.*;
public class Prog6
{
  public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
	  System.out.println("Input first number:");
	  int a=sc.nextInt();
	  System.out.println("Input second number:");
	  int b=sc.nextInt();
	  int add=a+b;
	  int sub=a-b;
	  int mul=a*b;
	  int div=a/b;
	  int rem=a%b;
	  System.out.println("add:"+add);
	   System.out.println("sub:"+sub);
	    System.out.println("mul:"+mul);
		 System.out.println("div:"+div);
		  System.out.println("rem:"+rem);
    }
}