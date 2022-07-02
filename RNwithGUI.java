import javax.swing.JOptionPane;

public class RNwithGUI {
	public static void main(String[] args) {
		int mynumber = (int)(Math.random()*100);
		int age = Integer.parseInt(JOptionPane.showInputDialog("Guess My Number "));
		while(age>=0) {
			if(mynumber==age) {
				JOptionPane.showMessageDialog(null,"WHOO... HOOO.. CORRECT ANSWER :)");
				return;
			}
			else if (age > mynumber) {
				JOptionPane.showMessageDialog(null,"your number is too large");	
			}
			else {
				JOptionPane.showMessageDialog(null,"your number is too small");
			}
			 age = Integer.parseInt(JOptionPane.showInputDialog("Guess My Number "));	
		} 
		JOptionPane.showMessageDialog(null,"My number was "+mynumber);
		
	}

}
