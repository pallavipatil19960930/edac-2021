/*1)WAP to demonstrate (2.45pm to 3.30)
a)class, object
b)array of object
c)different method
d)constructor
e)constructor /method overloading
f)static variable, method
*/
class Student{  
 public int id;  
 public String name;  
 public void setData(int id, String name)
	{
	 this.id=id;
	 this.name=name;
	 
	}  
public void display()
	{
		System.out.println("Student Id is: "+id+" "+"Student name is: "+name);
		System.out.println();
	}
}
class TestStudent{  
 public static void main(String args[]){  
    Student arr[]=new Student[2];
	
	arr[0]=new Student();
	arr[1]=new Student();
	
	
	arr[0].setData(101,"Pallavi");
	arr[1].setData(102,"Payal");
	
	
	arr[0].display();
    arr[1].display();
  
  /*Test s1=new Test();   //Creating objects 
  Test s2=new Test();  
  
  s1.id=101;  //Initializing objects  
  s1.name="Pallavi";  
  s2.id=102;  
  s2.name="Payal";  
 
  System.out.println(s1.id+" "+s1.name);  
  System.out.println(s2.id+" "+s2.name);  
  */
 }  
}  