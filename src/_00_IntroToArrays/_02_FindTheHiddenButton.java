package _00_IntroToArrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* Run the FindHiddenButton.jar to see the finished product. */

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	
	//1. create an array of JButtons. Don't initialize it yet.
	ArrayList<JButton> j;
	//2 create an integer variable called hiddenButton
	int hiddenButton;
	Random rand = new Random();
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		String qone = JOptionPane.showInputDialog("Enter a positive number");
		int q1 = Integer.parseInt(qone);
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		j = new ArrayList<JButton>(/*q1*/);
		
		//5. Make a for loop to iterate through the JButton array
		for(int i = 0; i< q1; i++) {
			JButton b = new JButton();
			b.addActionListener(this);
			j.add(b);
			panel.add(b);
		}
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		
		//9 add the panel to the window
		window.add(panel);
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(window.MAXIMIZED_BOTH);
		//11. set the JFrame to visible.
		window.setVisible(true);
		//12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "Find the hidden button. OR ELSE");
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		int rand1 = rand.nextInt(q1);
		hiddenButton = rand1;
		//14. Set the text of the JButton located at hiddenButton to read "ME"
		j.get(hiddenButton).setText("ME");
		//15. Use Thread.sleep(100); to pause the program.
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//16. Set the text of the JButton located at hiddenButton to be blank.
		j.get(hiddenButton).setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
		if(buttonClicked == j.get(hiddenButton)) {
			JOptionPane.showMessageDialog(null, "You won!");
		}else {
			JOptionPane.showMessageDialog(null, "Try again. :( L");
		}
		//18. else tell them to try again
	}
}
