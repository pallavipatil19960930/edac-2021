
public class Exception2 {
	
		public static void main(String args[])
		{
		try{
		   String s=null; //String null pointer exception
		    System.out.println(s.length());
		}catch(NullPointerException e)
		  {
		   System.out.println(e);
		  }
		  System.out.println("Rest of the code");
		  }
		 
}
