package symptoms;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import pages.startPage;

import javax.swing.JButton;
import javax.swing.JCheckBox;

public class anxietySymptoms extends JFrame {

	private JPanel contentPane;
	protected static String disorderType;
	protected static String Anxiety;

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
		
		JLabel lblTitle = new JLabel("Symptoms of Anxiety");
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
		panel_1.setBounds(118, 94, 678, 384);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox checkBox_anxS1 = new JCheckBox("Trouble sleeping");
		checkBox_anxS1.setBounds(41, 35, 334, 29);
		panel_1.add(checkBox_anxS1);
		
		JCheckBox checkBox_anxS2 = new JCheckBox("Trouble concentrating");
		checkBox_anxS2.setBounds(41, 72, 334, 29);
		panel_1.add(checkBox_anxS2);
		
		JCheckBox checkBox_anxS3 = new JCheckBox("Fatigue (feeling severely overtired)");
		checkBox_anxS3.setBounds(41, 109, 334, 29);
		panel_1.add(checkBox_anxS3);
		
		JCheckBox checkBox_anxS4 = new JCheckBox("Change in appetite");
		checkBox_anxS4.setBounds(41, 146, 334, 29);
		panel_1.add(checkBox_anxS4);
		
		JCheckBox checkBox_anxS5 = new JCheckBox("Irritability (get annoyed easily)");
		checkBox_anxS5.setBounds(41, 183, 334, 29);
		panel_1.add(checkBox_anxS5);
		
		JCheckBox checkBox_anxS6 = new JCheckBox("A feeling of hopeless or suicidal thought");
		checkBox_anxS6.setBounds(41, 220, 334, 29);
		panel_1.add(checkBox_anxS6);
		
		JCheckBox checkBox_anxS7 = new JCheckBox("Nervousness or sweating");
		checkBox_anxS7.setBounds(41, 257, 334, 29);
		panel_1.add(checkBox_anxS7);
		
		JButton btnWhy = new JButton("WHY?");
		btnWhy.setBounds(222, 328, 95, 29);
		panel_1.add(btnWhy);
		btnWhy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "These are the symptoms of Anxiety then the system will try to diagnose based on your answer.");
			}
		});
		
		JButton btnHow = new JButton("HOW?");
		btnHow.setBounds(381, 328, 95, 29);
		panel_1.add(btnHow);
		btnHow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Select the symptoms that you experienced for the system to diagnose.");
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(15, 481, 84, 29);
		panel.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pages.famMedicalHistory frame = new pages.famMedicalHistory();
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
				
				if(checkBox_anxS1.isSelected() && checkBox_anxS2.isSelected() 
						&& checkBox_anxS3.isSelected() && checkBox_anxS4.isSelected()
						&& checkBox_anxS5.isSelected() && checkBox_anxS6.isSelected()
						&& checkBox_anxS7.isSelected()) {
					disorderType = Anxiety;
					System.out.print("Patient have Anxiety.");
				}
				else if(checkBox_anxS1.isSelected() && checkBox_anxS2.isSelected() 
						&& checkBox_anxS3.isSelected() && checkBox_anxS4.isSelected()
						&& checkBox_anxS5.isSelected() && checkBox_anxS6.isSelected()) {
					disorderType = Anxiety;
					System.out.print("Patient have Anxiety.");
				}
				else if(checkBox_anxS1.isSelected() && checkBox_anxS2.isSelected() 
						&& checkBox_anxS3.isSelected() && checkBox_anxS4.isSelected()
						&& checkBox_anxS5.isSelected() && checkBox_anxS7.isSelected()) {
					disorderType = Anxiety;
					System.out.print("Patient have Anxiety.");
				}
				else{
					System.out.print("Patient does not have Anxiety.");
				}
				
				symptoms.ocdSymptoms frame = new symptoms.ocdSymptoms();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		
		
	}
	
	
}
