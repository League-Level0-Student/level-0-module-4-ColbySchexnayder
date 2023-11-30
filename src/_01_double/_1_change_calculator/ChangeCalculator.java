package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String change = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		double nickels = Double.parseDouble(change);
		int inickels = Integer.parseInt(change);
		// Ask the user how many dimes they have, and convert their answer
		change = JOptionPane.showInputDialog("How many dimes?");
		double dimes = Double.parseDouble(change);
		int idimes = Integer.parseInt(change);
		// Ask the user how many quarters they have, and convert their answer
		change = JOptionPane.showInputDialog("How many quarters");
		double quarters = Double.parseDouble(change);
		int iquarters = Integer.parseInt(change);
		// Calculate how much money the user has.  Hint: Use a double variable 
		double total = (nickels*5 + dimes*10 + quarters*25)/100;
		double intTotal = (double) (inickels*5 + idimes*10 + iquarters*25)/100;
		JOptionPane.showMessageDialog(null, "$"+total + "\n$" + intTotal);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

