package symptoms;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class ocdSymptoms extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ocdSymptoms frame = new ocdSymptoms();
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
	public ocdSymptoms() {
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
		
		JLabel lblTitle = new JLabel("Symptoms of Obsessive-Compulsive Disorder (OCD)");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(292, 16, 369, 47);
		panel.add(lblTitle);
		
		JLabel lblInfo = new JLabel("Please check the box if you have any of the following symptoms.");
		lblInfo.setForeground(new Color(160, 82, 45));
		lblInfo.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblInfo.setBounds(121, 59, 580, 27);
		panel.add(lblInfo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_1.setBackground(new Color(255, 250, 250));
		panel_1.setBounds(96, 102, 739, 362);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox checkBox_ocdS1 = new JCheckBox("Fear of germs, dirt, or illness");
		checkBox_ocdS1.setBounds(11, 33, 334, 29);
		panel_1.add(checkBox_ocdS1);
		
		JCheckBox checkBox_ocdS2 = new JCheckBox("Fear of making a mistake.");
		checkBox_ocdS2.setBounds(11, 70, 334, 29);
		panel_1.add(checkBox_ocdS2);
		
		JCheckBox checkBox_ocdS3 = new JCheckBox("Fear for your health and safety");
		checkBox_ocdS3.setBounds(11, 106, 334, 29);
		panel_1.add(checkBox_ocdS3);
		
		JCheckBox checkBox_ocdS4 = new JCheckBox("Excessive need for order, neatness, symmetry, or perfection");
		checkBox_ocdS4.setBounds(11, 143, 334, 29);
		panel_1.add(checkBox_ocdS4);
		
		JCheckBox checkBox_ocdS5 = new JCheckBox("Repeated actions (rituals), such as hand washing frequently, checking certain things repeatedly");
		checkBox_ocdS5.setBounds(11, 180, 707, 29);
		panel_1.add(checkBox_ocdS5);
		
		JCheckBox checkBox_ocdS6 = new JCheckBox("Fear of saying something offensive or obscene");
		checkBox_ocdS6.setBounds(11, 217, 334, 29);
		panel_1.add(checkBox_ocdS6);
		
		JCheckBox checkBox_ocdS7 = new JCheckBox("Fear of being stolen or polluted");
		checkBox_ocdS7.setBounds(11, 257, 334, 29);
		panel_1.add(checkBox_ocdS7);
		
		JButton btnWhy = new JButton("WHY?");
		btnWhy.setBounds(224, 309, 95, 29);
		panel_1.add(btnWhy);
		btnWhy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "System will...");
			}
		});
		
		JButton btnHow = new JButton("HOW?");
		btnHow.setBounds(386, 309, 95, 29);
		panel_1.add(btnHow);
		btnHow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Please select...");
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(15, 481, 84, 29);
		panel.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				symptoms.anxietySymptoms frame = new symptoms.anxietySymptoms();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(809, 481, 84, 29);
		panel.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				symptoms.schizophreniaSymptoms frame = new symptoms.schizophreniaSymptoms();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
	}

}
