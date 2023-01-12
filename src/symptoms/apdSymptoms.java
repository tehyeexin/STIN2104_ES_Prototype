package symptoms;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
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

public class apdSymptoms extends JFrame {

	private JPanel contentPane;
	public static String symptomsList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					apdSymptoms frame = new apdSymptoms();
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
	public apdSymptoms() {
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
		
		JCheckBox checkBox_apdS1 = new JCheckBox("Be physically aggressive");
		checkBox_apdS1.setBackground(new Color(255, 240, 245));
		checkBox_apdS1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_apdS1.setBounds(11, 12, 334, 29);
		panel_1.add(checkBox_apdS1);
		
		JCheckBox checkBox_apdS2 = new JCheckBox("Arrogance, a sense of superiority and being extremely opinionated");
		checkBox_apdS2.setBackground(new Color(255, 240, 245));
		checkBox_apdS2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_apdS2.setBounds(11, 49, 626, 29);
		panel_1.add(checkBox_apdS2);
		
		JCheckBox checkBox_apdS3 = new JCheckBox("Breaking the law");
		checkBox_apdS3.setBackground(new Color(255, 240, 245));
		checkBox_apdS3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_apdS3.setBounds(11, 86, 334, 29);
		panel_1.add(checkBox_apdS3);
		
		JCheckBox checkBox_apdS4 = new JCheckBox("Violence");
		checkBox_apdS4.setBackground(new Color(255, 240, 245));
		checkBox_apdS4.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_apdS4.setBounds(11, 123, 334, 29);
		panel_1.add(checkBox_apdS4);
		
		JCheckBox checkBox_apdS5 = new JCheckBox("Manipulate or deceive others for personal gain or personal pleasure");
		checkBox_apdS5.setBackground(new Color(255, 240, 245));
		checkBox_apdS5.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_apdS5.setBounds(11, 160, 626, 29);
		panel_1.add(checkBox_apdS5);
		
		JCheckBox checkBox_apdS6 = new JCheckBox("Unnecessary risk-taking or dangerous behavior with no regard for the safety of self or others");
		checkBox_apdS6.setBackground(new Color(255, 240, 245));
		checkBox_apdS6.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_apdS6.setBounds(11, 197, 843, 29);
		panel_1.add(checkBox_apdS6);
		
		JCheckBox checkBox_apdS7 = new JCheckBox("Blame others for their problems");
		checkBox_apdS7.setBackground(new Color(255, 240, 245));
		checkBox_apdS7.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_apdS7.setBounds(11, 235, 334, 29);
		panel_1.add(checkBox_apdS7);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(255, 240, 245));
		btnBack.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		btnBack.setBounds(314, 481, 84, 29);
		panel.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				depressionSymptoms frame = new depressionSymptoms();
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
				if(checkBox_apdS1.isSelected() && checkBox_apdS2.isSelected() 
						&& checkBox_apdS3.isSelected() && checkBox_apdS4.isSelected()
						&& checkBox_apdS5.isSelected() && checkBox_apdS6.isSelected()
						&& checkBox_apdS7.isSelected()) {
					
					results.apdResult frame = new results.apdResult();
					frame.setModalExclusionType(null);
					frame.setVisible(true);
					dispose();
					
					symptomsList = checkBox_apdS1.getText() + "\n" + checkBox_apdS2.getText()
					 + "\n" + checkBox_apdS3.getText() + "\n" + checkBox_apdS4.getText()
					 + "\n" + checkBox_apdS5.getText() + "\n" + checkBox_apdS6.getText()
					 + "\n" + checkBox_apdS7.getText();
					
					System.out.print("Patient have Antisocial Personality Disorder (APD).");
				}
				
				else if(checkBox_apdS1.isSelected() && checkBox_apdS2.isSelected() 
						&& checkBox_apdS3.isSelected() && checkBox_apdS4.isSelected()
						&& checkBox_apdS5.isSelected() && checkBox_apdS6.isSelected()) {
					
					results.apdResult frame = new results.apdResult();
					frame.setModalExclusionType(null);
					frame.setVisible(true);
					dispose();
					
					symptomsList = checkBox_apdS1.getText() + "\n" + checkBox_apdS2.getText()
					 + "\n" + checkBox_apdS3.getText() + "\n" + checkBox_apdS4.getText()
					 + "\n" + checkBox_apdS5.getText() + "\n" + checkBox_apdS6.getText();
					
					System.out.print("Patient have Antisocial Personality Disorder (APD).");
				}
				
				else if(checkBox_apdS1.isSelected() && checkBox_apdS2.isSelected() 
						&& checkBox_apdS3.isSelected() && checkBox_apdS4.isSelected()
						&& checkBox_apdS5.isSelected() && checkBox_apdS7.isSelected()) {
					
					results.apdResult frame = new results.apdResult();
					frame.setModalExclusionType(null);
					frame.setVisible(true);
					dispose();
					
					symptomsList = checkBox_apdS1.getText() + "\n" + checkBox_apdS2.getText()
					 + "\n" + checkBox_apdS3.getText() + "\n" + checkBox_apdS4.getText()
					 + "\n" + checkBox_apdS5.getText() + "\n" + checkBox_apdS7.getText();
					
					System.out.print("Patient have Antisocial Personality Disorder (APD).");
				}
				
				else{
					results.noDisorderResult frame = new results.noDisorderResult();
					frame.setModalExclusionType(null);
					frame.setVisible(true);
					dispose();
					
					System.out.print("Patient does not have Antisocial Personality Disorder (APD).");
				}
			}
		});
	}

}
