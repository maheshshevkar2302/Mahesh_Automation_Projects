package Getter_Setter_Method;

public class Main_Class {
	
	public static void main(String[] args) 
	{
		
		
		
		Class_Student  St1=new Class_Student ();
		
	
		
		St1.setStudentCity("Mahesh");
		
		St1.setStudentName("Yavatmal");
		
	String City=St1.getStudentCity();
	System.out.println(City);
	

	String Address=St1.getStudentName();
	System.out.println(Address);
	
	System.out.println("My name is Mahesh Shevkar");
	
		
	}

}
