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

public class ocdTreatments extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ocdTreatments frame = new ocdTreatments();
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
	public ocdTreatments() {
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
		
		JLabel lblTitle = new JLabel("Treatments for Obsessive-Compulsive Disorder (OCD)");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(292, 16, 369, 47);
		panel.add(lblTitle);
		
		JLabel lblInfo = new JLabel("Here is the treatments for OCD that are suggested for you.");
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
		
		JLabel lbl_depT1 = new JLabel("Psychotherapy");
		lbl_depT1.setForeground(new Color(160, 82, 45));
		lbl_depT1.setFont(new Font("Dubai", Font.PLAIN, 20));
		lbl_depT1.setBounds(69, 84, 158, 20);
		panel_1.add(lbl_depT1);
		
		JLabel lbl_depT2 = new JLabel("Medication");
		lbl_depT2.setForeground(new Color(160, 82, 45));
		lbl_depT2.setFont(new Font("Dubai", Font.PLAIN, 20));
		lbl_depT2.setBounds(79, 133, 143, 20);
		panel_1.add(lbl_depT2);
		
		JLabel lbl_depT3 = new JLabel("Deep brain stimulation (DBS)");
		lbl_depT3.setForeground(new Color(160, 82, 45));
		lbl_depT3.setFont(new Font("Dubai", Font.PLAIN, 20));
		lbl_depT3.setBounds(70, 169, 207, 20);
		panel_1.add(lbl_depT3);
		
		JLabel lbl_depT4 = new JLabel("Complementary therapy");
		lbl_depT4.setForeground(new Color(160, 82, 45));
		lbl_depT4.setFont(new Font("Dubai", Font.PLAIN, 20));
		lbl_depT4.setBounds(70, 205, 207, 20);
		panel_1.add(lbl_depT4);
			
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
