import javax.swing.*;
import java.awt.event.*;

public class opstart extends JFrame {
	public static void main(String args[] ) {
		JFrame frame = new opstart();
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("voorbeel");
		JPanel paneel = new gegevens();
		frame.setContentPane(paneel);
		frame.setVisible(true);
	}
}