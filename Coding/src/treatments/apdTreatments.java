package treatments;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class apdTreatments extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					apdTreatments frame = new apdTreatments();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public apdTreatments() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 971, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBounds(0, 0, 949, 536);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTitle = new JLabel("Treatments for Antisocial Personality Disorder");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(292, 16, 369, 47);
		panel.add(lblTitle);
		
		JLabel lblInfo = new JLabel("Here is the treatments for APD that are suggested for you.");
		lblInfo.setForeground(new Color(160, 82, 45));
		lblInfo.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblInfo.setBounds(121, 59, 580, 27);
		panel.add(lblInfo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_1.setBackground(new Color(255, 250, 250));
		panel_1.setBounds(84, 112, 716, 352);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblInfo2 = new JLabel("You can try either one of the treatments below:");
		lblInfo2.setForeground(new Color(160, 82, 45));
		lblInfo2.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblInfo2.setBounds(121, 16, 580, 27);
		panel_1.add(lblInfo2);
		
		JLabel lbl_apdT1 = new JLabel("Psychotherapy");
		lbl_apdT1.setForeground(new Color(160, 82, 45));
		lbl_apdT1.setFont(new Font("Dubai", Font.PLAIN, 20));
		lbl_apdT1.setBounds(69, 84, 158, 20);
		panel_1.add(lbl_apdT1);
		
		JLabel lbl_apdT2 = new JLabel("Medication");
		lbl_apdT2.setForeground(new Color(160, 82, 45));
		lbl_apdT2.setFont(new Font("Dubai", Font.PLAIN, 20));
		lbl_apdT2.setBounds(69, 164, 143, 20);
		panel_1.add(lbl_apdT2);
		
		JLabel lbl_apdT3 = new JLabel("Democratic therapeutic communities (DTC)");
		lbl_apdT3.setForeground(new Color(160, 82, 45));
		lbl_apdT3.setFont(new Font("Dubai", Font.PLAIN, 20));
		lbl_apdT3.setBounds(73, 232, 349, 20);
		panel_1.add(lbl_apdT3);
			
		JButton btnReport = new JButton("Report");
		btnReport.setBounds(809, 481, 115, 29);
		panel.add(btnReport);
		btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pages.finalReport frame = new pages.finalReport();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
	}

}
