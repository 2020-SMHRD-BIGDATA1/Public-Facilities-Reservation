package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
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
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;

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
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(MyPageGUI.class.getResource("/img/frame.jpg")));
		frame.setBounds(500, 500, 450, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 0, 0));
		// 이미지 경로 새로운변수 , new image icon(변수);
		panel.setBounds(12, 10, 422, 541);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel text_NAME = new JLabel("\uC774\uB984");
		text_NAME.setFont(new Font("배달의민족 한나체 Air", Font.BOLD, 15));
		text_NAME.setHorizontalAlignment(SwingConstants.CENTER);
		text_NAME.setBounds(106, 129, 57, 15);
		panel.add(text_NAME);

		JLabel text_id = new JLabel("ID");
		text_id.setFont(new Font("배달의민족 한나체 Air", Font.BOLD, 15));
		text_id.setHorizontalAlignment(SwingConstants.CENTER);
		text_id.setBounds(106, 67, 57, 15);
		panel.add(text_id);

		JLabel text_phone = new JLabel("\uC804\uD654\uBC88\uD638");
		text_phone.setFont(new Font("배달의민족 한나체 Air", Font.BOLD, 15));
		text_phone.setHorizontalAlignment(SwingConstants.CENTER);
		text_phone.setBounds(89, 212, 74, 15);
		panel.add(text_phone);

		JLabel text_addr = new JLabel("\uC8FC\uC18C");
		text_addr.setFont(new Font("배달의민족 한나체 Air", Font.BOLD, 15));
		text_addr.setHorizontalAlignment(SwingConstants.CENTER);
		text_addr.setBounds(106, 254, 57, 15);
		panel.add(text_addr);

		JLabel text_Email = new JLabel("\uC774\uBA54\uC77C");
		text_Email.setFont(new Font("배달의민족 한나체 Air", Font.BOLD, 15));
		text_Email.setHorizontalAlignment(SwingConstants.CENTER);
		text_Email.setBounds(106, 301, 57, 15);
		panel.add(text_Email);

		JLabel lb_my = new JLabel("My Page");
		lb_my.setFont(new Font("배달의민족 한나는 열한살", Font.BOLD, 30));
		lb_my.setHorizontalAlignment(SwingConstants.CENTER);
		lb_my.setBounds(71, 10, 296, 41);
		panel.add(lb_my);

		JButton btnmdfy = new JButton("\uC218\uC815");
		btnmdfy.setBackground(Color.WHITE);
		btnmdfy.setBorderPainted(false);
		btnmdfy.setFont(new Font("배달의민족 한나체 Air", Font.BOLD, 15));
		btnmdfy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyPageGUI2 My2 = new MyPageGUI2();
				frame.setVisible(false);

			}
		});
		btnmdfy.setBounds(125, 502, 66, 39);
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
		text_Email_1.setFont(new Font("배달의민족 한나체 Air", Font.BOLD, 15));
		text_Email_1.setHorizontalAlignment(SwingConstants.CENTER);
		text_Email_1.setBounds(106, 342, 57, 15);
		panel.add(text_Email_1);

		JButton btnNewButton = new JButton("\uD3EC\uC778\uD2B8\uAD00\uB9AC");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("배달의민족 한나체 Air", Font.BOLD, 15));
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				PointGUI MyPoint = new PointGUI();
				frame.setVisible(false);

			}
		});
		btnNewButton.setBounds(225, 335, 109, 28);
		panel.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("\uB098\uC774");
		lblNewLabel.setFont(new Font("배달의민족 한나체 Air", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(106, 169, 57, 15);
		panel.add(lblNewLabel);

		JLabel lb_point = new JLabel("New label");
		lb_point.setBounds(173, 342, 118, 15);
		panel.add(lb_point);

		lb_point.setText(controller.getpoint() + "");

		JButton btnmdfy_1 = new JButton("\uD655\uC778");
		btnmdfy_1.setBackground(Color.WHITE);
		btnmdfy_1.setBorderPainted(false);
		btnmdfy_1.setFont(new Font("배달의민족 한나체 Air", Font.BOLD, 15));
		btnmdfy_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainGUI main = new MainGUI();
				frame.setVisible(false);

			}
		});
		btnmdfy_1.setBounds(225, 502, 66, 39);
		panel.add(btnmdfy_1);

		JLabel text_NAME_1 = new JLabel("PW");
		text_NAME_1.setFont(new Font("배달의민족 한나체 Air", Font.BOLD, 15));
		text_NAME_1.setHorizontalAlignment(SwingConstants.CENTER);
		text_NAME_1.setBounds(106, 95, 57, 15);
		panel.add(text_NAME_1);

		JLabel lb_email = new JLabel("New label");
		lb_email.setText(conn.getLoginUser().getMail());
		lb_email.setBounds(173, 301, 118, 15);
		panel.add(lb_email);

		JLabel lb_addr = new JLabel("New label");
		lb_addr.setText(conn.getLoginUser().getAddress());
		lb_addr.setBounds(173, 254, 118, 15);
		panel.add(lb_addr);

		JLabel lb_Phone = new JLabel("New label");
		lb_Phone.setText(conn.getLoginUser().getPhone());
		lb_Phone.setBounds(173, 212, 118, 15);
		panel.add(lb_Phone);

		JLabel lb_AGE = new JLabel("New label");
		lb_AGE.setText(conn.getLoginUser().getAge() + "");
		lb_AGE.setBounds(173, 169, 118, 15);
		panel.add(lb_AGE);

		JLabel lb_NAME = new JLabel("New label");
		lb_NAME.setText(conn.getLoginUser().getName());
		lb_NAME.setBounds(173, 129, 118, 15);
		panel.add(lb_NAME);

		JLabel lb_PW = new JLabel("New label");
		lb_PW.setText(conn.getLoginUser().getPw());
		lb_PW.setBounds(173, 95, 118, 15);
		panel.add(lb_PW);

		JLabel lb_ID = new JLabel("New label");
		lb_ID.setText(conn.getLoginUser().getId());
		lb_ID.setBounds(173, 67, 118, 15);
		panel.add(lb_ID);

		JButton btn예약확인 = new JButton("\uC608\uC57D\uD655\uC778");
		btn예약확인.setBackground(Color.WHITE);
		btn예약확인.setBorderPainted(false);
		btn예약확인.setFont(new Font("배달의민족 한나체 Air", Font.BOLD, 15));
		btn예약확인.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				confirmGUI con = new confirmGUI();
//				con.view("");

				tableUpdateGUI table = new tableUpdateGUI();
			}
		});
		btn예약확인.setBounds(38, 423, 97, 41);
		panel.add(btn예약확인);

		JButton btnback = new JButton("");
		btnback.setIcon(new ImageIcon(MyPageGUI.class.getResource("/img/prev.jpg")));
		btnback.setFont(new Font("굴림", Font.BOLD, 12));
		btnback.setBackground(Color.WHITE);
		btnback.setBorderPainted(false);
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				MainGUI main = new MainGUI();
			}
		});
		btnback.setBounds(12, 10, 23, 23);
		panel.add(btnback);
		
//		JButton btn예약확인_1 = new JButton("\uB85C\uADF8\uC544\uC6C3");
//		btn예약확인_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.dispose();
//				
//			}
//		});
//		btn예약확인_1.setFont(new Font("Dialog", Font.BOLD, 15));
//		btn예약확인_1.setBorderPainted(false);
//		btn예약확인_1.setBackground(Color.WHITE);
//		btn예약확인_1.setBounds(237, 423, 97, 41);
//		panel.add(btn예약확인_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(MyPageGUI.class.getResource("/img/back2.png")));
		lblNewLabel_3.setBounds(0, 0, 434, 561);
		frame.getContentPane().add(lblNewLabel_3);

	}
}
