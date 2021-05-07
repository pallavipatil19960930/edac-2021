//decimal to hexadecimal
import java.util.*;
class Prog20

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
	  binary[index++]=n%16;
	  n=n/16;
	  }
	  for(int i=index-1;i>=0;i--)
	   {
	     System.out.print(binary[i]);
		}
	}
}