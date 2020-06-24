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
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 360, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 344, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 38, 324, 200);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 350, 324, 40);
		
		JLabel lblNewLabel = new JLabel("\uB85C\uADF8\uC778 \uBA54\uC778\uD654\uBA74(\uB85C\uACE0)");
		lblNewLabel.setBounds(0, 0, 324, 200);
		panel_1.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 396, 324, 40);
		panel_2.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 0, 105, 80);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lbl_id = new JLabel("ID");
		lbl_id.setBounds(0, 0, 105, 40);
		panel_4.add(lbl_id);
		lbl_id.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lbl_id.setHorizontalAlignment(SwingConstants.CENTER);
		
		inputID = new JTextField();
		inputID.setBounds(105, 0, 195, 40);
		panel_2.add(inputID);
		inputID.setColumns(10);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 105, 80);
		panel_3.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lbl_pw = new JLabel("PW");
		lbl_pw.setBounds(0, 0, 105, 40);
		panel_5.add(lbl_pw);
		lbl_pw.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lbl_pw.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(20, 495, 95, 40);
		panel.add(panel_6);
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setBounds(228, 495, 95, 40);
		
		inputPW = new JPasswordField();
		inputPW.setBounds(105, 0, 195, 40);
		panel_3.add(inputPW);
		panel_6.setLayout(null);
		
		JButton btn_Login = new JButton("\uB85C\uADF8\uC778");
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
					
				}else {
					JOptionPane.showMessageDialog(frame, "로그인 실패",
											"로그인 결과", JOptionPane.PLAIN_MESSAGE);
					frame.setVisible(false);
				} 
			}
			
		
		});
		btn_Login.setBounds(0, 0, 95, 40);
		panel_6.add(btn_Login);
		panel.add(panel_6_1);
		panel_6_1.setLayout(null);
		
		JButton btn_Join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_Join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JoinGUI join = new JoinGUI();
			}
		});
		btn_Join.setBounds(0, 0, 95, 40);
		panel_6_1.add(btn_Join);
		btn_Join.setFont(new Font("굴림", Font.PLAIN, 11));
		
		String path = "C:\\Users\\SMHRD\\Desktop\\이미지\\images.jpg";
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon(path));
		lblNewLabel_1.setBounds(0, 0, 324, 200);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(panel_2);
	}
}
