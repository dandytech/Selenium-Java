package javaOOPBasic;

public class superkeyChild extends superkeyParent {

	String name = "Rahuls"; //comment to see it prints all as child variable
	
	public void getStringData()
	{
		System.out.println(name);
		System.out.println(super.name); //call the parent variable
	}
	
	
	public superkeyChild()
	{
		super(); //invoke the parent 
		//System.out.println("I am child Constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		superkeyChild cd = new superkeyChild();
		
		cd.getStringData(); //invoke the method
			
	}

}
