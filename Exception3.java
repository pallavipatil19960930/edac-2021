
public class Exception3 {
	 
	 public static void main(String args[])
	 {
	 try{
	   int arr[]= new int[5]; //Array index out of bound exception
	    arr[50]=12;
	 }catch(ArrayIndexOutOfBoundsException e)
	   {
	    System.out.println(e);
	   }
	   System.out.println("Rest of the code");
	   }
	  
}
