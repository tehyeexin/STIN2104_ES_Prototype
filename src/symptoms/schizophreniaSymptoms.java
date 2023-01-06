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

public class schizophreniaSymptoms extends JFrame {

	private JPanel contentPane;

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
		
		JLabel lblTitle = new JLabel("Symptoms of Schizophrenia");
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
		panel_1.setBounds(121, 102, 678, 368);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox checkBox_schS1 = new JCheckBox("Hallucinations (experiences that appear real but are created by your mind includes visions, sounds, or smells");
		checkBox_schS1.setBounds(25, 25, 334, 29);
		panel_1.add(checkBox_schS1);
		
		JCheckBox checkBox_schS2 = new JCheckBox("Delusions (A false belief that a person won’t change although most of evidence prove that the belief is incorrect");
		checkBox_schS2.setBounds(25, 62, 334, 29);
		panel_1.add(checkBox_schS2);
		
		JCheckBox checkBox_schS3 = new JCheckBox("Disorganized thinking or speech");
		checkBox_schS3.setBounds(25, 99, 334, 29);
		panel_1.add(checkBox_schS3);
		
		JCheckBox checkBox_schS4 = new JCheckBox("A lack of emotion or expressions");
		checkBox_schS4.setBounds(25, 136, 334, 29);
		panel_1.add(checkBox_schS4);
		
		JCheckBox checkBox_schS5 = new JCheckBox("Forgetfulness");
		checkBox_schS5.setBounds(25, 173, 334, 29);
		panel_1.add(checkBox_schS5);
		
		JCheckBox checkBox_schS6 = new JCheckBox("Social isolation");
		checkBox_schS6.setBounds(25, 210, 334, 29);
		panel_1.add(checkBox_schS6);
		
		JCheckBox checkBox_schS7 = new JCheckBox("Loss of interest or excitement for life");
		checkBox_schS7.setBounds(25, 247, 334, 29);
		panel_1.add(checkBox_schS7);
		
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
				symptoms.ocdSymptoms frame = new symptoms.ocdSymptoms();
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
				symptoms.depressionSymptoms frame = new symptoms.depressionSymptoms();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
	}

}
