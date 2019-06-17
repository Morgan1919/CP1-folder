
import javax.swing.JFrame;

public class FrameDemo{
	public static void main(String[] args){
		JFrame frame = new JFrame("Frame Demo"); // Creates the title and frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exits or terminates program
		frame.setSize(400, 400); // Sets the width and height

		Shapes r = new Shapes(); // Creating the shapes objective
		frame.add(r); // Adding r to the frame

		frame.setVisible(true); // Shows the frame
	}
}
