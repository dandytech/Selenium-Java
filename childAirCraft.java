package javaOOPBasic;

public class childAirCraft extends ParentAirCraftAbstract{

	@Override
	public void color() {
		System.out.println("Our own color is white");
	}
	
	public static void main (String[] arg) {
		
		ParentAirCraftAbstract air = new childAirCraft(); 
		
		air.engine();
		air.safety();
		air.color();
	}

}
