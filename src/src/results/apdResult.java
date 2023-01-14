package results;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class apdResult extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					apdResult frame = new apdResult();
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
	public apdResult() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Psychological Disorders Diagnosis Expert System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(apdResult.class.getResource("/images/icon.png")));
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

		JLabel lblThank = new JLabel("Thank you for completing the questions.");
		lblThank.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblThank.setHorizontalAlignment(SwingConstants.CENTER);
		lblThank.setBounds(221, 26, 478, 29);
		panel.add(lblThank);
		
		JLabel lblExplain1 = new JLabel("After diagnosing your symptoms, we found that you may have the following psychological disorder:");
		lblExplain1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		lblExplain1.setHorizontalAlignment(SwingConstants.CENTER);
		lblExplain1.setBounds(48, 61, 836, 39);
		panel.add(lblExplain1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_1.setBackground(new Color(255, 240, 245));
		panel_1.setBounds(64, 116, 802, 276);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblDisorder = new JLabel("Antisocial Personality Disorder");
		lblDisorder.setFont(new Font("Yu Gothic UI", Font.BOLD, 28));
		lblDisorder.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisorder.setBounds(15, 49, 404, 50);
		panel_1.add(lblDisorder);
		
		JTextArea txtrExplain = new JTextArea();
		txtrExplain.setBackground(new Color(255, 240, 245));
		txtrExplain.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		txtrExplain.setText("Antisocial Personality Disorder is a disorder in \r\nwhich the patient consistently ignores right and \r\nwrong, and ignores the rights and feelings \r\nof others.");
		txtrExplain.setBounds(23, 129, 404, 105);
		txtrExplain.setEditable(false);
		panel_1.add(txtrExplain);
		
		JLabel lblImage = new JLabel(new ImageIcon(getClass().getResource("/images/apd.png")));
		lblImage.setBounds(442, 30, 330, 216);
		panel_1.add(lblImage);
		
		JLabel lblExplain3 = new JLabel("Based on your case, we recommend treatments for you to improve your condition.");
		lblExplain3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		lblExplain3.setHorizontalAlignment(SwingConstants.CENTER);
		lblExplain3.setBounds(129, 317, 694, 39);
		panel.add(lblExplain3);
		
		JLabel lblInst = new JLabel("You can click on 'How' to learn how it was diagnosed");
		lblInst.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblInst.setHorizontalAlignment(SwingConstants.CENTER);
		lblInst.setBounds(278, 437, 390, 29);
		panel.add(lblInst);
		
		JLabel lblInst1 = new JLabel("Please click the button below to check the treatments");
		lblInst1.setHorizontalAlignment(SwingConstants.CENTER);
		lblInst1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblInst1.setBounds(278, 408, 390, 29);
		panel.add(lblInst1);
		
		JButton btnHow = new JButton("How");
		btnHow.setBackground(new Color(255, 240, 245));
		btnHow.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		btnHow.setBounds(364, 481, 84, 29);
		panel.add(btnHow);
		btnHow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "The system diagnoses your psychological disorder based on the following symptoms:\n" 
													+ symptoms.apdSymptoms.symptomsList);
			}
		});
		
		JButton btnTreatment = new JButton("Treatments");
		btnTreatment.setBackground(new Color(255, 240, 245));
		btnTreatment.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		btnTreatment.setBounds(470, 481, 122, 29);
		panel.add(btnTreatment);
		btnTreatment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				treatments.apdTreatments frame = new treatments.apdTreatments();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
	}

}
