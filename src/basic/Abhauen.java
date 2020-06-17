package basic;

import lejos.hardware.motor.Motor;

public class Abhauen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Abhauen() {
		
		
		
	}
	
	public void flieh() {
		for(int i=0; i<1000000; i++) {
		Motor.A.setSpeed(20);
		Motor.A.forward();
		Motor.B.backward();
		Motor.C.forward();
		Motor.A.backward();
	}

}
	
}