package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Model.MainVO;
import model.MemberVO;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyPageGUI {

	private JFrame frame;
	private JTextField inPutName;
	private JTextField inPutID;
	private JTextField inPutPW;
	private JTextField inPutPhone;
	private JTextField inPutaddr;
	private JTextField inPutEmail;
	private JTextField inPutPoint;

	
	public MyPageGUI() {
		initialize();
		frame.setVisible(true);
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 360, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 320, 541);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel text_Name = new JLabel("\uC774\uB984");
		text_Name.setHorizontalAlignment(SwingConstants.CENTER);
		text_Name.setBounds(47, 117, 57, 15);
		panel.add(text_Name);
		
		JLabel text_id = new JLabel("ID");
		text_id.setHorizontalAlignment(SwingConstants.CENTER);
		text_id.setBounds(47, 159, 57, 15);
		panel.add(text_id);
		
		JLabel text_PW = new JLabel("PW");
		text_PW.setHorizontalAlignment(SwingConstants.CENTER);
		text_PW.setBounds(47, 212, 57, 15);
		panel.add(text_PW);
		
		JLabel text_phone = new JLabel("\uC804\uD654\uBC88\uD638");
		text_phone.setHorizontalAlignment(SwingConstants.CENTER);
		text_phone.setBounds(47, 262, 57, 15);
		panel.add(text_phone);
		
		JLabel text_addr = new JLabel("\uC8FC\uC18C");
		text_addr.setHorizontalAlignment(SwingConstants.CENTER);
		text_addr.setBounds(47, 304, 57, 15);
		panel.add(text_addr);
		
		JLabel text_Email = new JLabel("\uC774\uBA54\uC77C");
		text_Email.setHorizontalAlignment(SwingConstants.CENTER);
		text_Email.setBounds(47, 351, 57, 15);
		panel.add(text_Email);
		
		JLabel lblNewLabel_2 = new JLabel("My Page");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(12, 10, 296, 56);
		panel.add(lblNewLabel_2);
		
		JButton btnmdfy = new JButton("\uC218\uC815");
		btnmdfy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 회원정보 수정
				
				MainVO vo = new MainVO(name,id,pW,addr,phone,point);
				String name = inPutName.getText();
				String id = inPutID.getText();
				String pw = inPutPW.getText();
				String addr = inPutaddr.getText();
				String phone = inPutPhone.getText();
				String point = inPutPoint.getText();
				
			

				
			
			
			}
		});
		btnmdfy.setBounds(122, 456, 97, 23);
		panel.add(btnmdfy);
		
		inPutName = new JTextField();
		inPutName.setBounds(116, 114, 116, 21);
		panel.add(inPutName);
		inPutName.setColumns(10);
		
		inPutID = new JTextField();
		inPutID.setColumns(10);
		inPutID.setBounds(116, 156, 116, 21);
		panel.add(inPutID);
		
		inPutPW = new JTextField();
		inPutPW.setColumns(10);
		inPutPW.setBounds(116, 209, 116, 21);
		panel.add(inPutPW);
		
		inPutPhone = new JTextField();
		inPutPhone.setColumns(10);
		inPutPhone.setBounds(116, 259, 116, 21);
		panel.add(inPutPhone);
		
		inPutaddr = new JTextField();
		inPutaddr.setColumns(10);
		inPutaddr.setBounds(116, 301, 116, 21);
		panel.add(inPutaddr);
		
		inPutEmail = new JTextField();
		inPutEmail.setColumns(10);
		inPutEmail.setBounds(116, 348, 116, 21);
		panel.add(inPutEmail);
		
		JLabel text_Email_1 = new JLabel("\uD3EC\uC778\uD2B8");
		text_Email_1.setHorizontalAlignment(SwingConstants.CENTER);
		text_Email_1.setBounds(47, 392, 57, 15);
		panel.add(text_Email_1);
		
		inPutPoint = new JTextField();
		inPutPoint.setColumns(10);
		inPutPoint.setBounds(116, 389, 116, 21);
		panel.add(inPutPoint);
		
		JButton btnNewButton = new JButton("\uAD00\uB9AC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			
			}
		});
		btnNewButton.setBounds(244, 385, 64, 28);
		panel.add(btnNewButton);
	}
}
