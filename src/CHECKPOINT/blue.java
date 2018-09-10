package CHECKPOINT;

import java.util.Random;

import javax.swing.JOptionPane;

public class blue {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int i = rand.nextInt(4) + 1;
		
		switch(i) {
		case 1:
			JOptionPane.showMessageDialog(null, "ONE!");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "two?");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "three.");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "four");
			break;
		}
		
	}
	
}
