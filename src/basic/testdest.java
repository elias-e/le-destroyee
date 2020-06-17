package basic;

import lejos.hardware.Button;
import lejos.hardware.Key;
import lejos.hardware.KeyListener;
import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.Motor;
import lejos.utility.Delay;

public class testdest {

	public static void main(String[] args) {
		
		Button.RIGHT.addKeyListener(new KeyListener() {
			
			@Override
			public void keyReleased(Key k) {
				// TODO Auto-generated method stub
				LCD.clear();
				System.exit(0);
				
			}
			
			@Override
			public void keyPressed(Key k) {
				// TODO Auto-generated method stub
				
			}
		});
		

		
			for(int j=0; j<10; j++) {
		Delay.msDelay(5000);
		Motor.B.setSpeed(300);
		Motor.B.forward();
		Motor.C.setSpeed(300);
		Motor.C.forward();
		
		for(int k=0; k<100; k++) {
			Delay.msDelay(5000);
			Motor.B.setSpeed(300);
			Motor.B.backward();
			Motor.C.setSpeed(300);
			Motor.C.forward();
		}
		
			}
			for(int i=0; i<4; i++) {
		Motor.A.setSpeed(300);
		Motor.A.forward();
			}
		
		 //Attack a = new Attack();
		 //a.goOn();
		 
		 //Abhauen b = new Abhauen();
		 //b.flieh();
		//Motor.A.stop();
		
	}
	
}
