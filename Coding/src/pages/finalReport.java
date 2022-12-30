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

public class finalReport extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					finalReport frame = new finalReport();
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
	public finalReport() {
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
		
		JLabel lblTitle = new JLabel("Psychological Disorder Diagnosis Expert System Final Report");
		lblTitle.setBounds(258, 16, 463, 20);
		panel.add(lblTitle);

		JLabel lblThank = new JLabel("This is an autogenereated report.");
		lblThank.setHorizontalAlignment(SwingConstants.CENTER);
		lblThank.setBounds(313, 64, 362, 20);
		panel.add(lblThank);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_1.setBackground(new Color(255, 250, 250));
		panel_1.setBounds(30, 102, 718, 334);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblName = new JLabel("Name: Mr./Mrs.");
		lblName.setBounds(15, 17, 89, 26);
		lblName.setForeground(new Color(139, 69, 19));
		lblName.setFont(new Font("Dubai", Font.PLAIN, 20));
		panel_1.add(lblName);
		
//		JLabel lblName2 = new JLabel();
//		//lblName2.setText(personalInfo.textField_name);
//		lblName2.setForeground(new Color(139, 69, 19));
//		lblName2.setFont(new Font("Dubai", Font.PLAIN, 20));
//		lblName2.setBounds(119, 20, 89, 26);
//		panel_1.add(lblName2);
		
		JLabel lblPhone = new JLabel("Phone no:");
		lblPhone.setBounds(15, 60, 89, 26);
		lblPhone.setForeground(new Color(139, 69, 19));
		lblPhone.setFont(new Font("Dubai", Font.PLAIN, 20));
		panel_1.add(lblPhone);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(15, 102, 89, 26);
		lblAge.setForeground(new Color(139, 69, 19));
		lblAge.setFont(new Font("Dubai", Font.PLAIN, 20));
		panel_1.add(lblAge);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(15, 144, 89, 26);
		lblGender.setForeground(new Color(139, 69, 19));
		lblGender.setFont(new Font("Dubai", Font.PLAIN, 20));
		panel_1.add(lblGender);
		
		JLabel lblOccupation = new JLabel("Occupation:");
		lblOccupation.setBounds(15, 186, 128, 26);
		lblOccupation.setForeground(new Color(139, 69, 19));
		lblOccupation.setFont(new Font("Dubai", Font.PLAIN, 20));
		panel_1.add(lblOccupation);
		
		JLabel lblDisorder = new JLabel("Disorder:");
		lblDisorder.setForeground(new Color(139, 69, 19));
		lblDisorder.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblDisorder.setBounds(25, 223, 128, 26);
		panel_1.add(lblDisorder);
		
		JLabel lblTreatment = new JLabel("Treatment:");
		lblTreatment.setForeground(new Color(139, 69, 19));
		lblTreatment.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblTreatment.setBounds(15, 272, 128, 26);
		panel_1.add(lblTreatment);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(369, 469, 138, 29);
		panel.add(btnExit);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setBounds(548, 469, 138, 29);
		panel.add(btnPrint);
	}

}
