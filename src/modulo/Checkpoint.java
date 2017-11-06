package modulo;

import javax.swing.JOptionPane;
import java.util.Random;
public class Checkpoint {
	public static void main(String[] args) {
		 String color=JOptionPane.showInputDialog("what is your favortie color");
	JOptionPane.showMessageDialog(null,color+" is my favortie color");
		
Random something = new Random();
	int randomNumber=something.nextInt();
	JOptionPane.showMessageDialog(null, randomNumber );
		
		
	}
}
