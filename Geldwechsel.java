package Geldwechsel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class Geldwechsel {

	public JFrame frmGeldwechsel;
	public String input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Geldwechsel window = new Geldwechsel();
					window.frmGeldwechsel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Geldwechsel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmGeldwechsel = new JFrame();
		frmGeldwechsel.setType(Type.UTILITY);
		//frmGeldwechsel.setOpacity(0.5f);
		frmGeldwechsel.setTitle("Geldwechsel");
		frmGeldwechsel.setBounds(100, 100, 792, 567);
		frmGeldwechsel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGeldwechsel.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Input");
		lblNewLabel.setBounds(76, 56, 95, 33);
		frmGeldwechsel.getContentPane().add(lblNewLabel);
		
		final JTextPane txtpnInput = new JTextPane();
		txtpnInput.setBounds(158, 56, 100, 33);
		frmGeldwechsel.getContentPane().add(txtpnInput);
		
		JButton btnNewButton = new JButton("berechnen");

		btnNewButton.setBounds(300, 56, 100, 33);
		frmGeldwechsel.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("2 Euro");
		lblNewLabel_1.setBounds(76, 183, 81, 31);
		frmGeldwechsel.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("1 Euro");
		lblNewLabel_1_1.setBounds(76, 224, 81, 31);
		frmGeldwechsel.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("50 Cent");
		lblNewLabel_1_2.setBounds(76, 265, 81, 31);
		frmGeldwechsel.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("20 Cent");
		lblNewLabel_1_3.setBounds(76, 306, 81, 31);
		frmGeldwechsel.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("10 Cent");
		lblNewLabel_1_4.setBounds(76, 347, 81, 31);
		frmGeldwechsel.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("5 Cent");
		lblNewLabel_1_5.setBounds(76, 388, 81, 31);
		frmGeldwechsel.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("2 Cent");
		lblNewLabel_1_6.setBounds(76, 429, 81, 31);
		frmGeldwechsel.getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_6_1 = new JLabel("1 Cent");
		lblNewLabel_1_6_1.setBounds(76, 470, 81, 31);
		frmGeldwechsel.getContentPane().add(lblNewLabel_1_6_1);
		
		 final JTextPane txtpnInput_1 = new JTextPane();
		txtpnInput_1.setBounds(158, 181, 100, 33);
		frmGeldwechsel.getContentPane().add(txtpnInput_1);
		
		final JTextPane txtpnInput_2 = new JTextPane();
		txtpnInput_2.setBounds(158, 222, 100, 33);
		frmGeldwechsel.getContentPane().add(txtpnInput_2);
		
		final JTextPane txtpnInput_3 = new JTextPane();
		txtpnInput_3.setBounds(158, 265, 100, 33);
		frmGeldwechsel.getContentPane().add(txtpnInput_3);
		
		final JTextPane txtpnInput_4 = new JTextPane();
		txtpnInput_4.setBounds(158, 306, 100, 33);
		frmGeldwechsel.getContentPane().add(txtpnInput_4);
		
		final JTextPane txtpnInput_5 = new JTextPane();
		txtpnInput_5.setBounds(158, 345, 100, 33);
		frmGeldwechsel.getContentPane().add(txtpnInput_5);
	
		final JTextPane txtpnInput_6 = new JTextPane();
		txtpnInput_6.setBounds(158, 386, 100, 33);
		frmGeldwechsel.getContentPane().add(txtpnInput_6);
		
		final JTextPane txtpnInput_7 = new JTextPane();
		txtpnInput_7.setBounds(158, 429, 100, 33);
		frmGeldwechsel.getContentPane().add(txtpnInput_7);
		
	
		
		final JTextPane txtpnInput_8 = new JTextPane();
		txtpnInput_8.setBounds(158, 470, 100, 33);
		frmGeldwechsel.getContentPane().add(txtpnInput_8);
	
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String input = txtpnInput.getText();
				float inputMoney_F = Float.parseFloat(input);
				int inputMoney= (int)(inputMoney_F*100);
				
				int TwoEuroCnt;
				int OneEuroCnt;
				int FiftyCentCnt;
				int TwentyCentCnt;
				int TenCentCnt;
				int FiveCentCnt;
				int TwoCentCnt;
				int OneCentCnt;
				
				TwoEuroCnt = inputMoney/200;
				int rest = inputMoney%200;
				
				OneEuroCnt = rest/100;
				rest = rest%100;
				
				FiftyCentCnt = rest/50;
				rest = rest%50;
				
				TwentyCentCnt = rest/20;
				rest = rest%20;
				
				TenCentCnt = rest/10;
				rest = rest%10;
				
				FiveCentCnt = rest/5;
				rest = rest%5;
				
				TwoCentCnt = rest/2;
				rest = rest%2;
				
				OneCentCnt = rest;
				
				String TwoEuro = Integer.toString(TwoEuroCnt);
				txtpnInput_1.setText(TwoEuro);
				
				String OneEuro = Integer.toString(OneEuroCnt);
				txtpnInput_2.setText(OneEuro);
				
				String FiftyCent = Integer.toString(FiftyCentCnt);
				txtpnInput_3.setText(FiftyCent);
				
				String TwentyCent = Integer.toString(TwentyCentCnt);
				txtpnInput_4.setText(TwentyCent);
				
				
				String TenCent = Integer.toString(TenCentCnt);
				txtpnInput_5.setText(TenCent);
				
				String FiveCent = Integer.toString(FiveCentCnt);
				txtpnInput_6.setText(FiveCent);
				
				String TwoCent = Integer.toString(TwoCentCnt);
				txtpnInput_7.setText(TwoCent);
				
				String OneCent = Integer.toString(OneCentCnt);
				txtpnInput_8.setText(OneCent);
				
				
						
				
				
			}
		});
		 
	}
	
	
	
	
}

