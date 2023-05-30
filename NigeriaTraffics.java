package javaOOPBasic;

public class NigeriaTraffics implements CentralTrafficInterface {

	@Override
	public void greenGo() {
		System.out.println("Go");
	}

	@Override
	public void redStop() {
		System.out.println("Stop");
	}

	@Override
	public void flashYellowWait() {
		System.out.println("Wait");
	}

	//Added new method of the class
	public void nigNewTraffic(){
		System.out.println("New Nigeria Traffic");
	}
	
	
	public static void main(String[] args) {

		NigeriaTraffics nig = new NigeriaTraffics(); //instatiate the object of the interface

		NigeriaTraffics nigNew = new NigeriaTraffics(); //instatiate the object of the class
		
		nig.greenGo();
		nig.redStop();
		nig.flashYellowWait();
		nigNew.nigNewTraffic();;

	}
}
