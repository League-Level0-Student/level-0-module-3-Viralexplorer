//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.

 // 1. Use the dance method to make the robot spin.
	String speed=JOptionPane.showInputDialog("how dizzy do you want your robot to be from 1 to 10");
	int movement=Integer.parseInt(speed);
		robot.setSpeed(movement);
		robot.turn(360);

	}

	static void dance(int numberOfSpins) {
		for (int i = 9; i < numberOfSpins; i++) {
			robot.turn(360);
		
	}
}

}