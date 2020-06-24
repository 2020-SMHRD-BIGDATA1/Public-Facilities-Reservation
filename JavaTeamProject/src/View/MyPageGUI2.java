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
		frame.setBounds(100, 100, 360, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 320, 541);
		panel.setBackground(new Color(255,0,0,0));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel text_NAME = new JLabel("\uC774\uB984");
		text_NAME.setFont(new Font("����", Font.BOLD, 12));
		text_NAME.setHorizontalAlignment(SwingConstants.CENTER);
		text_NAME.setBounds(47, 179, 57, 15);
		panel.add(text_NAME);
		
		JLabel text_id = new JLabel("ID");
		text_id.setFont(new Font("����", Font.BOLD, 12));
		text_id.setHorizontalAlignment(SwingConstants.CENTER);
		text_id.setBounds(47, 117, 57, 15);
		panel.add(text_id);
		
		JLabel text_phone = new JLabel("\uC804\uD654\uBC88\uD638");
		text_phone.setFont(new Font("����", Font.BOLD, 12));
		text_phone.setHorizontalAlignment(SwingConstants.CENTER);
		text_phone.setBounds(47, 262, 57, 15);
		panel.add(text_phone);
		
		JLabel text_addr = new JLabel("\uC8FC\uC18C");
		text_addr.setFont(new Font("����", Font.BOLD, 12));
		text_addr.setHorizontalAlignment(SwingConstants.CENTER);
		text_addr.setBounds(47, 304, 57, 15);
		panel.add(text_addr);
		
		JLabel text_Email = new JLabel("\uC774\uBA54\uC77C");
		text_Email.setFont(new Font("����", Font.BOLD, 12));
		text_Email.setHorizontalAlignment(SwingConstants.CENTER);
		text_Email.setBounds(47, 351, 57, 15);
		panel.add(text_Email);
		
		JLabel lblNewLabel_2 = new JLabel("My Page");
		lblNewLabel_2.setFont(new Font("����", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(12, 10, 296, 56);
		panel.add(lblNewLabel_2);
		
		JButton btnmdfy = new JButton("\uC218\uC815");
		btnmdfy.setBackground(Color.WHITE);
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
				// 1�̸鼺�� 0�̸� ����

				if (cnt > 0) {
					JOptionPane.showMessageDialog(frame, "��������", "���� ���", JOptionPane.PLAIN_MESSAGE);
					frame.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(frame, "��������", "���� ���", JOptionPane.PLAIN_MESSAGE);
				}
			
			}
		});
		btnmdfy.setBounds(63, 461, 66, 39);
		panel.add(btnmdfy);

		inPutidPhone = new JTextField();
		inPutidPhone.setColumns(10);
		inPutidPhone.setBounds(116, 259, 116, 21);
		panel.add(inPutidPhone);
		
		inPutidAddr = new JTextField();
		inPutidAddr.setColumns(10);
		inPutidAddr.setBounds(116, 301, 116, 21);
		panel.add(inPutidAddr);
		
		inPutEmail = new JTextField();
		inPutEmail.setColumns(10);
		inPutEmail.setBounds(116, 348, 116, 21);
		panel.add(inPutEmail);
		
		JLabel text_Email_1 = new JLabel("\uD3EC\uC778\uD2B8");
		text_Email_1.setFont(new Font("����", Font.BOLD, 12));
		text_Email_1.setHorizontalAlignment(SwingConstants.CENTER);
		text_Email_1.setBounds(47, 392, 57, 15);
		panel.add(text_Email_1);
		
		inPutidName = new JTextField();
		inPutidName.setColumns(10);
		inPutidName.setBounds(116, 176, 116, 21);
		panel.add(inPutidName);
		
		inPutidAge = new JTextField();
		inPutidAge.setColumns(10);
		inPutidAge.setBounds(116, 216, 116, 21);
		panel.add(inPutidAge);
		
		JLabel lblNewLabel = new JLabel("\uB098\uC774");
		lblNewLabel.setFont(new Font("����", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(47, 219, 57, 15);
		panel.add(lblNewLabel);
		
		JButton btnmdfy_1 = new JButton("\uD655\uC778");
		btnmdfy_1.setBackground(Color.WHITE);
		btnmdfy_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				
			
			}
		});
		btnmdfy_1.setBounds(182, 461, 66, 39);
		panel.add(btnmdfy_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SMHRD\\Desktop\\\uC9C0\uD6C8\uC774\uC640\uBCF4\uB77C\uB124\\\uC0AC\uC9C4\\[\uD06C\uAE30\uBCC0\uD658]\uC0AC\uBCF8 -\uBA54\uC778 \uBC30\uACBD\uD654\uBA74.png"));
		lblNewLabel_1.setBounds(0, 0, 344, 561);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel text_NAME_1 = new JLabel("PW");
		text_NAME_1.setFont(new Font("����", Font.BOLD, 12));
		text_NAME_1.setHorizontalAlignment(SwingConstants.CENTER);
		text_NAME_1.setBounds(47, 145, 57, 15);
		panel.add(text_NAME_1);
		
		inPutidPW = new JTextField();
		inPutidPW.setColumns(10);
		inPutidPW.setBounds(116, 142, 116, 21);
		panel.add(inPutidPW);
		
		JLabel lb_ID = new JLabel("New label");
		lb_ID.setBounds(116, 117, 116, 15);
		lb_ID.setText(conn.getLoginUser().getId());
		panel.add(lb_ID);
		
		JLabel lbPoint = new JLabel("New label");
		lbPoint.setBounds(116, 392, 116, 15);
		panel.add(lbPoint);
		lbPoint.setText(controller.getpoint()+"");
		
		JButton btnback = new JButton("");
		btnback.setIcon(new ImageIcon("C:\\Users\\SMHRD\\Desktop\\\uC9C0\uD6C8\uC774\uC640\uBCF4\uB77C\uB124\\\uC0AC\uC9C4\\[\uD06C\uAE30\uBCC0\uD658]\uB4A4\uB85C\uAC00\uAE30 \uCC10\uCC10.PNG"));
		btnback.setBackground(Color.WHITE);
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnback.setBounds(0, 20, 27, 28);
		panel.add(btnback);
		
	
	}
}
