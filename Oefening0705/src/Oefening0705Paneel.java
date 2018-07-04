import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Oefening0705Paneel extends JPanel{







	private JButton printButton;
	private JLabel naamLeerling, cijfers, vakRekenen, vakNederlands, vakWebdev, rapportNaam, rapportCijfers,
	rapportRekenen, rapportNederlands, rapportWebdev;
	private JTextField naamLeerlingVak, vakRekenenVak, vakNederlandsVak, vakWebdevVak ;
	private int nummer1 = 0, nummer2 = 0;

	public Oefening0705Paneel () {

		setLayout( null );
		
		printButton = new JButton("Print rapport");;
		
		naamLeerling = new JLabel(" Naam leerling: ");
		cijfers = new JLabel("Cijfers");
		vakRekenen = new JLabel(" Rekenen: ");
		vakNederlands = new JLabel(" Nederlands: ");
		vakWebdev = new JLabel(" Webdevelopment: ");
		
		naamLeerlingVak = new JTextField( 10 );
		vakRekenenVak = new JTextField( 10 );
		vakNederlandsVak = new JTextField( 10 );
		vakWebdevVak = new JTextField( 10 );
		
		
		naamLeerling.setBounds(20, 20, 100, 20);
		naamLeerlingVak.setBounds(350, 20, 200, 20);
		cijfers.setBounds(20, 70, 100, 20);
		
		vakRekenen.setBounds(20, 110, 100, 20);
		vakNederlands.setBounds(20, 150, 100, 20);
		vakWebdev.setBounds(20, 190, 120, 20);
		
		vakRekenenVak.setBounds(450, 110, 100, 20);
		vakNederlandsVak.setBounds(450, 150, 100, 20);
		vakWebdevVak.setBounds(450, 190, 100, 20);
		
		printButton.setBounds(350, 240, 150, 40);

		add( naamLeerling );
		add( naamLeerlingVak );
		add( cijfers );
		add( vakRekenen );
		add( vakNederlands );
		add( vakWebdev );

		add( vakRekenenVak );	
		add( vakNederlandsVak );	
		add( vakWebdevVak );
		
		add( printButton );
		
//		Print rapport
		
		rapportNaam = new JLabel("");
		rapportCijfers = new JLabel("");
		rapportRekenen = new JLabel("");
		rapportNederlands = new JLabel("");
		rapportWebdev = new JLabel("");
		
		rapportNaam.setBounds(50, 350, 250, 20);
		rapportCijfers.setBounds(70, 400, 120, 20);
		rapportRekenen.setBounds(70, 430, 120, 20);
		rapportNederlands.setBounds(70, 460, 120, 20);
		rapportWebdev.setBounds(70, 490, 120, 20);
		
		add( rapportNaam );
		add( rapportCijfers );
		add( rapportRekenen );
		add( rapportNederlands );
		add( rapportWebdev );
		
		
		printButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rapportNaam.setText("Naam: " + naamLeerlingVak.getText());
				rapportCijfers.setText("Cijfers:");
				rapportRekenen.setText("Rekenen: " + vakRekenenVak.getText()); 
				rapportNederlands.setText("Nederlands: " + vakNederlandsVak.getText()); 
				rapportWebdev.setText("Webdevelopment: " + vakWebdevVak.getText()); 
				
				
			}
		});
	}
}


