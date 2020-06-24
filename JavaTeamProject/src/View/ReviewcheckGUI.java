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
import javax.swing.JButton;

public class ReviewcheckGUI {

	private JFrame frame;
	private JLabel output;
	private Font userReview;
	private GradeController controller;
	private String gg = null; 
	
	Reservation_1Controller re_controller= new Reservation_1Controller();
	GradeDAO dao= new GradeDAO();
	public ReviewcheckGUI() {
		initialize();
		
		frame.setVisible(true);
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 360, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB0B4\uB9AC\uBDF0\uBCF4\uAE30");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("���� ����", Font.BOLD, 17));
		lblNewLabel.setBounds(85, 59, 153, 53);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel output = new JLabel("New label");
		output.setFont(new Font("���� ����", Font.BOLD, 15));
		output.setHorizontalAlignment(SwingConstants.CENTER);
		output.setBounds(28, 150, 50, 201);
		
		GradeDAO dao = new GradeDAO();
		String gg = "�ȳ�";
		String gg2="�ȳ�";
		String gg3="�ȳ�";
		
		ArrayList<GradeVO> result = dao.search(gg);
		for (int i = 0; i < result.size(); i++) {
			gg += result.get(i).getName();
			gg2+=result.get(i).getRating();
			gg3+=result.get(i).getReview();
		}
		output.setText("\uC2DC\uC124\uBA85");
		
		
		
		
		frame.getContentPane().add(output);
		
		JLabel output2 = new JLabel("New label");
		output2.setFont(new Font("���� ����", Font.BOLD, 15));
		output2.setHorizontalAlignment(SwingConstants.CENTER);
		output2.setBounds(113, 153, 57, 194);
				
		frame.getContentPane().add(output2);
		
		output2.setText("RATING");
		
		output2.setText(dao.select().getRating());
		
		
		JLabel output3 = new JLabel("New label");
		output3.setFont(new Font("���� ����", Font.BOLD, 15));
		output3.setHorizontalAlignment(SwingConstants.CENTER);
		output3.setBounds(158, 147, 162, 206);
		frame.getContentPane().add(output3);
		
		output3.setText("REVIEW");
		
		output3.setText(dao.select().getReview());
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("���� ����", Font.BOLD, 15));
		lblNewLabel_1.setBounds(25, 132, 121, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_1.setText(LoginGUI.controller.getLoginUser().getId()+"��");
	}
}
