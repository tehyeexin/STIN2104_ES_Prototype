package treatments;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class ocdTreatments extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ocdTreatments frame = new ocdTreatments();
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
	public ocdTreatments() {
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
		
		JLabel lblTitle = new JLabel("Treatments for Obsessive-Compulsive Disorder");
		lblTitle.setFont(new Font("Yu Gothic UI", Font.BOLD, 25));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(198, 16, 542, 47);
		panel.add(lblTitle);
		
		JLabel lblInst = new JLabel("Here is the treatments for Obsessive-Compulsive Disorder that are recommended for you.");
		lblInst.setForeground(Color.BLACK);
		lblInst.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		lblInst.setBounds(40, 67, 731, 27);
		panel.add(lblInst);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_1.setBackground(new Color(255, 240, 245));
		panel_1.setBounds(40, 104, 860, 332);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbl_anxT1 = new JLabel("Psychotherapy");
		lbl_anxT1.setForeground(SystemColor.desktop);
		lbl_anxT1.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		lbl_anxT1.setBounds(27, 16, 159, 27);
		panel_1.add(lbl_anxT1);
		
		JLabel lbl_anxT2 = new JLabel("Medication");
		lbl_anxT2.setForeground(SystemColor.desktop);
		lbl_anxT2.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		lbl_anxT2.setBounds(27, 134, 143, 27);
		panel_1.add(lbl_anxT2);
		
		JLabel lbl_anxT3 = new JLabel("Deep brain stimulation (DBS) ");
		lbl_anxT3.setForeground(SystemColor.desktop);
		lbl_anxT3.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		lbl_anxT3.setBounds(27, 228, 271, 27);
		panel_1.add(lbl_anxT3);
		
		JTextArea textrT1 = new JTextArea();
		textrT1.setBackground(new Color(255, 240, 245));
		textrT1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		textrT1.setText("Exposure and response prevention (ERP) involves gradually exposing you to a feared object or obsession and having you \r\nlearn ways to resist the urge to do your compulsive rituals. Mindfulness-based cognitive therapy involves learning \r\nmindfulness skills to cope with distress triggered by obsessive thoughts.");
		textrT1.setBounds(27, 48, 807, 70);
		textrT1.setEditable(false);
		panel_1.add(textrT1);
		
		JTextArea textrT2 = new JTextArea();
		textrT2.setBackground(new Color(255, 240, 245));
		textrT2.setText("Certain psychiatric medications can help control the obsessions and compulsions of OCD. Selective serotonin \r\nreuptake inhibitors (SSRIs), tricyclic antidepressant clomipramine (Anafranil), antipsychotics like aripiprazole (Abilify)");
		textrT2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		textrT2.setBounds(27, 165, 807, 48);
		textrT2.setEditable(false);
		panel_1.add(textrT2);
		
		JTextArea textrT3 = new JTextArea();
		textrT3.setBackground(new Color(255, 240, 245));
		textrT3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		textrT3.setText("Deep brain stimulation (DBS) is approved by the FDA, involves implanting electrodes within certain areas of your \r\nbrain. These electrodes produce electrical impulses that may help regulate abnormal impulses.");
		textrT3.setBounds(27, 258, 807, 48);
		textrT2.setEditable(false);
		panel_1.add(textrT3);
		
		JLabel lblInst1 = new JLabel("Please click the button below to view the diagnostic report");
		lblInst1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblInst1.setHorizontalAlignment(SwingConstants.CENTER);
		lblInst1.setBounds(263, 445, 425, 29);
		panel.add(lblInst1);
			
		JButton btnReport = new JButton("Report");
		btnReport.setBackground(new Color(255, 240, 245));
		btnReport.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		btnReport.setBounds(424, 481, 91, 29);
		panel.add(btnReport);
		btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				reports.ocdReport frame = new reports.ocdReport();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
	}

}
