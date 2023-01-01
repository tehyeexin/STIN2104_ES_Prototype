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

public class depressionSymptoms extends JFrame {

	private JPanel contentPane;

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
		
		JLabel lblTitle = new JLabel("Symptoms of Depression");
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
		panel_1.setBounds(116, 102, 678, 374);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox checkBox_depS1 = new JCheckBox("Feelings of sadness, tearfulness, emptiness or hopelessness");
		checkBox_depS1.setBounds(23, 22, 334, 29);
		panel_1.add(checkBox_depS1);
		
		JCheckBox checkBox_depS2 = new JCheckBox("Angry outbursts, irritability or frustration, even over small matters");
		checkBox_depS2.setBounds(23, 59, 334, 29);
		panel_1.add(checkBox_depS2);
		
		JCheckBox checkBox_depS3 = new JCheckBox("Loss of interest in hobbies and interests you once enjoyed");
		checkBox_depS3.setBounds(23, 96, 334, 29);
		panel_1.add(checkBox_depS3);
		
		JCheckBox checkBox_depS4 = new JCheckBox("Sleep disturbances, including insomnia or sleeping too much");
		checkBox_depS4.setBounds(23, 133, 334, 29);
		panel_1.add(checkBox_depS4);
		
		JCheckBox checkBox_depS5 = new JCheckBox("Feelings of worthlessness or guilt, fixating on past failures or self-blame");
		checkBox_depS5.setBounds(23, 170, 334, 29);
		panel_1.add(checkBox_depS5);
		
		JCheckBox checkBox_depS6 = new JCheckBox("Trouble thinking, concentrating, making decisions, and remembering things");
		checkBox_depS6.setBounds(23, 207, 334, 29);
		panel_1.add(checkBox_depS6);
		
		JCheckBox checkBox_depS7 = new JCheckBox("Frequent or recurrent thoughts of death, suicidal thoughts, suicide attempts or suicide");
		checkBox_depS7.setBounds(23, 244, 334, 29);
		panel_1.add(checkBox_depS7);
		
		JButton btnWhy = new JButton("WHY?");
		btnWhy.setBounds(222, 328, 95, 29);
		panel_1.add(btnWhy);
		btnWhy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "System will...");
			}
		});
		
		JButton btnHow = new JButton("HOW?");
		btnHow.setBounds(381, 328, 95, 29);
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
				symptoms.schizophreniaSymptoms frame = new symptoms.schizophreniaSymptoms();
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
				symptoms.apdSymptoms frame = new symptoms.apdSymptoms();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
	}

}
