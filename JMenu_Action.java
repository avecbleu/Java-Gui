import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class JMenu_Action implements ActionListener {
	static JMenuItem verzeichnisOeffnen;
	JLabel labName;

	public  JMenu_Action() {
		/* Erzeugung eines neuen Dialoges */

		JDialog mJDialog = new JDialog();
		mJDialog.setTitle("Menü-Beispiel");
		mJDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		mJDialog.setSize(450, 300);

		// Border wied erstellt
		Border bo = new LineBorder(Color.CYAN);

		// Erstellen der Men�leiste
		JMenuBar barm = new JMenuBar();
		barm.setBorder(bo);
		// Erzeugung eines Objektes der Klasse JMenu
		JMenu menu = new JMenu(" Verzeichnis");
		// Erzeugung eines Objektes der Klasse JMenuItem
		verzeichnisOeffnen = new JMenuItem(" öffnen");
		// Wir fügen das JMenuItem unserem JMenu hinzu
		menu.add(verzeichnisOeffnen);
		verzeichnisOeffnen.addActionListener(this);
		// Menü wird der Menüleiste hinzugefügt
		barm.add(menu);
		// Menüleiste wird für den Dialog gesetzt
		mJDialog.setJMenuBar(barm);

		mJDialog.setVisible(true);

	}

	public static void main(String[] args) {

		 new JMenu_Action();

	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		if (ev.getSource() == verzeichnisOeffnen) {
			JFileChooser auswahl = new JFileChooser("D:\\Schulung\\Test");
			if (auswahl.showOpenDialog(auswahl) == JFileChooser.APPROVE_OPTION) {
				String name =(auswahl.getSelectedFile().getName());
				System.out.println("Gewählte Datei "+ name);
			}
			else  if(auswahl.showOpenDialog(auswahl) == JFileChooser.CANCEL_OPTION) {
				System.out.println (" Beenden ");
				 System.exit(0);
			}
		}

	}
}
		 
