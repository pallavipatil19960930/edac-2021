import java.util.Scanner;
class Prog2
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the 2 intergers");
	  int i=sc.nextInt();
	  int j=sc.nextInt();
	  int k=i+j;
	  
	  System.out.println("Addition:"+k);
	}
}