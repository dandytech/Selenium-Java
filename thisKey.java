package javaOOPBasic;

public class thisKey {

	int a = 2;
	
	public void getData()
	{
		int a = 3;
		
		//sum global and local variables
		int b = a + this.a;
		
		System.out.println(b);
		System.out.println(this.a); //prints global variable
		System.out.println(a); //prints local variable
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisKey tk = new thisKey();
		tk.getData();

	}

}
