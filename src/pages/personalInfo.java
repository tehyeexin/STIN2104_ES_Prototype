package pages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Toolkit;
import java.awt.Toolkit;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import java.awt.SystemColor;

public class personalInfo extends JFrame {

	private JPanel contentPane;
	public static JTextField textField_name;
	public static JTextField textField_phone;
	public static JTextField textField_age;
	public static JTextField textField_occupation;
	public static JRadioButton rdbtnMale;
	public static JRadioButton rdbtnFemale;

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
		setTitle("Psychological Disorder Diagnosis Expert System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(personalInfo.class.getResource("/images/icon.png")));
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
		
		JLabel lblTitle = new JLabel("Personal Infomation");
		lblTitle.setFont(new Font("Yu Gothic UI", Font.BOLD, 25));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(297, 28, 369, 47);
		panel.add(lblTitle);
		
		JLabel lblInst = new JLabel("Please provide us with your personal information.");
		lblInst.setForeground(Color.BLACK);
		lblInst.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblInst.setBounds(115, 91, 436, 27);
		panel.add(lblInst);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_1.setBackground(new Color(255, 240, 245));
		panel_1.setBounds(115, 134, 702, 314);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(27, 28, 89, 26);
		lblName.setForeground(Color.BLACK);
		lblName.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		panel_1.add(lblName);
		
		textField_name = new JTextField();
		textField_name.setBackground(new Color(245, 255, 250));
		textField_name.setBounds(142, 27, 528, 29);
		textField_name.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		textField_name.setColumns(10);
		panel_1.add(textField_name);
		
		JLabel lblPhone = new JLabel("Phone no");
		lblPhone.setBounds(27, 86, 89, 26);
		lblPhone.setForeground(Color.BLACK);
		lblPhone.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		panel_1.add(lblPhone);
		
		textField_phone = new JTextField();
		textField_phone.setBackground(new Color(245, 255, 250));
		textField_phone.setBounds(142, 85, 528, 29);
		textField_phone.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		textField_phone.setColumns(10);
		panel_1.add(textField_phone);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(27, 145, 89, 28);
		lblAge.setForeground(Color.BLACK);
		lblAge.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		panel_1.add(lblAge);
		
		textField_age = new JTextField();
		textField_age.setBackground(new Color(245, 255, 250));
		textField_age.setBounds(142, 145, 528, 29);
		textField_age.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		textField_age.setColumns(10);
		panel_1.add(textField_age);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(27, 201, 89, 26);
		lblGender.setForeground(Color.BLACK);
		lblGender.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		panel_1.add(lblGender);
		
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBackground(new Color(255, 240, 245));
		rdbtnMale.setForeground(SystemColor.desktop);
		rdbtnMale.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		rdbtnMale.setBounds(142, 200, 85, 29);
		panel_1.add(rdbtnMale);
		
		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBackground(new Color(255, 240, 245));
		rdbtnFemale.setForeground(SystemColor.desktop);
		rdbtnFemale.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		rdbtnFemale.setBounds(247, 200, 101, 29);
		panel_1.add(rdbtnFemale);
		
		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnMale.isSelected()) {
					rdbtnFemale.setSelected(false);
				}
			}
		});
		
		rdbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnFemale.isSelected()) {
					rdbtnMale.setSelected(false);
				}
			}
		});
		
		JLabel lblOccupation = new JLabel("Occupation");
		lblOccupation.setBounds(27, 258, 116, 26);
		lblOccupation.setForeground(Color.BLACK);
		lblOccupation.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		panel_1.add(lblOccupation);
		
		textField_occupation = new JTextField();
		textField_occupation.setBackground(new Color(245, 255, 250));
		textField_occupation.setBounds(142, 257, 528, 29);
		textField_occupation.setColumns(10);
		textField_occupation.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		panel_1.add(textField_occupation);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(255, 240, 245));
		btnBack.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		btnBack.setBounds(364, 481, 84, 29);
		panel.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				startPage frame = new startPage();
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
				pMedicalHistory frame = new pMedicalHistory();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		
		
	}
}
