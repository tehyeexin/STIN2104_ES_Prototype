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
import java.awt.SystemColor;

public class pMedicalHistory extends JFrame {

	private JPanel contentPane;
	public static JRadioButton rdbtnYes;
	public static JRadioButton rdbtnNo;
	public static JTextField textField_illness;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pMedicalHistory frame = new pMedicalHistory();
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
	public pMedicalHistory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Psychological Disorder Diagnosis Expert System");
		setBounds(100, 100, 971, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 248, 220));
		panel.setBorder(null);
		panel.setBounds(0, 0, 949, 536);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTitle = new JLabel("Medical History");
		lblTitle.setFont(new Font("Yu Gothic UI", Font.BOLD, 25));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(292, 16, 369, 47);
		panel.add(lblTitle);
		
		JLabel lblInst = new JLabel("Please provide us with your psychological medical history.");
		lblInst.setForeground(Color.BLACK);
		lblInst.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblInst.setBounds(115, 91, 518, 27);
		panel.add(lblInst);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_1.setBackground(new Color(255, 240, 245));
		panel_1.setBounds(115, 134, 702, 253);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblQ1 = new JLabel("Do you have a history of psychological illness?");
		lblQ1.setBounds(43, 39, 479, 29);
		lblQ1.setForeground(SystemColor.desktop);
		lblQ1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		panel_1.add(lblQ1);
		
		rdbtnYes = new JRadioButton("Yes");
		rdbtnYes.setBackground(new Color(255, 240, 245));
		rdbtnYes.setForeground(SystemColor.desktop);
		rdbtnYes.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		rdbtnYes.setBounds(43, 80, 80, 29);
		panel_1.add(rdbtnYes);
		
		rdbtnNo = new JRadioButton("No");
		rdbtnNo.setBackground(new Color(255, 240, 245));
		rdbtnNo.setForeground(SystemColor.desktop);
		rdbtnNo.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		rdbtnNo.setBounds(131, 80, 91, 29);
		panel_1.add(rdbtnNo);
		
		rdbtnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnYes.isSelected()) {
					rdbtnNo.setSelected(false);
					textField_illness.setEditable(true);
				}
			}
		});
		
		rdbtnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNo.isSelected()) {
					rdbtnYes.setSelected(false);
					textField_illness.setEditable(false);
					textField_illness.setText("");
				}
			}
		});
		
		JLabel lblQ2 = new JLabel("If yes, please state the psychological illness : ");
		lblQ2.setBounds(43, 130, 479, 29);
		lblQ2.setForeground(SystemColor.desktop);
		lblQ2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		panel_1.add(lblQ2);
		
		textField_illness = new JTextField();
		textField_illness.setBackground(new Color(245, 255, 250));
		textField_illness.setBounds(43, 176, 479, 29);
		textField_illness.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		textField_illness.setColumns(10);
		panel_1.add(textField_illness);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(255, 240, 245));
		btnBack.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		btnBack.setBounds(364, 481, 84, 29);
		panel.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				personalInfo frame = new personalInfo();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		
		JButton btnNext = new JButton("Next");
		btnNext.setBackground(new Color(255, 240, 245));
		btnNext.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		btnNext.setBounds(501, 481, 84, 29);
		panel.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				famMedicalHistory frame = new famMedicalHistory();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
	}

}
