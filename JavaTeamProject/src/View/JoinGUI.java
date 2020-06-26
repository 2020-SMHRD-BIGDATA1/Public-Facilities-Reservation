package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Controller.MemberManagementSystem;
import Model.MemberVO;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;

public class JoinGUI {

	private JFrame frame;
	private JTextField textFieldID;
	private JPasswordField textFieldPW;
	private JTextField textFieldName;
	private JTextField textFieldAge;
	private JTextField textFieldPhone;
	private JTextField textFieldAddress;
	private JTextField textFieldEmail;
	private MemberManagementSystem controller = LoginGUI.controller;
	private int id_check = 0;
	private JButton back_btn;

	/**
	 * Launch the application.
	 */
	public JoinGUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(JoinGUI.class.getResource("/img/frame.jpg")));
		frame.setBounds(500, 500, 450, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setBounds(50, 23, 324, 40);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("배달의민족 한나체", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblNewLabel_1_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(185, 149, 57, 15);
		frame.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("\uC774\uBA54\uC77C");
		lblNewLabel_2_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1_1.setBounds(185, 434, 57, 15);
		frame.getContentPane().add(lblNewLabel_2_1_1_1_1_1);

		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1.setBounds(185, 380, 57, 15);
		frame.getContentPane().add(lblNewLabel_2_1_1_1_1);

		JLabel lblNewLabel_2_1_1_1 = new JLabel("\uC804\uD654\uBC88\uD638");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setBounds(185, 329, 57, 15);
		frame.getContentPane().add(lblNewLabel_2_1_1_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("\uB098\uC774");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setBounds(185, 271, 57, 15);
		frame.getContentPane().add(lblNewLabel_2_1_1);

		JLabel lblNewLabel_2_1 = new JLabel("\uC774\uB984");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(185, 209, 57, 15);
		frame.getContentPane().add(lblNewLabel_2_1);

		JButton btn_JoinComple = new JButton("\uAC00\uC785\uD558\uAE30");
		btn_JoinComple.setFont(new Font("배달의민족 한나체 ", Font.BOLD, 14));
		btn_JoinComple.setForeground(new Color(0, 0, 0));
		btn_JoinComple.setBackground(new Color(255, 255, 255));
		btn_JoinComple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = textFieldID.getText();
				String pw = textFieldPW.getText();
				String name = textFieldName.getText();
				int age = Integer.parseInt(textFieldAge.getText());
				String phone = textFieldPhone.getText();
				String address = textFieldAddress.getText();
				String mail = textFieldEmail.getText();
				MemberVO joinUser = new MemberVO(id, pw, name, age, phone, address, mail);
				if (id_check == 1) {
					JOptionPane.showMessageDialog(frame, "회원가입 성공", "회원가입 결과", JOptionPane.PLAIN_MESSAGE);
					controller.join(joinUser);
					frame.dispose();
				} else {
					JOptionPane.showMessageDialog(frame, "회원가입 실패", "회원가입 결과", JOptionPane.PLAIN_MESSAGE);

				}

			}
		});
		btn_JoinComple.setBounds(174, 496, 97, 39);
		frame.getContentPane().add(btn_JoinComple);

		JLabel lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(185, 82, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);

		textFieldID = new JTextField();
		textFieldID.setBounds(102, 74, 218, 32);
		frame.getContentPane().add(textFieldID);
		textFieldID.setColumns(10);

		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		textFieldName.setBounds(102, 201, 218, 32);
		frame.getContentPane().add(textFieldName);

		textFieldAge = new JTextField();
		textFieldAge.setColumns(10);
		textFieldAge.setBounds(102, 263, 218, 32);
		frame.getContentPane().add(textFieldAge);

		textFieldPhone = new JTextField();
		textFieldPhone.setColumns(10);
		textFieldPhone.setBounds(102, 321, 218, 32);
		frame.getContentPane().add(textFieldPhone);

		textFieldAddress = new JTextField();
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(102, 372, 218, 32);
		frame.getContentPane().add(textFieldAddress);

		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(102, 426, 218, 32);
		frame.getContentPane().add(textFieldEmail);

		JButton btn_idCheck = new JButton("");
		btn_idCheck.setIcon(new ImageIcon(JoinGUI.class.getResource("/img/check.png")));
		btn_idCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = textFieldID.getText();
				String check_id = controller.check(id);
				if (check_id.equals("")) {
					JOptionPane.showMessageDialog(frame, "사용 가능한 아이디 입니다.", "결과", JOptionPane.PLAIN_MESSAGE);
					id_check = 1;
					
				} else {
					JOptionPane.showMessageDialog(frame, "중복된 아이디 입니다.", "결과", JOptionPane.PLAIN_MESSAGE);
					id_check = 0;

				}
			}
		});
		btn_idCheck.setBounds(260, 116, 21, 17);
		frame.getContentPane().add(btn_idCheck);

		JLabel lblNewLabel_3 = new JLabel("\uC544\uC774\uB514 \uC911\uBCF5 \uCCB4\uD06C");
		lblNewLabel_3.setForeground(Color.YELLOW);
		lblNewLabel_3.setFont(new Font("배달의민족 한나체 Air", Font.BOLD, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(145, 116, 97, 15);
		frame.getContentPane().add(lblNewLabel_3);

		textFieldPW = new JPasswordField();
		textFieldPW.setBounds(102, 141, 218, 32);
		frame.getContentPane().add(textFieldPW);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\SMHRD\\Desktop\\frame2.jpg"));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(0, 0, 434, 561);
		frame.getContentPane().add(lblNewLabel_2);

		back_btn = new JButton("");
		back_btn.setIcon(new ImageIcon(JoinGUI.class.getResource("/img/prev.jpg")));
		back_btn.setBounds(12, 10, 23, 23);
		back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginGUI log = new LoginGUI();
				frame.setVisible(false);
			}
		});
		frame.getContentPane().add(back_btn);

	}

}
