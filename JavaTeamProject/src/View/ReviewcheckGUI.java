package View;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Controller.GradeController;
import Controller.Reservation_1Controller;
import Model.GradeDAO;
import Model.GradeVO;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ReviewcheckGUI {

	private JFrame frame;
	private JLabel output;
	private Font userReview;
	private GradeController controller;
	private String gg = null; 
	
	Reservation_1Controller re_controller= new Reservation_1Controller();
	GradeDAO dao= new GradeDAO();
	public ReviewcheckGUI(GradeVO userReview) {
		initialize(userReview);
		
		frame.setVisible(true);
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(GradeVO userReview) {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(ReviewcheckGUI.class.getResource("/img/frame.jpg")));
		frame.getContentPane().setBackground(new Color(255, 235, 205));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(500, 500, 450, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		GradeDAO dao = new GradeDAO();
		String gg = "�ȳ�";
		String gg2="�ȳ�";
		String gg3="�ȳ�";
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("����ǹ��� �ѳ�ü Air", Font.BOLD,15));
		lblNewLabel_1.setForeground(new Color(255, 215, 0));
		lblNewLabel_1.setBounds(25, 132, 121, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_1.setText(LoginGUI.controller.getLoginUser().getId()+"��");
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(ReviewcheckGUI.class.getResource("/MainImages/go to prev.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyPageGUI my = new MyPageGUI();
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(12, 10, 23, 14);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB0B4\uB9AC\uBDF0\uBCF4\uAE30");
		lblNewLabel.setBounds(132, 62, 201, 53);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("����ǹ��� �ѳ��� ���ѻ�", Font.BOLD,30));
		
		
		JLabel output3 = new JLabel("New label");
		output3.setForeground(Color.ORANGE);
		output3.setBounds(236, 260, 162, 114);
		panel.add(output3);
		output3.setFont(new Font("����ǹ��� �ѳ�ü Air", Font.BOLD,15));
		output3.setHorizontalAlignment(SwingConstants.CENTER);
		
		output3.setText("REVIEW");
		
		output3.setText(userReview.getReview());
		
		JLabel output2 = new JLabel("New label");
		output2.setForeground(Color.ORANGE);
		output2.setBounds(134, 260, 90, 114);
		panel.add(output2);
		output2.setFont(new Font("����ǹ��� �ѳ�ü Air", Font.BOLD,15));
		output2.setHorizontalAlignment(SwingConstants.CENTER);
		
		output2.setText("RATING");
		
		output2.setText(userReview.getRating());
		
		JLabel output_1 = new JLabel("New label");
		output_1.setForeground(Color.ORANGE);
		output_1.setBounds(27, 263, 93, 111);
		panel.add(output_1);
		output_1.setText(userReview.getName());
		
		output_1.setFont(new Font("����ǹ��� �ѳ�ü Air", Font.BOLD,15));
		output_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel output_1_1 = new JLabel("\uC2DC\uC124\uBA85");
		output_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		output_1_1.setForeground(new Color(255, 215, 0));
		output_1_1.setFont(new Font("Dialog", Font.BOLD, 15));
		output_1_1.setBounds(27, 170, 93, 113);
		panel.add(output_1_1);
		
		JLabel output2_1 = new JLabel("\uD3C9\uC810");
		output2_1.setHorizontalAlignment(SwingConstants.CENTER);
		output2_1.setForeground(new Color(255, 215, 0));
		output2_1.setFont(new Font("Dialog", Font.BOLD, 15));
		output2_1.setBounds(134, 173, 90, 110);
		panel.add(output2_1);
		
		JLabel output3_1 = new JLabel("\uB9AC\uBDF0");
		output3_1.setHorizontalAlignment(SwingConstants.CENTER);
		output3_1.setForeground(new Color(255, 215, 0));
		output3_1.setFont(new Font("Dialog", Font.BOLD, 15));
		output3_1.setBounds(236, 167, 162, 116);
		panel.add(output3_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(ReviewcheckGUI.class.getResource("/MainImages/image1.png")));
		lblNewLabel_2.setBounds(0, 0, 434, 561);
		panel.add(lblNewLabel_2);
	}
}
