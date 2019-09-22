package _00_IntroToArrays;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) throws InterruptedException {

		// 2. create an array of 5 robots.
	//	int rn = 5;
		ArrayList<Robot> r = new ArrayList<Robot>();
		boolean finished = false;
//		int dist = 0;
		Random rand = new Random();
		int rand1 = rand.nextInt(50);
		int angle = 1;
		int winner = new Integer(3);
		long dance = 500;
		
		// 3. use a for loop to initialize the robots.
		String n = JOptionPane.showInputDialog("How many robots do you want?");
		int one = Integer.parseInt(n);
		for (int i = 0; i < one; i++) {
			Robot u = new Robot();
			r.add(u);
		//	dist += 750/one;
			u.setX(450);
			u.setY(500);
			u.setAngle(90);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		while (finished == false) {
			for (int i = 0; i < one; i++) {
				if(finished == false) {
					rand1 = rand.nextInt(50);
				for(int k = 0; k < rand1; k++) {
					System.out.println(r.get(i).getX() + ", "+r.get(i).getY());
					r.get(i).move(3);
					r.get(i).turn(-1);
					if (r.get(i).getX() == 450 && r.get(i).getY() == 500) {
						finished = true;
						JOptionPane.showMessageDialog(null, "Robot " + (i+1) + " has won!");
						winner = i;
					}
				}
				
				
				}
				
			}
		}

		r.get(winner).setX(500);
		r.get(winner).setY(300);
		for(int i = 0; i <999999; i++) {
			r.get(winner).setAngle(45);
			Thread.sleep(500);
			r.get(winner).setAngle(135);
			Thread.sleep(500);
			r.get(winner).setAngle(225);
			Thread.sleep(500);
			r.get(winner).setAngle(315);
			Thread.sleep(500);
		}
		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
		
	}
}
