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
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\SMHRD\\Desktop\\image\\frame.jpg"));
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
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SMHRD\\Desktop\\33.png"));
		lblNewLabel_1.setBounds(110, 132, 207, 63);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SMHRD\\Desktop\\22.png"));
		lblNewLabel.setBounds(20, 43, 108, 79);
		panel.add(lblNewLabel);
		
		inputPW = new JPasswordField();
		inputPW.setBounds(272, 258, 150, 30);
		panel.add(inputPW);
		
		JLabel lbl_id = new JLabel("ID");
		lbl_id.setBounds(182, 219, 118, 29);
		panel.add(lbl_id);
		lbl_id.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_id.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		
		inputID = new JTextField();
		inputID.setToolTipText("");
		inputID.setBounds(272, 218, 150, 30);
		panel.add(inputID);
		inputID.setColumns(10);
		
		JButton btn_Join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_Join.setForeground(new Color(255, 255, 255));
		btn_Join.setBackground(new Color(135, 206, 250));
		btn_Join.setBounds(296, 526, 80, 30);
		panel.add(btn_Join);
		btn_Join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JoinGUI join = new JoinGUI();
			}
		});
		btn_Join.setFont(new Font("굴림", Font.PLAIN, 11));
		
		
		
		JButton btn_Login = new JButton("\uB85C\uADF8\uC778");
		btn_Login.setBounds(59, 526, 80, 30);
		panel.add(btn_Login);
		btn_Login.setFont(new Font("한컴 고딕", Font.BOLD, 12));
		btn_Login.setForeground(new Color(255, 255, 255));
		btn_Login.setBackground(new Color(135, 206, 250));
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
				}
			}
			
		
		});
		
		JLabel lbl_pw = new JLabel("PW");
		lbl_pw.setBounds(182, 258, 117, 30);
		panel.add(lbl_pw);
		lbl_pw.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lbl_pw.setHorizontalAlignment(SwingConstants.CENTER);
		
		String path = "C:\\Users\\SMHRD\\Desktop\\image\\login.jpg";
		
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon(path));
		lblNewLabel_2.setBounds(20, 446, 95, 40);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\SMHRD\\Desktop\\real1.jpg"));
		lblNewLabel_3.setBounds(0, 25, 434, 561);
		panel.add(lblNewLabel_3);
	}
}
