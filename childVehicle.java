package javaOOPBasic;

public class childVehicle extends ParentVehicleInheritance{
	
	public void newEngine() {
		
		//childVehicle col = new childVehicle();
		
		System.out.println("New Engine color: " + color);
		
		//System.out.println("New Engine color: " + col.color);
		
	}

	public static void main(String[] args) {
		
		childVehicle veh = new childVehicle();
		veh.Gear();
		veh.Break();
		veh.AudioSystem();
		
		veh.newEngine(); //class invoke its own method that inherited/used variable from parent class
	}

}
