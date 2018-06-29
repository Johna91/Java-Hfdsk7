import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



class Rooster extends JPanel {
	
	private JButton knop;
	private JLabel label;
	Tijdstip rooster=new Tijdstip("Maandag", 4);
	public Rooster(){
	
	knop = new JButton("Rooster");
	KnopHandler kh = new KnopHandler();
	knop.addActionListener(kh);
	label = new JLabel();
	
	add(knop);
	add(label);
	}
	class KnopHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			label.setText(rooster.toString());
		}
	}
}

