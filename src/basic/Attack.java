package basic;

import lejos.hardware.motor.Motor;

public class Attack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Attack() {
		
		
		
	}
	
	public void goOn() {
		for(int j=0; j<40; j++) {
			
		Motor.A.forward();
		Motor.A.setSpeed(5);
		Motor.B.forward();
		Motor.B.setSpeed(20);
		Motor.C.forward();
		Motor.C.setSpeed(20);
	}

}
}
