import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


//Paneel
public class gegevens extends JPanel {
	private JButton knop;
	private JLabel label;
	Boek Boek=new Boek("De slag om Arnhem", "Antony Reevor", "9789026342479");
	public gegevens(){
//naam aan knop geven en koppelen aan knophandler	
	knop = new JButton("Boek informatie");
	KnopHandler kh = new KnopHandler();
	knop.addActionListener(kh);
	label = new JLabel();
//Knop en label toevoegen	
	add(knop);
	add(label);
	}
//Knophandler een taak geven
	class KnopHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			label.setText(Boek.toString());
			System.out.println(Boek.toString());
		}
	}
}
