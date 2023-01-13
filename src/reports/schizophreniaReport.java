package reports;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import pages.famMedicalHistory;
import pages.pMedicalHistory;
import pages.personalInfo;

public class schizophreniaReport extends JFrame {

	private JPanel contentPane;
	String pGender;
	String pHistory;
	String pFamHistory;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					schizophreniaReport frame = new schizophreniaReport();
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
	public schizophreniaReport() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Psychological Disorders Diagnosis Expert System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(schizophreniaReport.class.getResource("/images/icon.png")));
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
		
		JLabel lblTitle = new JLabel("Psychological Disorders Diagnosis Expert System Diagnostic Report");
		lblTitle.setFont(new Font("Yu Gothic UI", Font.BOLD, 24));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(93, 16, 753, 47);
		panel.add(lblTitle);
		
		JLabel lblInst1 = new JLabel("This is an auto-generated report. You may take this report to the therapist.");
		lblInst1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblInst1.setBounds(136, 75, 537, 29);
		panel.add(lblInst1);
		
		if(personalInfo.rdbtnMale.isSelected()) {
			pGender = "Male";
		}
		else if(personalInfo.rdbtnFemale.isSelected()) {
			pGender = "Female";
		}
		
		if(pMedicalHistory.rdbtnYes.isSelected()) {
			pHistory = "Yes, ";
		}
		else if(pMedicalHistory.rdbtnNo.isSelected()) {
			pHistory = "No";
		}
		if(famMedicalHistory.rdbtnYes.isSelected()) {
			pFamHistory = "Yes, ";
		}
		else if(famMedicalHistory.rdbtnNo.isSelected()) {
			pFamHistory = "No";
		}
		
		JTextArea txtrReport = new JTextArea();
		txtrReport.setBounds(79, 114, 767, 351);
		panel.add(txtrReport);
		txtrReport.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
		txtrReport.setText("\t\t           Patient's Information"
				+ "\r\n\nName: Mr./Ms. " + pages.personalInfo.textField_name.getText()
				+ "\r\nPhone no: " + pages.personalInfo.textField_phone.getText()
				+ "\r\nAge: " + pages.personalInfo.textField_age.getText()
				+ "\r\nGender: " + pGender
				+ "\r\nOccupation: " + pages.personalInfo.textField_occupation.getText()
				+ "\r\nDoes the patient have a history of psychological disorders? " + pHistory + pages.pMedicalHistory.textField_illness.getText()
				+ "\r\nDoes the patient's family have a psychological disorder? " + pFamHistory + pages.famMedicalHistory.textField_famIllness.getText()
				+ "\r\n-------------------------------------------------------------------------------------------------------------"
				+ "\r\n\t\t             Diagnostic Result"
				+ "\r\n\nPatient's psychological disorder: Schizophrenia"
				+ "\r\nTreatments: Psychotherapy, Medication, Electroconvulsive therapy (ECT), Psychosocial interventions\r\n");
		txtrReport.setEditable(false);

		JButton btnPrint = new JButton("Print");
		btnPrint.setBackground(new Color(255, 240, 245));
		btnPrint.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		btnPrint.setBounds(289, 481, 84, 29);
		panel.add(btnPrint);
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					txtrReport.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("There is no printer to be found.", e.getMessage());
				}
			}
		});
		
		
		JButton btnDiagnose = new JButton("Diagnose Again");
		btnDiagnose.setBackground(new Color(255, 240, 245));
		btnDiagnose.setBounds(386, 481, 168, 29);
		panel.add(btnDiagnose);
		btnDiagnose.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		btnDiagnose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				symptoms.anxietySymptoms frame = new symptoms.anxietySymptoms();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(255, 240, 245));
		btnExit.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		btnExit.setBounds(566, 481, 84, 29);
		panel.add(btnExit);		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

}
