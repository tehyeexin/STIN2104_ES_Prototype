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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Toolkit;
import java.awt.Toolkit;

public class personalInfo extends JFrame {

	private JPanel contentPane;
	protected static JTextField textField_name;
	protected static JTextField textField_phone;
	protected static JTextField textField_age;
	protected static JTextField textField_gender;
	protected static JTextField textField_occupation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					personalInfo frame = new personalInfo();
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
	public personalInfo() {
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
		
		JLabel lblTitle = new JLabel("Perosnal Infomation");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(292, 16, 369, 47);
		panel.add(lblTitle);
		
		JLabel lblInfo = new JLabel("Please provide us with your information.");
		lblInfo.setForeground(new Color(160, 82, 45));
		lblInfo.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblInfo.setBounds(30, 72, 333, 27);
		panel.add(lblInfo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_1.setBackground(new Color(255, 250, 250));
		panel_1.setBounds(30, 102, 448, 334);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(15, 17, 89, 26);
		lblName.setForeground(new Color(139, 69, 19));
		lblName.setFont(new Font("Dubai", Font.PLAIN, 20));
		panel_1.add(lblName);
		
		textField_name = new JTextField();
		textField_name.setBackground(new Color(245, 255, 250));
		textField_name.setBounds(111, 16, 206, 26);
		textField_name.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_name.setColumns(10);
		panel_1.add(textField_name);
		
		JLabel lblPhone = new JLabel("Phone no");
		lblPhone.setBounds(15, 60, 89, 26);
		lblPhone.setForeground(new Color(139, 69, 19));
		lblPhone.setFont(new Font("Dubai", Font.PLAIN, 20));
		panel_1.add(lblPhone);
		
		textField_phone = new JTextField();
		textField_phone.setBackground(new Color(245, 255, 250));
		textField_phone.setBounds(111, 59, 206, 26);
		textField_phone.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_phone.setColumns(10);
		panel_1.add(textField_phone);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(15, 102, 89, 26);
		lblAge.setForeground(new Color(139, 69, 19));
		lblAge.setFont(new Font("Dubai", Font.PLAIN, 20));
		panel_1.add(lblAge);
		
		textField_age = new JTextField();
		textField_age.setBackground(new Color(245, 255, 250));
		textField_age.setBounds(111, 101, 206, 26);
		textField_age.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_age.setColumns(10);
		panel_1.add(textField_age);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(15, 144, 89, 26);
		lblGender.setForeground(new Color(139, 69, 19));
		lblGender.setFont(new Font("Dubai", Font.PLAIN, 20));
		panel_1.add(lblGender);
		
		textField_gender = new JTextField();
		textField_gender.setBackground(new Color(245, 255, 250));
		textField_gender.setBounds(111, 143, 206, 26);
		textField_gender.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_gender.setColumns(10);
		panel_1.add(textField_gender);
		
		JLabel lblOccupation = new JLabel("Occupation");
		lblOccupation.setBounds(15, 186, 128, 26);
		lblOccupation.setForeground(new Color(139, 69, 19));
		lblOccupation.setFont(new Font("Dubai", Font.PLAIN, 20));
		panel_1.add(lblOccupation);
		
		textField_occupation = new JTextField();
		textField_occupation.setBackground(new Color(245, 255, 250));
		textField_occupation.setBounds(202, 185, 206, 26);
		textField_occupation.setColumns(10);
		textField_occupation.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		panel_1.add(textField_occupation);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(809, 481, 115, 29);
		panel.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pMedicalHistory frame = new pMedicalHistory();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		
		
	}
}
