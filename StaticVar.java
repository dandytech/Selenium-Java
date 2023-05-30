package javaOOPBasic;

public class StaticVar {

	String name; //Instance variable, sharable by methods
	String address;
	static String city = "Ikeja"; //class variable, invoke using class name not object
	static int i = 0;
	
	StaticVar(String name, String address) //constructor
	{
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}
	
	public void getAddress()
	{
		System.out.println(name +" "+address+" "+city);
	}
	public static void getCity() //class method, invoke using class name not object
	{
		System.out.println(city);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVar obj = new StaticVar("Daniel", "Ojodu");
		StaticVar obj1 = new StaticVar("Ken", "Berger");
		StaticVar obj2 = new StaticVar("Ada", "Ogba");
		obj.getAddress();
		obj1.getAddress();
		StaticVar.getCity();
		StaticVar.i = 4;
		StaticVar.city = "XYZ";
		
		
	}

}
