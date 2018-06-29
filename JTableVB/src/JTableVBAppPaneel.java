import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;

public class JTableVBAppPaneel extends JPanel {

	private static final long serialVersionUID = 1L;
	private String[][] data;
	private JTable tabel;
	private JButton knop, knop2, knop3;
	public int index;
	public long end;
	public long start;
	private String kolomNamen[];
	public JTextField uitvoerVak;
	private JScrollPane scrollVenster;

	public JTableVBAppPaneel() {
		setLayout(new BorderLayout());
		Random random = new Random();

		kolomNamen = new String[10];
		for (int index = 0; index < kolomNamen.length; index++) {
			kolomNamen[index] = "Kolom " + index;
		}
		// Random
		data = new String[10000][10]; // 100.000 rijen, 10 kolommen

		for (int index = 0; index < data.length; index++) {
			for (int kolommen = 0; kolommen < 10; kolommen++) {
				data[index][kolommen] = String.valueOf(1 + random.nextInt(10000));
			}
		}

		knop = new JButton("Klik Bogo");
		knop.addActionListener(new BogoSort());

		knop2 = new JButton("Klik Bubble");
		knop2.addActionListener(new BubbleSort());

		knop3 = new JButton("Klik Quick");
		knop3.addActionListener(new QuickSort());

		uitvoerVak = new JTextField();

		tabel = new JTable(data, kolomNamen);

		TableColumn column = null;
		for (int i = 0; i < 10; i++) {
			column = tabel.getColumnModel().getColumn(i);
			column.setPreferredWidth(150);
		}

		scrollVenster = new JScrollPane(tabel);
		scrollVenster.setBounds(100, 50, 800, 600);
		scrollVenster.setHorizontalScrollBar(new JScrollBar());
		tabel.setFillsViewportHeight(true);
		add(scrollVenster, BorderLayout.CENTER);
		add(knop2, BorderLayout.NORTH);
		add(uitvoerVak, BorderLayout.SOUTH);
	}

	class BogoSort implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int[] getallen = new int[100000];
			int teller = 0;
			// begin met ongesorteerd array
			for (int i = 0; i < 10000; i++) {
				for (int kollomen = 0; kollomen < 10; kollomen++) {
					getallen[teller] = Integer.parseInt(data[i][kollomen]);
					teller++;
				}
			}
			for (int t = getallen.length - 5; t < getallen.length; t++) {

				System.out.println(getallen[t]);
			}

			long t4 = new Date().getTime();
			Arrays.sort(getallen);
			long t5 = new Date().getTime();
			uitvoerVak.setText("Tijd = " + (t5 - t4) + " ms");

			teller = 0;
			for (int index = 0; index < 10000; index++) {
				for (int k = 0; k < 10; k++) {
					tabel.setValueAt(String.valueOf(getallen[teller]), index, k);
					teller++;
				}
			}
		}
	}

	class BubbleSort implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int[] getallen = new int[100000];
			int teller = 0;
			// begin met ongesorteerd array
			for (int i = 0; i < 10000; i++) {
				for (int kollomen = 0; kollomen < 10; kollomen++) {
					getallen[teller] = Integer.parseInt(data[i][kollomen]);
					teller++;
				}
			}

			int n = getallen.length;
			int temp = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 1; j < (n - i); j++) {
					if (getallen[j - 1] > getallen[j]) {
						temp = getallen[j - 1];
						getallen[j - 1] = getallen[j];
						getallen[j] = temp;
					}
				}
			}

			long t4 = new Date().getTime();
			Arrays.sort(getallen);
			long t5 = new Date().getTime();
			uitvoerVak.setText("Tijd = " + (t5 - t4) + " ms");

			teller = 0;
			for (int index = 0; index < 10000; index++) {
				for (int k = 0; k < 10; k++) {
					tabel.setValueAt(String.valueOf(getallen[teller]), index, k);
					teller++;
				}
			}
		}
	}

	class QuickSort implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int[] getallen = new int[100000];
			int low = 0;
			int high = getallen.length - 1;

			if (getallen == null || getallen.length == 0) {
				return;
			}

			if (low >= high) {
				return;
			}

			int middle = low + (high - low) / 2;
			int pivot = getallen[middle];

			int i = low, j = high;
			while (i <= j) {
				while (getallen[i] < pivot) {
					i++;
				}

				while (getallen[j] > pivot) {
					j--;
				}

				if (i <= j) {
					int temp = getallen[i];
					getallen[i] = getallen[j];
					getallen[j] = temp;
					i++;
					j--;
				}
			}

			long t4 = new Date().getTime();
			Arrays.sort(getallen);
			long t5 = new Date().getTime();
			uitvoerVak.setText("Tijd = " + (t5 - t4) + " ms");
		}
	}
}