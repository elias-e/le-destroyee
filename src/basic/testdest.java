package basic;

import lejos.hardware.motor.Motor;
import lejos.robotics.EncoderMotor;
import lejos.utility.Delay;

public class testdest {

	public static void main(String[] args) {
		
		Delay.msDelay(5000);
		Motor.B.forward();
		Motor.B.setSpeed(1);
		Motor.C.forward();
		Motor.C.setSpeed(1);
		
		
		 Attack a = new Attack();
		 a.goOn();
		 
		 Abhauen b = new Abhauen();
		 b.flieh();
	}
	
}
