package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Controller.MemberManagementSystem;
import Model.MemberVO;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Toolkit;

public class LoginGUI {
	
	private JFrame frame;
	private JTextField inputID;
	private JPasswordField inputPW;
	private JButton btnLogin;
	private JButton btnJoin;
	public static MemberManagementSystem controller = new MemberManagementSystem();
	MemberVO user1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI window = new LoginGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginGUI() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(LoginGUI.class.getResource("/img/frame.jpg")));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(500, 500, 450, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, -25, 434, 586);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(LoginGUI.class.getResource("/img/proname.png")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(124, 107, 241, 102);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(LoginGUI.class.getResource("/img/GJLogo.png")));
		lblNewLabel.setBounds(12, 41, 119, 80);
		panel.add(lblNewLabel);

		inputPW = new JPasswordField();
		inputPW.setBounds(272, 258, 150, 30);
		panel.add(inputPW);

		JLabel lbl_id = new JLabel("ID");
		lbl_id.setBounds(182, 219, 118, 29);
		panel.add(lbl_id);
		lbl_id.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_id.setFont(new Font("배달의민족 한나체", Font.BOLD,25));
		
		inputID = new JTextField();
		inputID.setToolTipText("");
		inputID.setBounds(272, 218, 150, 30);
		panel.add(inputID);
		inputID.setColumns(10);

		JButton btn_Join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_Join.setForeground(new Color(255, 255, 255));
		btn_Join.setBackground(new Color(135, 206, 250));
		btn_Join.setFont(new Font("배달의민족 한나체 ", Font.BOLD,15));
		btn_Join.setBounds(283, 526, 102, 30);
		panel.add(btn_Join);
		btn_Join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				frame.dispose();
				JoinGUI join = new JoinGUI();
			}
		});

		JButton btn_Login = new JButton("\uB85C\uADF8\uC778");
		btn_Login.setBounds(59, 526, 102, 30);
		panel.add(btn_Login);
		btn_Login.setForeground(new Color(255, 255, 255));
		btn_Login.setBackground(new Color(135, 206, 250));
		btn_Login.setFont(new Font("배달의민족 한나체 ", Font.BOLD,15));
		btn_Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = inputID.getText();
				String pw = String.valueOf(inputPW.getPassword());
				MemberVO user = new MemberVO(id, pw);
				MemberVO user1 = user;
				boolean isSuccess = controller.login(user);

				if (isSuccess == true) {
					JOptionPane.showMessageDialog(frame, "로그인 성공", "로그인 결과", JOptionPane.PLAIN_MESSAGE);
					MainGUI mainGUI = new MainGUI();	
					frame.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(frame, "로그인 실패", "로그인 결과", JOptionPane.PLAIN_MESSAGE);
					frame.setVisible(true);

				}
			}

		});

		JLabel lbl_pw = new JLabel("PW");
		lbl_pw.setBounds(182, 258, 117, 30);
		panel.add(lbl_pw);
		lbl_pw.setFont(new Font("배달의민족 한나체 ", Font.BOLD,25));
		lbl_pw.setHorizontalAlignment(SwingConstants.CENTER);

		

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(LoginGUI.class.getResource("/img/login.jpg")));
		lblNewLabel_3.setBounds(0, 25, 434, 561);
		panel.add(lblNewLabel_3);
	}
}
