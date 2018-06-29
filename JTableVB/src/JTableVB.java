import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class JTableVB extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String args[]) {
		JFrame frame = new JTableVB();
		frame.setSize(1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("JTabeleApp");
		JPanel DBpaneel = new JTableVBAppPaneel();
		frame.setContentPane(DBpaneel);
		frame.setVisible(true);
		BufferedImage image = null;

		try {
			image = ImageIO.read(frame.getClass().getResource("images/mario.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		frame.setIconImage(image);
	}

}
