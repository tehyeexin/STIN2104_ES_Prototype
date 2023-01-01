package pages;

import java.awt.BorderLayout;
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
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBounds(427, 152, 69, 20);
		panel.add(lblWelcome);
		
		JLabel lblTitle = new JLabel("Psychological Disorder Diagnosis Expert System");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(260, 64, 418, 20);
		panel.add(lblTitle);
		
		JLabel lblAbout = new JLabel("This expert system is...");
		lblAbout.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbout.setBounds(332, 237, 268, 29);
		panel.add(lblAbout);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(425, 367, 84, 29);
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
