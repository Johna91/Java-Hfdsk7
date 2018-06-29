import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;




/*initialisatie van elementen*/
public class Bestelling extends JPanel {
	private JButton knop, knop2, knop3, knop4;
	private JLabel label, label2, label3, label4, label5;
	private JTextField text, text2;
	ArrayList<Artikel>  lijst = new ArrayList<Artikel>(); 
	Artikel Boek=new Artikel("Boek1.", 14, 121, 0);
	Artikel Boek2=new Artikel("Boek2.", 14, 121, 0);
	Artikel Boek3=new Artikel("Boek3.", 14, 121, 0);
	public Bestelling(){
/*Knop koppelen aan specifieke knophandler*/
		knop = new JButton("Artikel omschrijving");
		KnopHandler kh = new KnopHandler();
		knop.addActionListener(kh);

		knop2 = new JButton("Verkoopprijs");
		KnopHandler2 kh2 = new KnopHandler2();
		knop2.addActionListener(kh2);

		knop3 = new JButton("Prijs ExBTW");
		KnopHandler3 kh3 = new KnopHandler3();
		knop3.addActionListener(kh3);
		
		knop4 = new JButton("Voeg Boek2 toe");
		KnopHandler4 kh4 = new KnopHandler4();
		knop4.addActionListener(kh4);
		
//label naam aanmaken		
		label = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		label5 = new JLabel();
		
		text = new JTextField(10);
		text2 = new JTextField("€ " + 10);
		
		add(text);
		add(text2);
		add(knop);
		add(knop2);
		add(knop3);
		add(knop4);
		add(label);
		add(label2);
		add(label3);
		add(label4);
		add(label5);

		for (int i=0;i<1;i++) {
			lijst.add(Boek);
			lijst.add(Boek2);
		}
		
		for (Artikel a:lijst) {
			System.out.println(""+a.getOmschrijving());
		}
	}
	//Specifieke knophandler een bepaalde taak geven
	class KnopHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			label.setText(Boek.toString());
			
		}
	}
	class KnopHandler2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			label2.setText(Boek.toString1());
		}

	}
	class KnopHandler3 implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			label3.setText(""+Boek.toString2());
		}
		class KnopHandler4 implements ActionListener
		{
			public void actionPerformed(ActionEvent e) {
				lijst.add(Boek3);
			}

	}
}
	class KnopHandler4 implements ActionListener
		{
			public void actionPerformed(ActionEvent e) {
				String value = text.getText();
				String value2 = text2.getText();
 				label4.setText("Omschrijving: " + value);
 				label5.setText("Verkoopprijs " + value2);
			
	
		}
	}
}


