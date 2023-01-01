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

public class apdSymptoms extends JFrame {

	private JPanel contentPane;

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
		
		JLabel lblTitle = new JLabel("Symptoms of Antisocial Personality Disorder (APD)");
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
		panel_1.setBounds(116, 102, 678, 370);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox checkBox_apdS1 = new JCheckBox("Be physically aggressive");
		checkBox_apdS1.setBounds(46, 31, 334, 29);
		panel_1.add(checkBox_apdS1);
		
		JCheckBox checkBox_apdS2 = new JCheckBox("Arrogance, a sense of superiority and being extremely opinionated");
		checkBox_apdS2.setBounds(46, 68, 334, 29);
		panel_1.add(checkBox_apdS2);
		
		JCheckBox checkBox_apdS3 = new JCheckBox("Breaking the law");
		checkBox_apdS3.setBounds(46, 105, 334, 29);
		panel_1.add(checkBox_apdS3);
		
		JCheckBox checkBox_apdS4 = new JCheckBox("Violence");
		checkBox_apdS4.setBounds(46, 142, 334, 29);
		panel_1.add(checkBox_apdS4);
		
		JCheckBox checkBox_apdS5 = new JCheckBox("Manipulate or deceive others for personal gain or personal pleasure");
		checkBox_apdS5.setBounds(46, 182, 334, 29);
		panel_1.add(checkBox_apdS5);
		
		JCheckBox checkBox_apdS6 = new JCheckBox("Unnecessary risk-taking or dangerous behavior with no regard for the safety of self or others");
		checkBox_apdS6.setBounds(46, 230, 334, 29);
		panel_1.add(checkBox_apdS6);
		
		JCheckBox checkBox_apdS7 = new JCheckBox("Blame others for their problems");
		checkBox_apdS7.setBounds(46, 267, 334, 29);
		panel_1.add(checkBox_apdS7);
		
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
				symptoms.depressionSymptoms frame = new symptoms.depressionSymptoms();
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
				pages.disorderResult frame = new pages.disorderResult();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
	}

}
