import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



class gegevens extends JPanel {
	
	private JButton knop;
	private JLabel label;
	Persoon rooster=new Persoon("Johannes de Ruiter", "04-07-2000");
	public gegevens(){
	
	knop = new JButton("Persoon");
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

