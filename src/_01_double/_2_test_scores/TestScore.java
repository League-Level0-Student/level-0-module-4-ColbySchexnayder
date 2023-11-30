package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScore {
	public static void main(String[] args) {
		
		String sTestScore = JOptionPane.showInputDialog("What is your test score?");
		double testScore = Double.parseDouble(sTestScore);
		
		if (testScore >= 5) {
			JOptionPane.showMessageDialog(null, "Perfect!");
		}
		else if (testScore > 4.9) {
			JOptionPane.showMessageDialog(null, "Almost perfect!");
		}
		else if (testScore > 4) {
			JOptionPane.showMessageDialog(null, "Nicely done!");
		}
		else if (testScore > 3) {
			JOptionPane.showMessageDialog(null, "Alright!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Study more");
		}
	}
}
