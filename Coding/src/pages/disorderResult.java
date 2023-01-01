package pages;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class disorderResult extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					disorderResult frame = new disorderResult();
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
	public disorderResult() {
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
		
		
		
		JLabel lblTitle = new JLabel("Psychological Disorder Diagnosis Expert System");
		lblTitle.setBounds(297, 56, 418, 20);
		panel.add(lblTitle);

		JLabel lblThank = new JLabel("Thank you for completing the questions");
		lblThank.setHorizontalAlignment(SwingConstants.CENTER);
		lblThank.setBounds(317, 122, 362, 20);
		panel.add(lblThank);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setBounds(186, 198, 544, 39);
		panel.add(lblResult);
		
		JLabel lblDisorder = new JLabel("Disorder");
		lblDisorder.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisorder.setBounds(419, 253, 69, 20);
		panel.add(lblDisorder);
		
		JLabel lblExplain = new JLabel("Explain");
		lblExplain.setHorizontalAlignment(SwingConstants.CENTER);
		lblExplain.setBounds(245, 279, 418, 39);
		panel.add(lblExplain);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(419, 407, 84, 29);
		panel.add(btnNext);
		
//		symptoms.anxietySymptoms anxiety = new symptoms.anxietySymptoms();
//		
//		if(symtomps.anxietySymptoms.){
//			int a = 1;
//			JLabel lblResult1 = new JLabel("Based on the symptoms you provided, we found that you have psychological disorder which is ...");
//			lblResult = lblResult1;
//			
//			JLabel lblExplain1 = new JLabel("Please click on the button below to view the treatments suggested for you to improve your condition.");
//			lblExplain = lblExplain1;
//			
//			JButton btnTreatment = new JButton("Your Treatment");
//			btnNext = btnTreatment;
//			btnTreatment.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent arg0) {
////					pages.showTreatments frame = new pages.showTreatments();
////					frame.setModalExclusionType(null);
////					frame.setVisible(true);
//					dispose();
//					*call method - 5 disorders
//					*if else
//				}
//			});
//		}
//		else {
//			int a = 2;
//			JLabel lblResult2 = new JLabel("Based on the symptoms you provided, we found that you does not have any psychological disorder.");
//			lblExplain = lblResult2;
//			
//			JLabel lblExplain2 = new JLabel("Please click on the button below to finish the diagnosis.");
//			lblExplain = lblExplain2;
//			
//			JButton btnNext1 = new JButton("Next");
//			btnNext = btnNext1;
//			btnNext1.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent arg0) {
////					pages.finalReport frame = new pages.finalReport();
////					frame.setModalExclusionType(null);
////					frame.setVisible(true);
//					dispose();
//				}
//			});
//		}
	}
}
