package pages;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class startPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					startPage frame = new startPage();
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
	public startPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Psychological Disorder Diagnosis Expert System");
		setBounds(100, 100, 971, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 248, 220));
		panel.setBounds(0, 0, 949, 536);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(getClass().getResource("/images/icon.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(414, 16, 120, 120);
		panel.add(lblNewLabel);
		
		JLabel lblTitle = new JLabel("Psychological Disorder Diagnosis Expert System");
		lblTitle.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(107, 152, 738, 35);
		panel.add(lblTitle);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("Yu Gothic UI", Font.BOLD | Font.ITALIC, 25));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBounds(406, 221, 142, 20);
		panel.add(lblWelcome);
		
		JTextArea txtrAbout = new JTextArea();
		txtrAbout.setBackground(new Color(255, 248, 220));
		txtrAbout.setFont(new Font("Yu Gothic UI", Font.ITALIC, 20));
		txtrAbout.setText("This expert system is designed to allow users to preliminarily\r\ndiagnose their psychological disorders based on symptoms \r\n   and obtain more targeted treatment recommendations.");
		txtrAbout.setBounds(215, 292, 528, 89);
		txtrAbout.setEditable(false);
		panel.add(txtrAbout);
		
		JLabel lblInst = new JLabel("Please click the button below to start the diagnosis");
		lblInst.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblInst.setHorizontalAlignment(SwingConstants.CENTER);
		lblInst.setBounds(284, 443, 390, 29);
		panel.add(lblInst);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBackground(new Color(255, 240, 245));
		btnStart.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		btnStart.setBounds(432, 481, 84, 29);
		panel.add(btnStart);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				personalInfo frame = new personalInfo();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
	}
}
