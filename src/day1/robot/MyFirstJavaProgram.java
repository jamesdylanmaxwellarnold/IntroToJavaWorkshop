package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE

		Robot jeff = new Robot ();	
		
jeff.penDown( );		
jeff.move(100 );
jeff.sparkle();	
jeff.turn(90);	
for (int i = 0; i <360; i++) {
	
	
	jeff.penDown();
	jeff.move(1 );
	jeff.sparkle();	
	jeff.turn(360/360);	
	jeff.setSpeed(10);
	
}	
jeff.turn(90);	
for (int i = 0; i <360; i++) {
	
	
	jeff.penDown();
	jeff.move(1 );
	jeff.sparkle();	
	jeff.turn(360/360);	
	jeff.setSpeed(10);
	jeff.turn(90)
}		
	
	
	}}
