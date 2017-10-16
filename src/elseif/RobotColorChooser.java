
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
 Robot viral=new Robot("mini");
	//3. ask the user what color they would like the robot to draw
for (int i = 0; i <20; i++) {
	
	
 String color= JOptionPane.showInputDialog("what color do you want");
if (color.equals("red")){
	viral.setPenColor(Color.RED);
	
	}


	if (color.equals("blue")){
		viral.setPenColor(Color.BLUE);
	}
	
	if(color.equals("green")){
		viral.setPenColor(Color.GREEN);
	}
	if(color.equals("")){
		viral.setRandomPenColor();
	}
	

		//4. use an if/else statement to set the pen color that the user requested

        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	    //1. make the robot draw a shape (this will take more than one line of code)
       
        viral.penDown();
       
        viral.setPenWidth(10);
        viral.setSpeed(10);
        for (int i1 = 0; i1 < 4; i1++) {
			
		viral.turn(90);
        viral.move(900);
        
	
        }
}
}
}