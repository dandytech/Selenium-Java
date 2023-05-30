package javaOOPBasic;

public class ConstructorPract {
	
	//Constructor
	public ConstructorPract()
	{
		int a = 5;
		int b = 10;
		int c= a+b;
		System.out.println("I am a constructor: " + c);
		
	}

	//Parameterized Constructor
	public ConstructorPract(int a, String name)
	{
		System.out.println("I am Parameterized Constructor");
	}
	
	//another method
	public void getData()
	{
		System.out.println("I am a method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoke constructor. All action of the constructor are called
		ConstructorPract con = new ConstructorPract();
		
		//invoke parameterized Constructor, argument must match
		ConstructorPract pCon = new ConstructorPract(3, "Daniel");
	}

}
