import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Oefening0704Paneel extends JPanel{







	private JButton button, button1, button2, button3, standButton;
	private JLabel label, label2, standLabel;
	private int nummer1 = 0, nummer2 = 0;

	public Oefening0704Paneel () {

		setLayout( null );



		button = new JButton("+1");
		button1 = new JButton("-1");
		button2 = new JButton("+1");
		button3 = new JButton("-1");
		standButton = new JButton("Stand");
		label = new JLabel(" Team 1: ");
		label2 = new JLabel(" Team 2: ");
		standLabel = new JLabel(" De stand is: ");

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nummer1++;
				label.setText(" Teller: " + nummer1);
			}
		});

		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nummer1--;
				label.setText(" Teller: " + nummer1);
			}
		});
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nummer2++;
				label2.setText(" Teller: " + nummer2);
			}
		});
		
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nummer2--;
				label2.setText(" Teller: " + nummer2);
			}
		});
		
		standButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				standLabel.setText(" De stand is: " + nummer1 + " tegen " + nummer2);
			}
		});






		label.setBounds(20, 20, 100, 20);
		button.setBounds(20, 50, 100, 30);
		button1.setBounds(20,100, 100, 30);
		label2.setBounds(320, 20, 100, 20);
		button2.setBounds(320,50, 100, 30);
		button3.setBounds(320,100, 100, 30);
		standLabel.setBounds(170, 200, 150, 20);
		standButton.setBounds(20, 200, 100, 30);
		
		add(label);
		add(label2);
		add(button);
		add(button1);
		add(button2);
		add(button3);
		add(standLabel);
		add(standButton);



	}

	

	

}


