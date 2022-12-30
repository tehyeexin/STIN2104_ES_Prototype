package pages;

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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class famMedicalHistory extends JFrame {

	private JPanel contentPane;
	private JRadioButton rdbtnYes;
	private JRadioButton rdbtnNo;
	private JTextField textField_famIllness;
	private JTextField textField_relationship;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					famMedicalHistory frame = new famMedicalHistory();
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
	public famMedicalHistory() {
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
		
		JLabel lblTitle = new JLabel("Family Member Medical History");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(292, 16, 369, 47);
		panel.add(lblTitle);
		
		JLabel lblInfo = new JLabel("Please provide us with your family member's psychological medical history.");
		lblInfo.setForeground(new Color(160, 82, 45));
		lblInfo.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblInfo.setBounds(230, 58, 463, 27);
		panel.add(lblInfo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_1.setBackground(new Color(255, 250, 250));
		panel_1.setBounds(104, 112, 716, 352);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblQ1 = new JLabel("Does your family have a history of psychological illness?");
		lblQ1.setBounds(95, 26, 423, 26);
		lblQ1.setForeground(new Color(139, 69, 19));
		lblQ1.setFont(new Font("Dubai", Font.PLAIN, 20));
		panel_1.add(lblQ1);
		
		rdbtnYes = new JRadioButton("Yes");
		rdbtnYes.setForeground(new Color(139, 69, 19));
		rdbtnYes.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		rdbtnYes.setBounds(54, 66, 129, 29);
		panel_1.add(rdbtnYes);
		
		rdbtnNo = new JRadioButton("No");
		rdbtnNo.setForeground(new Color(139, 69, 19));
		rdbtnNo.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		rdbtnNo.setBounds(225, 66, 91, 29);
		panel_1.add(rdbtnNo);
		
		rdbtnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnYes.isSelected()) {
					rdbtnNo.setSelected(false);
				}
			}
		});
		
		rdbtnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNo.isSelected()) {
					rdbtnYes.setSelected(false);
				}
			}
		});
		
		JLabel lblQ2 = new JLabel("If yes, please state the psychological illness : ");
		lblQ2.setBounds(15, 137, 423, 26);
		lblQ2.setForeground(new Color(139, 69, 19));
		lblQ2.setFont(new Font("Dubai", Font.PLAIN, 20));
		panel_1.add(lblQ2);
		
		textField_famIllness = new JTextField();
		textField_famIllness.setBackground(new Color(245, 255, 250));
		textField_famIllness.setBounds(15, 196, 206, 26);
		textField_famIllness.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_famIllness.setColumns(10);
		panel_1.add(textField_famIllness);
		
		JLabel lblQ3 = new JLabel("What is your relationship with him/her?");
		lblQ3.setBounds(15, 254, 336, 26);
		lblQ3.setForeground(new Color(139, 69, 19));
		lblQ3.setFont(new Font("Dubai", Font.PLAIN, 20));
		panel_1.add(lblQ3);
		
		textField_relationship = new JTextField();
		textField_relationship.setBackground(new Color(245, 255, 250));
		textField_relationship.setBounds(15, 284, 206, 26);
		textField_relationship.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_relationship.setColumns(10);
		panel_1.add(textField_relationship);
		
		
		
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(809, 481, 115, 29);
		panel.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				symptoms.anxietySymptoms frame = new symptoms.anxietySymptoms();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
	}

}
