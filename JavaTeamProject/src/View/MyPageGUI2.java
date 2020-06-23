package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Model.MainDAO;
import Model.MemberVO;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyPageGUI2 {

	private JFrame frame;
	private JTextField inPutid;
	private JTextField inPutidPhone;
	private JTextField inPutidAddr;
	private JTextField inPutEmail;
	private JTextField inPutidName;
	private JTextField inPutidAge;
	private JTextField inPutidPW;
	MainDAO dao = new MainDAO();
	
	public MyPageGUI2() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 360, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 320, 541);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel text_NAME = new JLabel("\uC774\uB984");
		text_NAME.setHorizontalAlignment(SwingConstants.CENTER);
		text_NAME.setBounds(47, 179, 57, 15);
		panel.add(text_NAME);
		
		JLabel text_id = new JLabel("ID");
		text_id.setHorizontalAlignment(SwingConstants.CENTER);
		text_id.setBounds(47, 117, 57, 15);
		panel.add(text_id);
		
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
				
				String id = inPutid.getText();
				String pw = inPutidPW.getText();
				String name =inPutidName.getText();
				int age = Integer.parseInt(inPutidAge.getText());
				String phone =inPutidPhone.getText();
				String address =inPutidAddr.getText();
				String mail =inPutEmail.getText();
				
				MemberVO vo = new MemberVO(id, pw, name, age, phone, address, mail);
				
				
				int cnt = dao.update(vo);
				// 1이면성공 0이면 실패

				if (cnt > 0) {
					JOptionPane.showMessageDialog(frame, "수정성공", "수정 결과", JOptionPane.PLAIN_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(frame, "수정실패", "수정 결과", JOptionPane.PLAIN_MESSAGE);
				}
			
			}
		});
		btnmdfy.setBounds(47, 460, 97, 23);
		panel.add(btnmdfy);
		
		inPutid = new JTextField();
		inPutid.setColumns(10);
		inPutid.setBounds(116, 114, 116, 21);
		panel.add(inPutid);
		
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
		text_Email_1.setHorizontalAlignment(SwingConstants.CENTER);
		text_Email_1.setBounds(47, 392, 57, 15);
		panel.add(text_Email_1);
		
		JButton btnNewButton = new JButton("\uAD00\uB9AC");
		btnNewButton.setBounds(244, 385, 64, 28);
		panel.add(btnNewButton);
		
		inPutidName = new JTextField();
		inPutidName.setColumns(10);
		inPutidName.setBounds(116, 176, 116, 21);
		panel.add(inPutidName);
		
		inPutidAge = new JTextField();
		inPutidAge.setColumns(10);
		inPutidAge.setBounds(116, 216, 116, 21);
		panel.add(inPutidAge);
		
		JLabel lblNewLabel = new JLabel("\uB098\uC774");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(47, 219, 57, 15);
		panel.add(lblNewLabel);
		
		JLabel lb_point = new JLabel("New label");
		lb_point.setBounds(114, 392, 118, 15);
		panel.add(lb_point);
		
		JButton btnmdfy_1 = new JButton("\uD655\uC778");
		btnmdfy_1.setBounds(166, 460, 97, 23);
		panel.add(btnmdfy_1);
		
		JLabel text_NAME_1 = new JLabel("PW");
		text_NAME_1.setHorizontalAlignment(SwingConstants.CENTER);
		text_NAME_1.setBounds(47, 145, 57, 15);
		panel.add(text_NAME_1);
		
		inPutidPW = new JTextField();
		inPutidPW.setColumns(10);
		inPutidPW.setBounds(116, 142, 116, 21);
		panel.add(inPutidPW);
	}

}
