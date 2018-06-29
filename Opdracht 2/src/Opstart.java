//Opstartklasse
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Opstart extends JFrame {
	public static void main(String [] args) {
		JFrame frame = new Opstart();
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Boek");
		JPanel paneel = new gegevens();
		frame.setContentPane(paneel);
		frame.setVisible(true);
	}

}
