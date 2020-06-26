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

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(50, 23, 324, 40);
		lblNewLabel.setIcon(new ImageIcon(JoinGUI.class.getResource("/MainImages/joinjoin.png")));
		lblNewLabel.setForeground(new Color(255, 255, 0));
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("����ǹ��� �ѳ�ü", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblNewLabel_1_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1_1.setBounds(185, 149, 57, 15);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("\uC774\uBA54\uC77C");
		lblNewLabel_2_1_1_1_1_1.setBounds(185, 434, 57, 15);
		lblNewLabel_2_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_2_1_1_1_1_1);

		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_2_1_1_1_1.setBounds(185, 380, 57, 15);
		lblNewLabel_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_2_1_1_1_1);

		JLabel lblNewLabel_2_1_1_1 = new JLabel("\uC804\uD654\uBC88\uD638");
		lblNewLabel_2_1_1_1.setBounds(185, 329, 57, 15);
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_2_1_1_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("\uB098\uC774");
		lblNewLabel_2_1_1.setBounds(185, 271, 57, 15);
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_2_1_1);

		JLabel lblNewLabel_2_1 = new JLabel("\uC774\uB984");
		lblNewLabel_2_1.setBounds(185, 209, 57, 15);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_2_1);

		JButton btn_JoinComple = new JButton("\uAC00\uC785\uD558\uAE30");
		btn_JoinComple.setBounds(174, 496, 97, 39);
		btn_JoinComple.setFont(new Font("����ǹ��� �ѳ�ü ", Font.BOLD, 14));
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
					JOptionPane.showMessageDialog(frame, "ȸ������ ����", "ȸ������ ���", JOptionPane.PLAIN_MESSAGE);
					controller.join(joinUser);
					
				} else {
					JOptionPane.showMessageDialog(frame, "ȸ������ ����", "ȸ������ ���", JOptionPane.PLAIN_MESSAGE);

				}

			}
		});
		frame.getContentPane().add(btn_JoinComple);

		JLabel lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
		lblNewLabel_1.setBounds(185, 82, 57, 15);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_1);

		textFieldID = new JTextField();
		textFieldID.setBounds(102, 74, 218, 32);
		frame.getContentPane().add(textFieldID);
		textFieldID.setColumns(10);

		textFieldName = new JTextField();
		textFieldName.setBounds(102, 201, 218, 32);
		textFieldName.setColumns(10);
		frame.getContentPane().add(textFieldName);

		textFieldAge = new JTextField();
		textFieldAge.setBounds(102, 263, 218, 32);
		textFieldAge.setColumns(10);
		frame.getContentPane().add(textFieldAge);

		textFieldPhone = new JTextField();
		textFieldPhone.setBounds(102, 321, 218, 32);
		textFieldPhone.setColumns(10);
		frame.getContentPane().add(textFieldPhone);

		textFieldAddress = new JTextField();
		textFieldAddress.setBounds(102, 372, 218, 32);
		textFieldAddress.setColumns(10);
		frame.getContentPane().add(textFieldAddress);

		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(102, 426, 218, 32);
		textFieldEmail.setColumns(10);
		frame.getContentPane().add(textFieldEmail);

		JButton btn_idCheck = new JButton("");
		btn_idCheck.setBounds(260, 116, 21, 17);
		btn_idCheck.setIcon(new ImageIcon(JoinGUI.class.getResource("/img/check.png")));
		btn_idCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = textFieldID.getText();
				String check_id = controller.check(id);
				if (check_id.equals("")) {
					JOptionPane.showMessageDialog(frame, "��� ������ ���̵� �Դϴ�.", "���", JOptionPane.PLAIN_MESSAGE);
					id_check = 1;

				} else {
					JOptionPane.showMessageDialog(frame, "�ߺ��� ���̵� �Դϴ�.", "���", JOptionPane.PLAIN_MESSAGE);
					id_check = 0;

				}
			}
		});
		frame.getContentPane().add(btn_idCheck);

		JLabel lblNewLabel_3 = new JLabel("\uC544\uC774\uB514 \uC911\uBCF5 \uCCB4\uD06C");
		lblNewLabel_3.setBounds(145, 116, 97, 15);
		lblNewLabel_3.setForeground(Color.YELLOW);
		lblNewLabel_3.setFont(new Font("����ǹ��� �ѳ�ü Air", Font.BOLD, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_3);

		textFieldPW = new JPasswordField();
		textFieldPW.setBounds(102, 141, 218, 32);
		frame.getContentPane().add(textFieldPW);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 434, 561);
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		frame.getContentPane().add(lblNewLabel_2);

		back_btn = new JButton("");
		back_btn.setForeground(Color.YELLOW);
		back_btn.setIcon(new ImageIcon(JoinGUI.class.getResource("/MainImages/go to prev.png")));
		back_btn.setBounds(12, 10, 23, 23);
		back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginGUI log = new LoginGUI();
				frame.setVisible(false);
			}
		});
		frame.getContentPane().add(back_btn);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(0, 0, 434, 68);
		lblNewLabel_4.setIcon(new ImageIcon(JoinGUI.class.getResource("/MainImages/\uD328\uB110\uC0C9.png")));
		frame.getContentPane().add(lblNewLabel_4);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 68, 434, 493);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(JoinGUI.class.getResource("/MainImages/\uD328\uB110\uC0C9.png")));
		lblNewLabel_5.setBounds(0, 412, 434, 81);
		panel.add(lblNewLabel_5);

	}

}
