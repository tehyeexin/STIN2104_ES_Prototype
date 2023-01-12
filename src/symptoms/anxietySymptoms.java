package symptoms;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;

import pages.famMedicalHistory;
import results.anxietyResult;

import javax.swing.event.ChangeEvent;
import javax.swing.JTextField;

public class anxietySymptoms extends JFrame {

	
	private JPanel contentPane;
	public static String symptomsList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					anxietySymptoms frame = new anxietySymptoms();
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
	public anxietySymptoms() {
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
		
		JCheckBox checkBox_anxS1 = new JCheckBox("Trouble sleeping");
		checkBox_anxS1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_anxS1.setBackground(new Color(255, 240, 245));
		checkBox_anxS1.setBounds(11, 12, 334, 29);
		panel_1.add(checkBox_anxS1);
		
		JCheckBox checkBox_anxS2 = new JCheckBox("Trouble concentrating");
		checkBox_anxS2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_anxS2.setBackground(new Color(255, 240, 245));
		checkBox_anxS2.setBounds(11, 49, 479, 29);
		panel_1.add(checkBox_anxS2);
		
		JCheckBox checkBox_anxS3 = new JCheckBox("Fatigue (feeling severely overtired)");
		checkBox_anxS3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_anxS3.setBackground(new Color(255, 240, 245));
		checkBox_anxS3.setBounds(11, 86, 334, 29);
		panel_1.add(checkBox_anxS3);
		
		JCheckBox checkBox_anxS4 = new JCheckBox("Change in appetite");
		checkBox_anxS4.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_anxS4.setBackground(new Color(255, 240, 245));
		checkBox_anxS4.setBounds(11, 123, 334, 29);
		panel_1.add(checkBox_anxS4);
		
		JCheckBox checkBox_anxS5 = new JCheckBox("Irritability (get annoyed easily)");
		checkBox_anxS5.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_anxS5.setBackground(new Color(255, 240, 245));
		checkBox_anxS5.setBounds(11, 160, 334, 29);
		panel_1.add(checkBox_anxS5);
		
		JCheckBox checkBox_anxS6 = new JCheckBox("A feeling of hopeless or suicidal thought");
		checkBox_anxS6.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_anxS6.setBackground(new Color(255, 240, 245));
		checkBox_anxS6.setBounds(11, 197, 392, 29);
		panel_1.add(checkBox_anxS6);
		
		JCheckBox checkBox_anxS7 = new JCheckBox("Nervousness or sweating");
		checkBox_anxS7.setBackground(new Color(255, 240, 245));
		checkBox_anxS7.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_anxS1.setBackground(new Color(255, 240, 245));
		checkBox_anxS7.setBounds(11, 235, 334, 29);
		panel_1.add(checkBox_anxS7);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(255, 240, 245));
		btnBack.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		btnBack.setBounds(314, 481, 84, 29);
		panel.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pages.famMedicalHistory frame = new pages.famMedicalHistory();
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
				
				if(checkBox_anxS1.isSelected() && checkBox_anxS2.isSelected() 
						&& checkBox_anxS3.isSelected() && checkBox_anxS4.isSelected()
						&& checkBox_anxS5.isSelected() && checkBox_anxS6.isSelected()
						&& checkBox_anxS7.isSelected()) {
					
					results.anxietyResult frame = new results.anxietyResult();
					frame.setModalExclusionType(null);
					frame.setVisible(true);
					dispose();
					
					symptomsList = checkBox_anxS1.getText() + "\n" + checkBox_anxS2.getText()
					 + "\n" + checkBox_anxS3.getText() + "\n" + checkBox_anxS4.getText()
					 + "\n" + checkBox_anxS5.getText() + "\n" + checkBox_anxS6.getText()
					 + "\n" + checkBox_anxS7.getText();
					
					System.out.print("Patient have Anxiety.");
				}
				
				else if(checkBox_anxS1.isSelected() && checkBox_anxS2.isSelected() 
						&& checkBox_anxS3.isSelected() && checkBox_anxS4.isSelected()
						&& checkBox_anxS5.isSelected() && checkBox_anxS6.isSelected()) {
					
					results.anxietyResult frame = new results.anxietyResult();
					frame.setModalExclusionType(null);
					frame.setVisible(true);
					dispose();
					
					symptomsList = checkBox_anxS1.getText() + "\n" + checkBox_anxS2.getText()
					 + "\n" + checkBox_anxS3.getText() + "\n" + checkBox_anxS4.getText()
					 + "\n" + checkBox_anxS5.getText() + "\n" + checkBox_anxS6.getText();
					
					System.out.print("Patient have Anxiety.");
				}
				
				else if(checkBox_anxS1.isSelected() && checkBox_anxS2.isSelected() 
						&& checkBox_anxS3.isSelected() && checkBox_anxS4.isSelected()
						&& checkBox_anxS5.isSelected() && checkBox_anxS7.isSelected()) {
					
					results.anxietyResult frame = new results.anxietyResult();
					frame.setModalExclusionType(null);
					frame.setVisible(true);
					dispose();
					
					symptomsList = checkBox_anxS1.getText() + "\n" + checkBox_anxS2.getText()
					 + "\n" + checkBox_anxS3.getText() + "\n" + checkBox_anxS4.getText()
					 + "\n" + checkBox_anxS5.getText() + "\n" + checkBox_anxS7.getText();
					
					System.out.print("Patient have Anxiety.");
				}
				
				else{
					ocdSymptoms frame = new ocdSymptoms();
					frame.setModalExclusionType(null);
					frame.setVisible(true);
					dispose();
					
					System.out.print("Patient does not have Anxiety.");
				}
			}
		});
		
		
	}
}
