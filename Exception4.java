
public class Exception4 {
	public static void main(String[] args) {  
        try  
        {  
		 String s = "Pallavi";
		 int i=Integer.parseInt(s);
         
        }  
            // Number format exception
        catch(NumberFormatException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  
}
