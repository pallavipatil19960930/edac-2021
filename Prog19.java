//decimal to binary
import java.util.*;
class Prog19

{
  public static void main(String args[])
   {
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter decimal number");
	   int n=sc.nextInt();
     int binary[] =  new int[20];
	 int index=0;
	
	 while(n>0)
	 {
	  binary[index++]=n%2;
	  n=n/2;
	  }
	  for(int i=index-1;i>=0;i--)
	   {
	     System.out.print(binary[i]);
		}
	}
}