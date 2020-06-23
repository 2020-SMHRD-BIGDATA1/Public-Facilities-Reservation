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
		panel.setBounds(12, 10, 320, 541);
		frame.getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JPanel panel_1 = new JPanel();
		sl_panel.putConstraint(SpringLayout.NORTH, panel_1, 38, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_1, -323, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_1, -10, SpringLayout.EAST, panel);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		sl_panel.putConstraint(SpringLayout.NORTH, panel_2, 72, SpringLayout.SOUTH, panel_1);
		sl_panel.putConstraint(SpringLayout.WEST, panel_2, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_2, -171, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_2, -10, SpringLayout.EAST, panel);
		
		JLabel lblNewLabel = new JLabel("\uB85C\uADF8\uC778 \uBA54\uC778\uD654\uBA74(\uB85C\uACE0)");
		lblNewLabel.setBounds(0, 0, 300, 180);
		panel_1.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		sl_panel.putConstraint(SpringLayout.NORTH, panel_3, 19, SpringLayout.SOUTH, panel_2);
		sl_panel.putConstraint(SpringLayout.WEST, panel_3, 0, SpringLayout.WEST, panel_1);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_3, 99, SpringLayout.SOUTH, panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 0, 105, 80);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lbl_id = new JLabel("ID");
		lbl_id.setBounds(0, 0, 105, 80);
		panel_4.add(lbl_id);
		lbl_id.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lbl_id.setHorizontalAlignment(SwingConstants.CENTER);
		
		inputID = new JTextField();
		inputID.setBounds(105, 0, 195, 80);
		panel_2.add(inputID);
		inputID.setColumns(10);
		sl_panel.putConstraint(SpringLayout.EAST, panel_3, 0, SpringLayout.EAST, panel_1);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 105, 80);
		panel_3.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lbl_pw = new JLabel("PW");
		lbl_pw.setBounds(0, 0, 105, 80);
		panel_5.add(lbl_pw);
		lbl_pw.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lbl_pw.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_6 = new JPanel();
		sl_panel.putConstraint(SpringLayout.NORTH, panel_6, 6, SpringLayout.SOUTH, panel_3);
		sl_panel.putConstraint(SpringLayout.WEST, panel_6, 20, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_6, 46, SpringLayout.SOUTH, panel_3);
		sl_panel.putConstraint(SpringLayout.EAST, panel_6, 115, SpringLayout.WEST, panel);
		panel.add(panel_6);
		
		JPanel panel_6_1 = new JPanel();
		sl_panel.putConstraint(SpringLayout.NORTH, panel_6_1, 6, SpringLayout.SOUTH, panel_3);
		
		inputPW = new JPasswordField();
		inputPW.setBounds(105, 0, 195, 80);
		panel_3.add(inputPW);
		sl_panel.putConstraint(SpringLayout.WEST, panel_6_1, -116, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_6_1, -26, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_6_1, -21, SpringLayout.EAST, panel);
		panel_6.setLayout(null);
		
		JButton btn_Login = new JButton("\uB85C\uADF8\uC778");
		btn_Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = inputID.getText();
				String pw = String.valueOf(inputPW.getPassword());
				MemberVO user = new MemberVO(id, pw);
				boolean isSuccess = controller.login(user);
				
				if(isSuccess == true) {
					JOptionPane.showMessageDialog(frame, "로그인 성공",
											"로그인 결과", JOptionPane.PLAIN_MESSAGE);
					MainGUI mainGUI = new MainGUI();
					frame.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(frame, "로그인 실패",
											"로그인 결과", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		btn_Login.setBounds(0, 0, 95, 40);
		panel_6.add(btn_Login);
		sl_panel.putConstraint(SpringLayout.WEST, btn_Login, 31, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btn_Login, -4, SpringLayout.NORTH, panel_2);
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
		sl_panel.putConstraint(SpringLayout.WEST, btn_Join, 224, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btn_Join, -11, SpringLayout.NORTH, panel_2);
		btn_Join.setFont(new Font("굴림", Font.PLAIN, 11));
	}
}
