package View;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Controller.MemberManagementSystem;
import Controller.Reservation_1Controller;
import Model.MainDAO;
import Model.MemberVO;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Font;

public class MyPageGUI2 {

	private JFrame frame;
	private JTextField inPutidPhone;
	private JTextField inPutidAddr;
	private JTextField inPutEmail;
	private JTextField inPutidName;
	private JTextField inPutidAge;
	private JTextField inPutidPW;
	MainDAO dao = new MainDAO();
	MemberManagementSystem conn= LoginGUI.controller;
	Reservation_1Controller controller= new Reservation_1Controller();
	public MyPageGUI2() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\SMHRD\\Desktop\\image\\frame.jpg"));
		frame.setBounds(100, 100, 450, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 422, 551);
		panel.setBackground(new Color(255,0,0,0));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel text_NAME = new JLabel("\uC774\uB984");
		text_NAME.setFont(new Font("배달의민족 한나는 열한살", Font.BOLD,15));
		text_NAME.setHorizontalAlignment(SwingConstants.CENTER);
		text_NAME.setBounds(104, 179, 57, 15);
		panel.add(text_NAME);
		
		JLabel text_id = new JLabel("ID");
		text_id.setFont(new Font("배달의민족 한나는 열한살", Font.BOLD,15));
		text_id.setHorizontalAlignment(SwingConstants.CENTER);
		text_id.setBounds(104, 117, 57, 15);
		panel.add(text_id);
		
		JLabel text_phone = new JLabel("\uC804\uD654\uBC88\uD638");
		text_phone.setFont(new Font("배달의민족 한나는 열한살", Font.BOLD,15));
		text_phone.setHorizontalAlignment(SwingConstants.CENTER);
		text_phone.setBounds(86, 262, 75, 15);
		panel.add(text_phone);
		
		JLabel text_addr = new JLabel("\uC8FC\uC18C");
		text_addr.setFont(new Font("배달의민족 한나는 열한살", Font.BOLD,15));
		text_addr.setHorizontalAlignment(SwingConstants.CENTER);
		text_addr.setBounds(104, 304, 57, 15);
		panel.add(text_addr);
		
		JLabel text_Email = new JLabel("\uC774\uBA54\uC77C");
		text_Email.setFont(new Font("배달의민족 한나는 열한살", Font.BOLD,15));
		text_Email.setHorizontalAlignment(SwingConstants.CENTER);
		text_Email.setBounds(104, 351, 57, 15);
		panel.add(text_Email);
		
		JLabel lblNewLabel_2 = new JLabel("My Page");
		lblNewLabel_2.setFont(new Font("배달의민족 한나는 열한살", Font.BOLD,30));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(69, 10, 296, 56);
		panel.add(lblNewLabel_2);
		
		JButton btnmdfy = new JButton("\uC218\uC815");
		btnmdfy.setBackground(Color.WHITE);
		btnmdfy.setFont(new Font("배달의민족 한나는 열한살", Font.BOLD,15));
		btnmdfy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				String pw = inPutidPW.getText();
				String name =inPutidName.getText();
				int age = Integer.parseInt(inPutidAge.getText());
				String phone =inPutidPhone.getText();
				String address =inPutidAddr.getText();
				String mail =inPutEmail.getText();
				
				MemberVO vo = new MemberVO(pw, name, age, phone, address, mail);
				
				
				int cnt = dao.update(vo);
				// 1이면성공 0이면 실패

				if (cnt > 0) {
					JOptionPane.showMessageDialog(frame, "수정성공", "수정 결과", JOptionPane.PLAIN_MESSAGE);
					frame.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(frame, "수정실패", "수정 결과", JOptionPane.PLAIN_MESSAGE);
				}
			
			}
		});
		btnmdfy.setBounds(120, 461, 66, 39);
		panel.add(btnmdfy);

		inPutidPhone = new JTextField();
		inPutidPhone.setColumns(10);
		inPutidPhone.setBounds(173, 259, 116, 21);
		panel.add(inPutidPhone);
		
		inPutidAddr = new JTextField();
		inPutidAddr.setColumns(10);
		inPutidAddr.setBounds(173, 301, 116, 21);
		panel.add(inPutidAddr);
		
		inPutEmail = new JTextField();
		inPutEmail.setColumns(10);
		inPutEmail.setBounds(173, 348, 116, 21);
		panel.add(inPutEmail);
		
		JLabel text_Email_1 = new JLabel("\uD3EC\uC778\uD2B8");
		text_Email_1.setFont(new Font("배달의민족 한나는 열한살", Font.BOLD,15));
		text_Email_1.setHorizontalAlignment(SwingConstants.CENTER);
		text_Email_1.setBounds(104, 392, 57, 15);
		panel.add(text_Email_1);
		
		inPutidName = new JTextField();
		inPutidName.setColumns(10);
		inPutidName.setBounds(173, 176, 116, 21);
		panel.add(inPutidName);
		
		inPutidAge = new JTextField();
		inPutidAge.setColumns(10);
		inPutidAge.setBounds(173, 216, 116, 21);
		panel.add(inPutidAge);
		
		JLabel lblNewLabel = new JLabel("\uB098\uC774");
		lblNewLabel.setFont(new Font("배달의민족 한나는 열한살", Font.BOLD,15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(104, 219, 57, 15);
		panel.add(lblNewLabel);
		
		JButton btnmdfy_1 = new JButton("\uD655\uC778");
		btnmdfy_1.setBackground(Color.WHITE);
		btnmdfy_1.setFont(new Font("배달의민족 한나는 열한살", Font.BOLD,15));
		btnmdfy_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				
			
			}
		});
		btnmdfy_1.setBounds(239, 461, 66, 39);
		panel.add(btnmdfy_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MyPageGUI2.class.getResource("/img/back2.png")));
		lblNewLabel_1.setBounds(0, 0, 434, 561);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel text_NAME_1 = new JLabel("PW");
		text_NAME_1.setFont(new Font("배달의민족 한나는 열한살", Font.BOLD,15));
		text_NAME_1.setHorizontalAlignment(SwingConstants.CENTER);
		text_NAME_1.setBounds(104, 145, 57, 15);
		panel.add(text_NAME_1);
		
		inPutidPW = new JTextField();
		inPutidPW.setColumns(10);
		inPutidPW.setBounds(173, 142, 116, 21);
		panel.add(inPutidPW);
		
		JLabel lb_ID = new JLabel("New label");
		lb_ID.setBounds(173, 117, 116, 15);
		lb_ID.setText(conn.getLoginUser().getId());
		panel.add(lb_ID);
		
		JLabel lbPoint = new JLabel("New label");
		lbPoint.setBounds(173, 392, 116, 15);
		panel.add(lbPoint);
		lbPoint.setText(controller.getpoint()+"");
		
		JButton btnback = new JButton("");
		btnback.setIcon(new ImageIcon(MyPageGUI2.class.getResource("/img/prev.jpg")));
		btnback.setBackground(Color.WHITE);
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnback.setBounds(12, 10, 23, 23);
		panel.add(btnback);
		
	
	}
}
