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

public class depressionSymptoms extends JFrame {

	private JPanel contentPane;
	public static String symptomsList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					depressionSymptoms frame = new depressionSymptoms();
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
	public depressionSymptoms() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Psychological Disorder Diagnosis Expert System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(depressionSymptoms.class.getResource("/images/icon.png")));
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
		
		JCheckBox checkBox_depS1 = new JCheckBox("Feelings of sadness, tearfulness, emptiness or hopelessness");
		checkBox_depS1.setBackground(new Color(255, 240, 245));
		checkBox_depS1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_depS1.setBounds(11, 12, 559, 29);
		panel_1.add(checkBox_depS1);
		
		JCheckBox checkBox_depS2 = new JCheckBox("Angry outbursts, irritability or frustration, even over small matters");
		checkBox_depS2.setBackground(new Color(255, 240, 245));
		checkBox_depS2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_depS2.setBounds(11, 49, 626, 29);
		panel_1.add(checkBox_depS2);
		
		JCheckBox checkBox_depS3 = new JCheckBox("Loss of interest in hobbies and interests you once enjoyed");
		checkBox_depS3.setBackground(new Color(255, 240, 245));
		checkBox_depS3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_depS3.setBounds(11, 86, 552, 29);
		panel_1.add(checkBox_depS3);
		
		JCheckBox checkBox_depS4 = new JCheckBox("Sleep disturbances, including insomnia or sleeping too much");
		checkBox_depS4.setBackground(new Color(255, 240, 245));
		checkBox_depS4.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_depS4.setBounds(11, 123, 602, 29);
		panel_1.add(checkBox_depS4);
		
		JCheckBox checkBox_depS5 = new JCheckBox("Feelings of worthlessness or guilt, fixating on past failures or self-blame");
		checkBox_depS5.setBackground(new Color(255, 240, 245));
		checkBox_depS5.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_depS5.setBounds(11, 160, 709, 29);
		panel_1.add(checkBox_depS5);
		
		JCheckBox checkBox_depS6 = new JCheckBox("Trouble thinking, concentrating, making decisions, and remembering things");
		checkBox_depS6.setBackground(new Color(255, 240, 245));
		checkBox_depS6.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_depS6.setBounds(11, 197, 694, 29);
		panel_1.add(checkBox_depS6);
		
		JCheckBox checkBox_depS7 = new JCheckBox("Frequent or recurrent thoughts of death, suicidal thoughts, suicide attempts or suicide");
		checkBox_depS7.setBackground(new Color(255, 240, 245));
		checkBox_depS7.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_depS7.setBounds(11, 235, 785, 29);
		panel_1.add(checkBox_depS7);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(255, 240, 245));
		btnBack.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		btnBack.setBounds(314, 481, 84, 29);
		panel.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				schizophreniaSymptoms frame = new schizophreniaSymptoms();
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
				if(checkBox_depS1.isSelected() && checkBox_depS2.isSelected() 
						&& checkBox_depS3.isSelected() && checkBox_depS4.isSelected()
						&& checkBox_depS5.isSelected() && checkBox_depS6.isSelected()
						&& checkBox_depS7.isSelected()) {
					
					results.depressionResult frame = new results.depressionResult();
					frame.setModalExclusionType(null);
					frame.setVisible(true);
					dispose();
					
					symptomsList = checkBox_depS1.getText() + "\n" + checkBox_depS2.getText()
					 + "\n" + checkBox_depS3.getText() + "\n" + checkBox_depS4.getText()
					 + "\n" + checkBox_depS5.getText() + "\n" + checkBox_depS6.getText()
					 + "\n" + checkBox_depS7.getText();
					
					System.out.print("Patient have Depression.");
				}
				
				else if(checkBox_depS1.isSelected() && checkBox_depS2.isSelected() 
						&& checkBox_depS3.isSelected() && checkBox_depS4.isSelected()
						&& checkBox_depS5.isSelected() && checkBox_depS6.isSelected()) {
					
					results.depressionResult frame = new results.depressionResult();
					frame.setModalExclusionType(null);
					frame.setVisible(true);
					dispose();
					
					symptomsList = checkBox_depS1.getText() + "\n" + checkBox_depS2.getText()
					 + "\n" + checkBox_depS3.getText() + "\n" + checkBox_depS4.getText()
					 + "\n" + checkBox_depS5.getText() + "\n" + checkBox_depS6.getText();
					
					System.out.print("Patient have Depression.");
				}
				
				else if(checkBox_depS1.isSelected() && checkBox_depS2.isSelected() 
						&& checkBox_depS3.isSelected() && checkBox_depS4.isSelected()
						&& checkBox_depS5.isSelected() && checkBox_depS7.isSelected()) {
					
					results.depressionResult frame = new results.depressionResult();
					frame.setModalExclusionType(null);
					frame.setVisible(true);
					dispose();
					
					symptomsList = checkBox_depS1.getText() + "\n" + checkBox_depS2.getText()
					 + "\n" + checkBox_depS3.getText() + "\n" + checkBox_depS4.getText()
					 + "\n" + checkBox_depS5.getText() + "\n" + checkBox_depS7.getText();
					
					System.out.print("Patient have Depression.");
				}
				
				else{
					apdSymptoms frame = new apdSymptoms();
					frame.setModalExclusionType(null);
					frame.setVisible(true);
					dispose();
					
					System.out.print("Patient does not have Depression.");
				}
			}
		});
	}

}
