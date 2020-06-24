package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Model.MainDAO;
import Model.MainVO;

import Controller.MemberManagementSystem;
import Controller.Reservation_1Controller;
import Model.MemberVO;




import Controller.MainSystemCon;
import Controller.MemberManagementSystem;
import Model.MemberVO;



import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyPageGUI {

	private JFrame frame;
	MainDAO dao = new MainDAO();

	Reservation_1Controller controller = new Reservation_1Controller();
	MemberManagementSystem conn = LoginGUI.controller;

	MainSystemCon con = new MainSystemCon();

	public MyPageGUI() {
		initialize();
		frame.setVisible(true);

	}

	LoginGUI login = new LoginGUI();

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 360, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		// 이미지 경로 새로운변수 , new image icon(변수);
		panel.setBounds(12, 10, 320, 541);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel text_NAME = new JLabel("\uC774\uB984");
		text_NAME.setHorizontalAlignment(SwingConstants.CENTER);
		text_NAME.setBounds(47, 119, 57, 15);
		panel.add(text_NAME);

		JLabel text_id = new JLabel("ID");
		text_id.setHorizontalAlignment(SwingConstants.CENTER);
		text_id.setBounds(47, 57, 57, 15);
		panel.add(text_id);

		JLabel text_phone = new JLabel("\uC804\uD654\uBC88\uD638");
		text_phone.setHorizontalAlignment(SwingConstants.CENTER);
		text_phone.setBounds(47, 202, 57, 15);
		panel.add(text_phone);

		JLabel text_addr = new JLabel("\uC8FC\uC18C");
		text_addr.setHorizontalAlignment(SwingConstants.CENTER);
		text_addr.setBounds(47, 244, 57, 15);
		panel.add(text_addr);

		JLabel text_Email = new JLabel("\uC774\uBA54\uC77C");
		text_Email.setHorizontalAlignment(SwingConstants.CENTER);
		text_Email.setBounds(47, 291, 57, 15);
		panel.add(text_Email);

		JLabel lb_my = new JLabel("My Page");
		lb_my.setHorizontalAlignment(SwingConstants.CENTER);
		lb_my.setBounds(12, 10, 296, 56);
		panel.add(lb_my);

		JButton btnmdfy = new JButton("\uC218\uC815");
		btnmdfy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyPageGUI2 My2 = new MyPageGUI2();

			}
		});
		btnmdfy.setBounds(47, 460, 97, 23);
		panel.add(btnmdfy);

//		inPutPW = new JTextField();
//		inPutPW.setColumns(10);
//		inPutPW.setBounds(116, 209, 116, 21);
//		panel.add(inPutPW);
//		
//		inPutPhone = new JTextField();
//		inPutPhone.setColumns(10);
//		inPutPhone.setBounds(116, 259, 116, 21);
//		panel.add(inPutPhone);
//		
//		inPutaddr = new JTextField();
//		inPutaddr.setColumns(10);
//		inPutaddr.setBounds(116, 301, 116, 21);
//		panel.add(inPutaddr);
//		
//		inPutEmail = new JTextField();
//		inPutEmail.setColumns(10);
//		inPutEmail.setBounds(116, 348, 116, 21);
//		panel.add(inPutEmail);

		JLabel text_Email_1 = new JLabel("\uD3EC\uC778\uD2B8");
		text_Email_1.setHorizontalAlignment(SwingConstants.CENTER);
		text_Email_1.setBounds(47, 332, 57, 15);
		panel.add(text_Email_1);

		JButton btnNewButton = new JButton("\uAD00\uB9AC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PointGUI MyPoint = new PointGUI();

			}
		});
		btnNewButton.setBounds(244, 325, 64, 28);
		panel.add(btnNewButton);
		
		
		
		


		JLabel lblNewLabel = new JLabel("\uB098\uC774");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(47, 159, 57, 15);
		panel.add(lblNewLabel);

		JLabel lb_point = new JLabel("New label");
		lb_point.setBounds(114, 332, 118, 15);
		panel.add(lb_point);

		lb_point.setText(controller.getpoint() + "");

		JButton btnmdfy_1 = new JButton("\uD655\uC778");
		btnmdfy_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);

			}
		});
		btnmdfy_1.setBounds(166, 460, 97, 23);
		panel.add(btnmdfy_1);

		JLabel text_NAME_1 = new JLabel("PW");
		text_NAME_1.setHorizontalAlignment(SwingConstants.CENTER);
		text_NAME_1.setBounds(47, 85, 57, 15);
		panel.add(text_NAME_1);

		JLabel lb_email = new JLabel("New label");
		lb_email.setText(conn.getLoginUser().getMail());
		lb_email.setBounds(114, 291, 118, 15);
		panel.add(lb_email);

		JLabel lb_addr = new JLabel("New label");
		lb_addr.setText(conn.getLoginUser().getAddress());
		lb_addr.setBounds(114, 244, 118, 15);
		panel.add(lb_addr);

		JLabel lb_Phone = new JLabel("New label");
		lb_Phone.setText(conn.getLoginUser().getPhone());
		lb_Phone.setBounds(114, 202, 118, 15);
		panel.add(lb_Phone);

		JLabel lb_AGE = new JLabel("New label");
		lb_AGE.setText(conn.getLoginUser().getAge() + "");
		lb_AGE.setBounds(116, 159, 118, 15);
		panel.add(lb_AGE);

		JLabel lb_NAME = new JLabel("New label");
		lb_NAME.setText(conn.getLoginUser().getName());
		lb_NAME.setBounds(114, 119, 118, 15);
		panel.add(lb_NAME);

		JLabel lb_PW = new JLabel("New label");
		lb_PW.setText(conn.getLoginUser().getPw());
		lb_PW.setBounds(114, 85, 118, 15);
		panel.add(lb_PW);

		JLabel lb_ID = new JLabel("New label");
		lb_ID.setText(conn.getLoginUser().getId());
		lb_ID.setBounds(114, 57, 118, 15);
		panel.add(lb_ID);

		JButton btn예약확인 = new JButton("\uC608\uC57D\uD655\uC778");
		btn예약확인.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btn예약확인.setBounds(103, 411, 97, 23);
		panel.add(btn예약확인);
		
		JButton btnNewButton_1 = new JButton("\uB9AC\uBDF0\uC4F0\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GradeGUI gradegui= new GradeGUI();
			}
		});
		btnNewButton_1.setBounds(211, 363, 97, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("\uB9AC\uBDF0\uBCF4\uAE30");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReviewcheckGUI review= new ReviewcheckGUI();
			}
		});
		btnNewButton_1_1.setBounds(211, 385, 97, 23);
		panel.add(btnNewButton_1_1);

	}
}
