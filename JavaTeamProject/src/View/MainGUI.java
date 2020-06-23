package View;

import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Controller.MainSystemCon;
import Model.MainDAO;

public class MainGUI {

	private JFrame frame;
	private JTextField textField;
	private JButton btnMyPage;
	private JButton btnteam;
	private JButton btnBadMinton;
	private JButton btnFutSal;
	private JButton btnBaseBall;
	private JButton btnjokgu;
	private JButton btnSoccer;
	public static MainSystemCon con = new MainSystemCon();
	MainDAO dao = new MainDAO();
	
	public MainGUI() {
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
		
	
		
		
		btnSoccer = new JButton("\uCD95\uAD6C");
		btnSoccer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			}
		});
		btnSoccer.setBounds(38, 131, 68, 67);
		panel.add(btnSoccer);
		
		btnjokgu = new JButton("\uC871\uAD6C");
		btnjokgu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnjokgu.setBounds(118, 131, 68, 67);
		panel.add(btnjokgu);
		
		btnBaseBall = new JButton("\uC57C\uAD6C");
		btnBaseBall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			
			
			
			
			}
		});
		btnBaseBall.setBounds(198, 131, 68, 67);
		panel.add(btnBaseBall);
		
		btnFutSal = new JButton("\uD48B\uC0B4");
		btnFutSal.setBounds(78, 208, 68, 67);
		panel.add(btnFutSal);
		
		btnBadMinton = new JButton("\uBC30\uB4DC\uBBFC\uD134");
		btnBadMinton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBadMinton.setBounds(162, 208, 104, 67);
		panel.add(btnBadMinton);
		
		btnteam = new JButton("\uD300 \uAD6C\uD558\uAE30");
		btnteam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MatchingGUI matching = new MatchingGUI();
			}
		});
		btnteam.setBounds(103, 352, 112, 67);
		panel.add(btnteam);
		
		btnMyPage = new JButton("My Page");
		btnMyPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//마이페이지 클릭시
				MyPageGUI MyPage = new MyPageGUI();
			
			}
		});
		btnMyPage.setBounds(211, 98, 97, 23);
		panel.add(btnMyPage);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("\uD558\uB791\uAED8");
		textField.setBounds(12, 10, 296, 49);
		panel.add(textField);
		textField.setColumns(10);
	}
}
