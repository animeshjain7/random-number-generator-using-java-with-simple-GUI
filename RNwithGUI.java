import javax.swing.JOptionPane;

public class RNwithGUI {
	public static void main(String[] args) {
//		int mynumber = (int)(Math.random()*100);
//		int age = Integer.parseInt(JOptionPane.showInputDialog("guess my number 1"));
//		do {
//			//System.out.println("Guess my number(1-100) : ");
//			// age = Integer.parseInt(JOptionPane.showInputDialog(""));
//			
//			// usernumber = s.nextInt();
//			if(mynumber==age) {
//				//System.out.println("------Great Right Choice------");
//				JOptionPane.showMessageDialog(null,"right----");
//				break;
//				
//			}
//			else if (age > mynumber) {
//				JOptionPane.showMessageDialog(null,"your number is too large");
//				
//			}
//			else {
//				JOptionPane.showMessageDialog(null,"your number is too small");
//			}
//			 age = Integer.parseInt(JOptionPane.showInputDialog("guess my number 2"));
//				
//		} while(age>=0);
//		JOptionPane.showMessageDialog(null,"my number was "+mynumber);
//		
		
		
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
