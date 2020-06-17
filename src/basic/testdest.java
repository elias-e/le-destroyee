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
		
		Delay.msDelay(5000);
		Motor.B.backward();
		Motor.B.setSpeed(30000);
		Motor.C.forward();
		Motor.C.setSpeed(30000);
		
		
		 Attack a = new Attack();
		 a.goOn();
		 
		 Abhauen b = new Abhauen();
		 b.flieh();
		Motor.A.stop();
		
	}
	
}
