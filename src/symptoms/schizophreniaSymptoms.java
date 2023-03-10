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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;

public class schizophreniaSymptoms extends JFrame {

	private JPanel contentPane;
	public static String symptomsList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					schizophreniaSymptoms frame = new schizophreniaSymptoms();
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
	public schizophreniaSymptoms() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Psychological Disorders Diagnosis Expert System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(schizophreniaSymptoms.class.getResource("/images/icon.png")));
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
		
		JCheckBox checkBox_schS1 = new JCheckBox("Hallucinations");
		checkBox_schS1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_schS1.setBackground(new Color(255, 240, 245));
		checkBox_schS1.setBounds(11, 12, 153, 29);
		panel_1.add(checkBox_schS1);
		
		JCheckBox checkBox_schS2 = new JCheckBox("Delusions");
		checkBox_schS2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_schS2.setBackground(new Color(255, 240, 245));
		checkBox_schS2.setBounds(11, 49, 115, 29);
		panel_1.add(checkBox_schS2);
		
		JCheckBox checkBox_schS3 = new JCheckBox("Disorganized thinking or speech");
		checkBox_schS3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_schS3.setBackground(new Color(255, 240, 245));
		checkBox_schS3.setBounds(11, 86, 334, 29);
		panel_1.add(checkBox_schS3);
		
		JCheckBox checkBox_schS4 = new JCheckBox("A lack of emotion or expressions");
		checkBox_schS4.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_schS4.setBackground(new Color(255, 240, 245));
		checkBox_schS4.setBounds(11, 123, 334, 29);
		panel_1.add(checkBox_schS4);
		
		JCheckBox checkBox_schS5 = new JCheckBox("Forgetfulness");
		checkBox_schS5.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_schS5.setBackground(new Color(255, 240, 245));
		checkBox_schS5.setBounds(11, 160, 334, 29);
		panel_1.add(checkBox_schS5);
		
		JCheckBox checkBox_schS6 = new JCheckBox("Social isolation");
		checkBox_schS6.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_schS6.setBackground(new Color(255, 240, 245));
		checkBox_schS6.setBounds(11, 197, 334, 29);
		panel_1.add(checkBox_schS6);
		
		JCheckBox checkBox_schS7 = new JCheckBox("Loss of interest or excitement for life");
		checkBox_schS7.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		checkBox_schS7.setBackground(new Color(255, 240, 245));
		checkBox_schS7.setBounds(11, 235, 361, 29);
		panel_1.add(checkBox_schS7);
		
		JLabel lblexperiencesThatAppear = new JLabel("(experiences that appear real but are created by your mind includes visions, sounds, or smells)");
		lblexperiencesThatAppear.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblexperiencesThatAppear.setBounds(164, 12, 685, 29);
		panel_1.add(lblexperiencesThatAppear);
		
		JLabel lblaFalseBelief = new JLabel("(A false belief that a person won\u2019t change although most of evidence prove that the belief is incorrect)");
		lblaFalseBelief.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblaFalseBelief.setBounds(125, 49, 720, 29);
		panel_1.add(lblaFalseBelief);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(255, 240, 245));
		btnBack.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		btnBack.setBounds(314, 481, 84, 29);
		panel.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ocdSymptoms frame = new ocdSymptoms();
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
				JOptionPane.showMessageDialog(null, "These are the symptoms of psychological disorders, the system will try to diagnose based on your answer.");
			}
		});
		
		JButton btnNext = new JButton("Next");
		btnNext.setBackground(new Color(255, 240, 245));
		btnNext.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		btnNext.setBounds(524, 481, 84, 29);
		panel.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(checkBox_schS1.isSelected() && checkBox_schS2.isSelected() 
						&& checkBox_schS3.isSelected() && checkBox_schS4.isSelected()
						&& checkBox_schS5.isSelected() && checkBox_schS6.isSelected()
						&& checkBox_schS7.isSelected()) {
					
					results.schizophreniaResult frame = new results.schizophreniaResult();
					frame.setModalExclusionType(null);
					frame.setVisible(true);
					dispose();
					
					symptomsList = checkBox_schS1.getText() + "\n" + checkBox_schS2.getText()
					 + "\n" + checkBox_schS3.getText() + "\n" + checkBox_schS4.getText()
					 + "\n" + checkBox_schS5.getText() + "\n" + checkBox_schS6.getText()
					 + "\n" + checkBox_schS7.getText();
					
					System.out.print("Patient have Schizophrenia.");
				}
				
				else if(checkBox_schS1.isSelected() && checkBox_schS2.isSelected() 
						&& checkBox_schS3.isSelected() && checkBox_schS4.isSelected()
						&& checkBox_schS5.isSelected() && checkBox_schS6.isSelected()) {
					results.schizophreniaResult frame = new results.schizophreniaResult();
					frame.setModalExclusionType(null);
					frame.setVisible(true);
					dispose();
					
					symptomsList = checkBox_schS1.getText() + "\n" + checkBox_schS2.getText()
					 + "\n" + checkBox_schS3.getText() + "\n" + checkBox_schS4.getText()
					 + "\n" + checkBox_schS5.getText() + "\n" + checkBox_schS6.getText();
					
					System.out.print("Patient have Schizophrenia.");
				}
				
				else if(checkBox_schS1.isSelected() && checkBox_schS2.isSelected() 
						&& checkBox_schS3.isSelected() && checkBox_schS4.isSelected()
						&& checkBox_schS5.isSelected() && checkBox_schS7.isSelected()) {
					results.schizophreniaResult frame = new results.schizophreniaResult();
					frame.setModalExclusionType(null);
					frame.setVisible(true);
					dispose();
					
					symptomsList = checkBox_schS1.getText() + "\n" + checkBox_schS2.getText()
					 + "\n" + checkBox_schS3.getText() + "\n" + checkBox_schS4.getText()
					 + "\n" + checkBox_schS5.getText() + "\n" + checkBox_schS7.getText();
					
					System.out.print("Patient have Schizophrenia.");
				}
				
				else{
					depressionSymptoms frame = new depressionSymptoms();
					frame.setModalExclusionType(null);
					frame.setVisible(true);
					dispose();
					
					System.out.print("Patient does not have Schizophrenia.");
				}
			}
		});
	}
}
