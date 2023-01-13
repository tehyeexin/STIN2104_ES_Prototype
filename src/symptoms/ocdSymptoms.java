package symptoms;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
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
	public static String symptomsList;

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
		setTitle("Psychological Disorder Diagnosis Expert System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ocdSymptoms.class.getResource("/images/icon.png")));
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
		
		JLabel lblTitle = new JLabel("Symptoms");
		lblTitle.setFont(new Font("Yu Gothic UI", Font.BOLD, 25));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(263, 16, 398, 47);
		panel.add(lblTitle);
		
		JLabel lblInst = new JLabel("Please check the box if you have any of the following symptoms.");
		lblInst.setForeground(Color.BLACK);
		lblInst.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblInst.setBounds(50, 79, 667, 27);
		panel.add(lblInst);
		
		JLabel lblInst1 = new JLabel("If you do not have any of the symptoms below, please click 'Next'.");
		lblInst1.setForeground(Color.BLACK);
		lblInst1.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblInst1.setBounds(50, 106, 667, 27);
		panel.add(lblInst1);
		
		JLabel lblInst2 = new JLabel("You can click on 'Why' to learn more information.");
		lblInst2.setForeground(Color.BLACK);
		lblInst2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblInst2.setBounds(50, 133, 461, 27);
		panel.add(lblInst2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_1.setBackground(new Color(255, 240, 245));
		panel_1.setBounds(40, 172, 860, 276);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox checkBox_ocdS1 = new JCheckBox("Fear of germs, dirt, or illness");
		checkBox_ocdS1.setBackground(new Color(255, 240, 245));
		checkBox_ocdS1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_ocdS1.setBounds(11, 12, 334, 29);
		panel_1.add(checkBox_ocdS1);
		
		JCheckBox checkBox_ocdS2 = new JCheckBox("Fear of making a mistake.");
		checkBox_ocdS2.setBackground(new Color(255, 240, 245));
		checkBox_ocdS2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_ocdS2.setBounds(11, 49, 334, 29);
		panel_1.add(checkBox_ocdS2);
		
		JCheckBox checkBox_ocdS3 = new JCheckBox("Fear for your health and safety");
		checkBox_ocdS3.setBackground(new Color(255, 240, 245));
		checkBox_ocdS3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_ocdS3.setBounds(11, 86, 334, 29);
		panel_1.add(checkBox_ocdS3);
		
		JCheckBox checkBox_ocdS4 = new JCheckBox("Excessive need for order, neatness, symmetry, or perfection");
		checkBox_ocdS4.setBackground(new Color(255, 240, 245));
		checkBox_ocdS4.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_ocdS4.setBounds(11, 123, 584, 29);
		panel_1.add(checkBox_ocdS4);
		
		JCheckBox checkBox_ocdS5 = new JCheckBox("Repeated actions (rituals), such as hand washing frequently, checking certain things repeatedly");
		checkBox_ocdS5.setBackground(new Color(255, 240, 245));
		checkBox_ocdS5.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_ocdS5.setBounds(11, 160, 829, 29);
		panel_1.add(checkBox_ocdS5);
		
		JCheckBox checkBox_ocdS6 = new JCheckBox("Fear of saying something offensive or obscene");
		checkBox_ocdS6.setBackground(new Color(255, 240, 245));
		checkBox_ocdS6.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_ocdS6.setBounds(11, 197, 450, 29);
		panel_1.add(checkBox_ocdS6);
		
		JCheckBox checkBox_ocdS7 = new JCheckBox("Fear of being stolen or polluted");
		checkBox_ocdS7.setBackground(new Color(255, 240, 245));
		checkBox_ocdS7.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_ocdS7.setBounds(11, 235, 334, 29);
		panel_1.add(checkBox_ocdS7);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(255, 240, 245));
		btnBack.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		btnBack.setBounds(314, 481, 84, 29);
		panel.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				anxietySymptoms frame = new anxietySymptoms();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		
		
		JButton btnWhy = new JButton("Why");
		btnWhy.setBackground(new Color(255, 240, 245));
		btnWhy.setBounds(419, 481, 84, 29);
		panel.add(btnWhy);
		btnWhy.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		btnWhy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "These are the symptoms of psychological disorder, the system will try to diagnose based on your answer.");
			}
		});
		
		JButton btnNext = new JButton("Next");
		btnNext.setBackground(new Color(255, 240, 245));
		btnNext.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		btnNext.setBounds(524, 481, 84, 29);
		panel.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(checkBox_ocdS1.isSelected() && checkBox_ocdS2.isSelected() 
						&& checkBox_ocdS3.isSelected() && checkBox_ocdS4.isSelected()
						&& checkBox_ocdS5.isSelected() && checkBox_ocdS6.isSelected()
						&& checkBox_ocdS7.isSelected()) {
					
					results.ocdResult frame = new results.ocdResult();
					frame.setModalExclusionType(null);
					frame.setVisible(true);
					dispose();
					
					symptomsList = checkBox_ocdS1.getText() + "\n" + checkBox_ocdS2.getText()
					 + "\n" + checkBox_ocdS3.getText() + "\n" + checkBox_ocdS4.getText()
					 + "\n" + checkBox_ocdS5.getText() + "\n" + checkBox_ocdS6.getText()
					 + "\n" + checkBox_ocdS7.getText();
					
					System.out.print("Patient have Obsessive-Compulsive Disorder (OCD).");
				}
				
				else if(checkBox_ocdS1.isSelected() && checkBox_ocdS2.isSelected() 
						&& checkBox_ocdS3.isSelected() && checkBox_ocdS4.isSelected()
						&& checkBox_ocdS5.isSelected() && checkBox_ocdS6.isSelected()) {
					results.ocdResult frame = new results.ocdResult();
					frame.setModalExclusionType(null);
					frame.setVisible(true);
					dispose();
					
					symptomsList = checkBox_ocdS1.getText() + "\n" + checkBox_ocdS2.getText()
					 + "\n" + checkBox_ocdS3.getText() + "\n" + checkBox_ocdS4.getText()
					 + "\n" + checkBox_ocdS5.getText() + "\n" + checkBox_ocdS6.getText();
					
					System.out.print("Patient have Obsessive-Compulsive Disorder (OCD).");
				}
				
				else if(checkBox_ocdS1.isSelected() && checkBox_ocdS2.isSelected() 
						&& checkBox_ocdS3.isSelected() && checkBox_ocdS4.isSelected()
						&& checkBox_ocdS5.isSelected() && checkBox_ocdS7.isSelected()) {
					results.ocdResult frame = new results.ocdResult();
					frame.setModalExclusionType(null);
					frame.setVisible(true);
					dispose();
					
					symptomsList = checkBox_ocdS1.getText() + "\n" + checkBox_ocdS2.getText()
					 + "\n" + checkBox_ocdS3.getText() + "\n" + checkBox_ocdS4.getText()
					 + "\n" + checkBox_ocdS5.getText() + "\n" + checkBox_ocdS7.getText();
					
					System.out.print("Patient have Obsessive-Compulsive Disorder (OCD).");
				}
				
				else{
					schizophreniaSymptoms frame = new schizophreniaSymptoms();
					frame.setModalExclusionType(null);
					frame.setVisible(true);
					dispose();
					
					System.out.print("Patient does not have Obsessive-Compulsive Disorder (OCD).");
				}
			}
		});
	}

}
